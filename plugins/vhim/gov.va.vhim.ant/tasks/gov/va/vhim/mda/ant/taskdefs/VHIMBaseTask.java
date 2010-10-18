package gov.va.vhim.mda.ant.taskdefs;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.BuildListener;
import org.apache.tools.ant.BuildLogger;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.Task;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.eclipse.uml2.uml.util.UMLUtil;

public class VHIMBaseTask extends Task {

	public void debug(String message) {
		log(message, Project.MSG_DEBUG);
	};

	public void verbose(String message) {
		log(message, Project.MSG_VERBOSE);
	};

	public void informational(String message) {
		log(message, Project.MSG_INFO);
	};

	public void error(String message) {
		log(message, Project.MSG_ERR);
	};

	public void warning(String message) {
		log(message, Project.MSG_WARN);
	};

	Object getStereotypeValue(Element element, String stereoType,
			String attribute) {

		Object object = null;

		debug("getStereotypeValue " + stereoType + " : " + attribute);

		Stereotype st = element.getAppliedStereotype(stereoType);

		debug("getAppliedStereotype");
		
		if (st != null) {
			
			debug("getAppliedStereotype not null "+st.getName());
			
			debug("getAppliedStereotype not null "+attribute);
			
			
			object = element.getValue(st, attribute);

			debug("Object element.getValue");

			if (object != null)
			{
				debug("Object element.getValue " + object.toString());
			} else
			{
				debug("Object element.getValue is null");
			}
			
		} else {
			debug("getStereotypeValue : " + stereoType + " not applied");
		}

		if (object == null) {
			debug("getStereotypeValue : value is null " + stereoType + "::"
					+ attribute);
		}
		return object;
	}

	class MDASwitch extends UMLSwitch {

	}

	@SuppressWarnings("unused")
	private File modelProperty;


	private class LoadFragments extends VHIMBaseTask.MDASwitch {
		public boolean isPackage = false;

		@Override
		public Object casePackage(Package pckge) {

			informational("Loading Fragment " + pckge.getLabel());
			isPackage = true;
			return super.casePackage(pckge);
		}

	}


	

	@SuppressWarnings("unused")
	public void applySwitch(Model model, UMLSwitch umlSwitch) {
		for (TreeIterator iterator = EcoreUtil.getAllContents(Collections
				.singletonList(getUMLModel())); iterator.hasNext();) {
			EObject child = (EObject) iterator.next();
			if (umlSwitch != null) {
				umlSwitch.doSwitch(child);
			}
		}

	}

	public void setModel(File model) {
		this.modelProperty = model;
	}

	String level;

	// default logging to informational for build
	int logLevel = Project.MSG_INFO;

	public int getLogLevel() {
		return logLevel;
	}

	public void setLogLevel(int logLevel) {
		this.logLevel = logLevel;
	}

	public void setLevel(String level) {
		this.level = level;

		if ("debug".equalsIgnoreCase(this.level)) {
			logLevel = Project.MSG_DEBUG;
		} else if ("informational".equalsIgnoreCase(this.level)) {
			logLevel = Project.MSG_INFO;
		} else if ("warn".equalsIgnoreCase(this.level)) {
			logLevel = Project.MSG_WARN;
		} else if ("error".equalsIgnoreCase(this.level)) {
			logLevel = Project.MSG_ERR;
		} else {
			logLevel = Project.MSG_INFO;
		}

	}

	public void setVerbosity() {
		Vector listeners = this.getProject().getBuildListeners();
		for (Iterator i = listeners.iterator(); i.hasNext();) {
			BuildListener listener = (BuildListener) i.next();

			if (listener instanceof BuildLogger) {
				BuildLogger logger = (BuildLogger) listener;
				logger.setMessageOutputLevel(logLevel);
			}
		}

	}

	public File getModelProperty() {
		return this.modelProperty;
	}

	/**
	 * model is the targeted uml model TODO: SWM - static might not be the best
	 * approach to share model across tasks.
	 * 
	 */
	private Model model = null;

	protected Model getUMLModel() {
		return model;
	}
	
	protected void setUMLModel(Model model)
	{
		this.model = model;	
	}

	@SuppressWarnings("unchecked")
	void loadUMLModel() {
		
		String modelPath = "";
		
		if (this.modelProperty != null)
		{
			modelPath = this.modelProperty.getAbsolutePath();
		}

		debug("Start UML Model from " + modelPath);

		// TODO - SWM Add better checking of parameters.
		if (model == null && this.modelProperty != null) {
			
			
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getLoadOptions().put(
					XMIResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);

			resourceSet.getLoadOptions().put(
					XMIResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.FALSE);

			resourceSet.getLoadOptions().put(
					XMIResource.OPTION_DEFER_ATTACHMENT, Boolean.FALSE);

			model = (Model) UMLUtil.load(resourceSet, URI
					.createFileURI(modelPath), UMLPackage.Literals.MODEL);

			if (model != null) {

				LoadFragments lf = new LoadFragments();
				for (Iterator iter = model.getPackagedElements().iterator(); iter
						.hasNext();) {

					org.eclipse.uml2.uml.Element e = (org.eclipse.uml2.uml.Element) iter
							.next();
					lf.doSwitch(e);
					if (lf.isPackage) {
						EcoreUtil.resolve(e, model);
					}
					lf.isPackage = false;
				}
			}

			informational("VHIMBaseTask opened UML Model " + modelPath);
		}

		debug("End UML Model from " + modelPath);

	}

	/**
	 * getType takes in a qualified type name and returns type TODO: OHT (d
	 * Carlson) had something similar need to use if possible returns null if
	 * not found
	 * 
	 * @param typeName
	 * @return
	 */
	public Type getType(String typeName) {

		debug("getType " + typeName);
		
		Type type = null;

		// Find in main model
		Collection elements = org.eclipse.uml2.uml.util.UMLUtil
				.findNamedElements(model.eResource(), typeName);

		if (elements.iterator().hasNext()) {
			type = (Type) elements.iterator().next();
			debug("found " + type.getName());
		} else // search imported models
		{
			for (Object object : model.getImportedPackages()) {
				Model m = (Model) object;

				// Rose model seem have no eresource and caused an exception
				if (m.eResource() != null) {
					elements = org.eclipse.uml2.uml.util.UMLUtil
							.findNamedElements(m.eResource(), typeName);
					if (elements.iterator().hasNext()) {

						type = (Type) elements.iterator().next();
						debug("found " + type.getName());
						break;
					}
				}

			}
		}

		return type;

	}

	private static class SaveFragments extends UMLSwitch {

		public SaveFragments() {
			super();
		}

		@Override
		public Object casePackage(Package pckge) {

			Map<String, String> options = new HashMap<String, String>();
			try {
				pckge.eResource().save(options);
			} catch (IOException e) {
				e.printStackTrace();
			}

			return pckge;
		}

	}

	public void saveUMLModel(Model model) {
		SaveFragments saveFragments = new SaveFragments();

		try {
			Map<String, String> options = new HashMap<String, String>();

			model.eResource().save(options);

			try {
				applySwitch(model, saveFragments);

			} catch (IndexOutOfBoundsException e) {
				e.printStackTrace();
			}

		} catch (IOException e) {
			throw new BuildException(e);
		}
	}

	public CopyModelTask createCopyModel() {
		return new CopyModelTask();
	}
	
	
	public void executeSwitch(UMLSwitch umlSwitch)
	{
		debug(" executeSwitch(UMLSwitch umlSwitch)");
		executeSwitch(umlSwitch, true);
	}

	public void executeSwitch(UMLSwitch umlSwitch, boolean saveModel) {
		
			debug("executeSwitch(UMLSwitch umlSwitch, boolean saveModel)");

		
			loadUMLModel();

			applySwitch(getUMLModel(), umlSwitch);

			if (saveModel){
				saveUMLModel(getUMLModel());
			}

		return;
	}

}
