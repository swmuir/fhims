package gov.va.vhim.mda.ant.taskdefs;

import org.apache.tools.ant.BuildException;
import org.eclipse.uml2.uml.Property;

/**
 * 
 * PruneAttributesTask sets properties to private if the property on the
 * stereotype is set. The XSD generator (hypermodel) has a flag to not include
 * private attributes in the xsd.
 * 
 * @author Sean Muir
 * 
 */
public class RenameAttributesTask extends VHIMBaseTask {

	/**
	 * 
	 * 
	 * @author Sean Muir
	 * 
	 * 
	 */
	public class RenameAttributesSwitch extends VHIMBaseTask.MDASwitch {

		public RenameAttributesSwitch() {
			super();

		}

		@Override
		public Object caseProperty(Property property) {

			debug("RenameAttributesSwitch caseProperty "
					+ property.getQualifiedName());

			String rename = (String) getStereotypeValue(property,
					"MDA::MDAProperty", "rename");

			
			// check to see if it is set and that it has a value to use
			if (rename != null && rename.trim().length() > 0) {
				informational("Renaming "+property.getQualifiedName()+" to "+rename);
				property.setName(rename);
			}

			return property;
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public void execute() throws BuildException {
		
		informational("Start Rename Attributes execute");

		try {			

			executeSwitch(new RenameAttributesSwitch());
			
		} catch (Throwable t) {
			
			error("Exception in during Rename Attributes execute "+t.getMessage());
			
			t.printStackTrace();
			throw new BuildException(t);
		}

		informational("End Rename Attributes execute");
		
	}

}
