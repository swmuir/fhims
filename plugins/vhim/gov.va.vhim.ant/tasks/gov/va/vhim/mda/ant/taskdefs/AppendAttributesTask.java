package gov.va.vhim.mda.ant.taskdefs;

import org.apache.tools.ant.BuildException;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

/**
 * 
 * 
 * @author Sean Muir
 * 
 */
public class AppendAttributesTask extends VHIMBaseTask {

	/**
	 * 
	 * 
	 * @author Sean Muir
	 * 
	 */
	public class ApppendAttributesSwitch extends VHIMBaseTask.MDASwitch {

		@Override
		public Object caseClass(Class umlClass) {

			debug("OrderAttributesSwitch umlClass "
					+ umlClass.getQualifiedName());

			EcoreEList list = (EcoreEList) getStereotypeValue(umlClass,
					"MDA::MDAClass", "appendAttributes");

			if (list != null) {
				for (Object object : list) {

					if (object != null) {
						String propdata[] = ((String) object).split(",");

						if (propdata.length == 4) {

							Type type = getType(  propdata[1]);
							
							// if can not find - assume model name was on included
							if (type == null)
							{
								type = getType(  getUMLModel().getName()+"::"+propdata[1]);
							}

							if (type != null) {

								Property property = umlClass
										.createOwnedAttribute(propdata[0],
												type,
												Integer.valueOf(propdata[2])
														.intValue(), Integer
														.valueOf(propdata[3])
														.intValue());
								informational("Appending Attribute "
										+ property.getType().getQualifiedName()
										+ " : " + property.getQualifiedName());
							} else {

								warning("Type "
										+ propdata[1]
										+ " not found, must use fully qualified name!");
							}
						}
					}
				}

			}
			return umlClass;
		}

	}

	public void execute() throws BuildException {

		informational("Start Append Attributes execute");

		try {

			executeSwitch(new ApppendAttributesSwitch());

		} catch (Throwable t) {
			error("Exception encountered during Append Attributes execute "
					+ t.getMessage());
			t.printStackTrace();
			throw new BuildException(t);
		}

		informational("End Append Attributes execute");

	}

}
