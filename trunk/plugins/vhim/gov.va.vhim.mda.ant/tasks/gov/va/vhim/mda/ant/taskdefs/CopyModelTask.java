package gov.va.vhim.mda.ant.taskdefs;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.tools.ant.BuildException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLUtil;

public class CopyModelTask extends VHIMBaseTask {

	private File toDir = null;
	
	private File toFile = null;

	private class CopyFragments extends VHIMBaseTask.MDASwitch {

		org.apache.tools.ant.taskdefs.Copy copyTask;

		URI modelURI = null;

		public CopyFragments() {
			super();

			this.copyTask = new org.apache.tools.ant.taskdefs.Copy();

			copyTask.setFile(getModelProperty());

			// If we are copying to a file or a directory based on the ant build
			if (toFile != null)
			{
				copyTask.setTofile(toFile);	
			} else
			{
				copyTask.setTodir(toDir);
			}
			
			copyTask.setProject(getProject());

			copyTask.setOverwrite(true);

			copyTask.setVerbose(true);

			copyTask.setDescription(getDescription());

			copyTask.setOwningTarget(getOwningTarget());
			
		}

		@Override
		public Object casePackage(Package pckge) {

			// Check to see if we already copied the model file
			if (!pckge.eResource().getURI().equals(modelURI)) {
								
				copyTask.setFile(new File(pckge.eResource().getURI()
						.toFileString()));

				copyTask.execute();
			}

			// First URI is the model file URI
			// If this chnages - will need to push URI to map and 
			// check to see if we copied already
			if (modelURI == null) {
				modelURI = pckge.eResource().getURI();
			}

			return pckge;
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public void execute() throws BuildException {

		// Set the vebosity level of the logging
		setVerbosity();

		informational("Start Copy Model execute");

		try {

			// Execute the switch but do not save the model
			executeSwitch(new CopyFragments(), false);
			
			renameTargetModel();

		} catch (Throwable t) {

			error("Exception in during Copy Model execute " + t.getMessage());

			t.printStackTrace();
			throw new BuildException(t);
		}

		debug("End Copy Model execute");

	}

	public void setToDir(File toDir) {
		this.toDir = toDir;
	}
	
	public void setToFile(File toDir) {
		this.toFile = toDir;
	}
	
	private void renameTargetModel()
	{
	
			Model model = null;
		
//			String modelPath = "";
			
//			if (this.modelProperty != null)
//			{
//				modelPath = this.modelProperty.getAbsolutePath();
//			}

			debug("Start UML Model from " );

			// TODO - SWM Add better checking of parameters.
//			if (model == null && this.modelProperty != null) {

			   ResourceSet resourceSet = new ResourceSetImpl();
				resourceSet.getLoadOptions().put(
						XMIResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);

				resourceSet.getLoadOptions().put(
						XMIResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.FALSE);

				resourceSet.getLoadOptions().put(
						XMIResource.OPTION_DEFER_ATTACHMENT, Boolean.FALSE);

				if (toFile != null)
				{
				model = (Model) UMLUtil.load(resourceSet, URI
						.createFileURI(toFile.getAbsolutePath()), UMLPackage.Literals.MODEL);
				}
				if (model != null) {

					try {
						Map<String, String> options = new HashMap<String, String>();

						model.setName("PSM");
						
						model.eResource().save(options);

					} catch (IOException e) {
						throw new BuildException(e);
					}
				}

				informational("VHIMBaseTask opened UML Model " );
//			}

			debug("End UML Model from " );

	
	}

}
