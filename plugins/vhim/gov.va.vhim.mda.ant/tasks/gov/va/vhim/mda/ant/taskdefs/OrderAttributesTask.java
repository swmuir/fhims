package gov.va.vhim.mda.ant.taskdefs;

import org.apache.tools.ant.BuildException;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.uml2.uml.Class;

/**
 * OrderAttributesTask uses the MDA orderMap value to set the orders of the
 * attributes defined in the class so the correspondin xsd has a specific order.
 * The need for this is two fold, some of the original delivery of the model
 * allowed customization of order which needs to be preserved. Second can be
 * attributes can be added during various MDA process and there will be a need
 * to maintain some backwards ordering.
 * 
 * currently there is no error checking/ui to support this. The practice is
 * highly discouraged but neccessary.
 * 
 * NOTE : This should be the last task fired during the MDA process
 * 
 * @author Sean Muir
 * 
 */
public class OrderAttributesTask extends VHIMBaseTask {

	/**
	 * OrderAttributesSwitch takes the order map and uses the move method off
	 * owned attributes so the order defined in the order map is the same in the
	 * class.
	 * 
	 * @author Sean Muir
	 * 
	 */
	public class OrderAttributesSwitch extends VHIMBaseTask.MDASwitch {

		@Override
		public Object caseClass(Class umlClass) {

			debug("OrderAttributesSwitch umlClass "
					+ umlClass.getQualifiedName());

			EcoreEList list = (EcoreEList) getStereotypeValue(umlClass,
					"MDA::MDAClass", "orderMap");

			if (list != null) {

				int oldPosition;
				for (Object object : list) {

					oldPosition = umlClass.getOwnedAttributes().indexOf(
							umlClass.getAttribute((String) object, null));
					if (oldPosition > -1) {
						umlClass.getOwnedAttributes().move(
								list.indexOf(object), oldPosition);
						informational("Ordering " + object + " to "
								+ list.indexOf(object));
					}

				}
			}

			return umlClass;
		}

	}

	public void execute() throws BuildException {

		informational("Start Order Attributes execute");

		try {

			executeSwitch(new OrderAttributesSwitch());

		} catch (Throwable t) {

			error("Exception encountered during Order Attributes execute "
					+ t.getMessage());

			t.printStackTrace();
			throw new BuildException(t);
		}

		informational("End Order Attributes execute");

	}

}
