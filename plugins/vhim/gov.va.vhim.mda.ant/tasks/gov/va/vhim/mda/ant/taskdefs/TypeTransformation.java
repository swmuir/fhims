package gov.va.vhim.mda.ant.taskdefs;

import org.apache.tools.ant.BuildException;
import org.eclipse.uml2.uml.Property;

/**
 * 
 * CodeMorphosisTask performs a code-a-morphosis on a generic code within the
 * VHIM model to a specific code implementation. This is not be confused with
 * vocabulary but more about flavors of code types running around both with HL7
 * and out.
 * 
 * The implmenetation at the moment is limited to properties because modifying
 * end points on associations are more entailed and at this point codes are
 * defined as properties and not as associations.
 * 
 * 
 * @author Sean Muir
 * 
 */
public class TypeTransformation extends VHIMBaseTask {


	/**
	 * 
	 * 
	 * @author Sean Muir
	 * 
	 * 
	 */
	public class TypeTransformationSwitch extends VHIMBaseTask.MDASwitch {

		public TypeTransformationSwitch() {
			super();
		}

	

		@Override
		public Object caseProperty(Property property) {

			String typetransformation = (String) getStereotypeValue(property, "MDA::MDAProperty",
					"typetransformation");

			if (typetransformation != null) {

				informational("Transforming " + property.getName());
				
				org.eclipse.uml2.uml.Type type = getType(typetransformation);
				
				// If we can not find - attempt to add model name and try again
				if (type == null)
				{
					type = getType(property.getModel().getName()+"::"+typetransformation);
				}

				if (type != null) {
					
					informational("Transforming " + property.getName() + " to "+ type.getQualifiedName());
					property.setType(type);
				} else
				{
					error("MDA::MDACode.code contains invalid type"+typetransformation);
				}

			}

			return property;
		}
	
	}

	
	@Override
	public void execute() throws BuildException {

		informational("Start Type Transformation Task execute");
		
		try {						
			TypeTransformationSwitch typeTransformationSwitch= new TypeTransformationSwitch();

			this.executeSwitch(typeTransformationSwitch);

			saveUMLModel(getUMLModel());

		} catch (Throwable t) {
			
			error("Exception encountered during Type Transformation Task  execute "
					+ t.getMessage());
			
			t.printStackTrace();
			throw new BuildException(t);
		}
		
		informational("End Type Transformation Task execute");

	}


}
