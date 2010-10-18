package gov.va.vhim.mda.ant.taskdefs;

import java.util.ArrayList;

import org.apache.tools.ant.BuildException;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.uml2.uml.Package;
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
public class PruneAttributesTask extends VHIMBaseTask {

	/**
	 * Static so HideAttributesSwitch can see it
	 */
	String client;

	/**
	 * 
	 * 
	 * @author Sean Muir
	 * 
	 * 
	 */
	public class PruneAttributesSwitch extends VHIMBaseTask.MDASwitch {

		ArrayList<Property> properties = new ArrayList<Property>();
		
		ArrayList<Package> packages = new ArrayList<Package>();

		String client;

		public void setClient(String client) {
			this.client = client;
		}

		public PruneAttributesSwitch() {
			super();
		}

		@Override
		public Object caseProperty(Property property) {
			
			debug("PruneAttributesSwitch caseProperty "
					+ property.getName());

			EcoreEList listOfClients = (EcoreEList) getStereotypeValue(
					property, "MDA::MDAProperty", "client");

			if (listOfClients != null) {

			
				
				for (Object clientValue : listOfClients.basicList()) {

					if (client != null && client.equals(clientValue.toString())) {
						properties.add(property);
						debug("PruneAttributesSwitch caseProperty - marking "
								+ property.getQualifiedName());
					}

				}
			}

			return property;
		}
		
		

		@Override
		public Object casePackage(Package pckge) {
			debug("PruneAttributesSwitch casePackage "
					+ pckge.getName());

			EcoreEList listOfClients = (EcoreEList) getStereotypeValue(
					pckge, "MDA::MDAPackage", "client");

			debug("listOfClients aaaaaaaaaaaaaaa"+listOfClients);
			if (listOfClients != null) {
				debug("listOfClients bbbbbbbbbbbbb"+listOfClients);
				for (Object clientValue : listOfClients.basicList()) {

					if (clientValue != null && client != null && client.equals(clientValue.toString())) {
						packages.add(pckge);
						debug("PruneAttributesSwitch caseProperty - marking "
								+ pckge.getQualifiedName());
					}

				}
			}
			return super.casePackage(pckge);
		}

		/**
		 * destroy removes all identified association classes
		 */
		public void destroy() {
			for (Property property : properties) {
				informational("Pruning Attribute" + property.getQualifiedName());
				
				if (property.getAssociation() == null) {
					debug("Pruning Property " + property.getName());
					property.destroy();
				} else {		
					debug("00000000000000000Pruning Association " + property.getName());					
					property.getAssociation().destroy(); // .getOwner().getOwnedElements().remove(property.getAssociation());
					debug("aaaaaaaaaaaaaPruning Association " + property.getName());		
					property.destroy();
					debug("bbbbbbbbbbbbbbPruning Association " + property.getName());		
				}
				
				
			}
			
			
			for (Package pckge: packages) {
				informational("Pruning Package" + pckge.getQualifiedName());
				pckge.destroy();
			}
		}

	}

	
	@Override
	public void execute() throws BuildException {

		informational("Start Prune Attributes execute");
		
		try {

			PruneAttributesSwitch pruneAttributesSwitch = new PruneAttributesSwitch();

			pruneAttributesSwitch.setClient(client);

			this.executeSwitch(pruneAttributesSwitch);

			pruneAttributesSwitch.destroy();

			saveUMLModel(getUMLModel());

		} catch (Throwable t) {
			
			error("Exception encountered during Prune Attributes execute "
					+ t.getMessage());
			
			t.printStackTrace();
			throw new BuildException(t);
		}
		
		informational("End Prune  Attributes execute ");

	}

	public void setClient(String client) {
		debug("PruneAttributesSwitch setClient "
				+ client);
		this.client = client;
	}

}
