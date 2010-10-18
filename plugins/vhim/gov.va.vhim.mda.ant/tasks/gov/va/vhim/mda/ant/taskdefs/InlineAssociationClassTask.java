package gov.va.vhim.mda.ant.taskdefs;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.tools.ant.BuildException;
import org.eclipse.uml2.uml.AssociationClass;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

/**
 * @author Sean Muir
 * 
 */

public class InlineAssociationClassTask extends VHIMBaseTask {

	/**
	 * InlineAssociationClassSwitch replaces association class in the model with
	 * a preidentified class as an attribute. It current supports two passes -
	 * first identify association class - second pass inline attribute - finally
	 * we delete the identified attributes
	 * 
	 * @author Sean Muir
	 * 
	 * TODO The current implementation is hard coded to support
	 * practionerparticipationlite - our only association class at the moment.
	 * Create parameters to support additional association classes.
	 * 
	 */
	public class InlineAssociationClassSwitch extends VHIMBaseTask.MDASwitch {

		/**
		 * AssociationProperty is structure to capture the resulting properties
		 * name, upper, and lower limits
		 * 
		 * @author Sean Muir
		 * 
		 */
		private class AssociationProperty {
			public AssociationProperty() {
				super();
				// TODO Auto-generated constructor stub
			}

			private String name;

			private int lower;

			private int upper;

			Type type = null;

			public Type getType() {
				return type;
			}

			public void setType(Type type) {
				this.type = type;
			}

			public int getLower() {
				return lower;
			}

			public String getName() {
				return name;
			}

			public int getUpper() {
				return upper;
			}

			public void setLower(int lower) {
				this.lower = lower;
			}

			public void setName(String name) {
				this.name = name;
			}

			public void setUpper(int upper) {
				this.upper = upper;
			}

		}

		HashMap<String, ArrayList<AssociationProperty>> hashMap = new HashMap<String, ArrayList<AssociationProperty>>();

		Class practitionerParticipationLite = null;

		ArrayList<AssociationClass> associationClasses = new ArrayList<AssociationClass>();

		int pass = FIRSTPASS;

		public void setPass(int pass) {
			debug("setPass " + pass);
			this.pass = pass;
		}

		/**
		 * destroy removes all identified association classes
		 */
		public void destroy() {
			for (AssociationClass associationClass : associationClasses) {
				associationClass.destroy();
			}
		}

		@Override
		public Object caseClass(Class umlClass) {

			// TODO : This is bit of hack to get instance of
			// PractitionerParticipationLite class to use
			// later; figure out better way to get a class

//			if (pass == FIRSTPASS) {
//
//				if ("PractitionerParticipationLite".equals(umlClass.getName())) {
//					practitionerParticipationLite = umlClass;
//				}
//			} else {

				// Iterate over collected properties and add new inline propery
				ArrayList<AssociationProperty> properties = hashMap
						.get(umlClass.getQualifiedName());

				if (properties != null) {
					for (AssociationProperty associationProperty : properties) {

						debug("createOwnedAttribute "
								+ umlClass.getQualifiedName() + "."
								+ associationProperty.getName());
						
						Property property = umlClass.createOwnedAttribute(
								associationProperty.getName(),
								associationProperty.getType());
						
						property.setLower(associationProperty.getLower());
						property.setUpper(associationProperty.getUpper());

					}
				}
//			}
			return umlClass;
		}

		@Override
		public Object caseAssociationClass(AssociationClass associationClass) {

			String className = null;
			AssociationProperty associationProperty = null;

			debug("Processing Association Class "
					+ associationClass.getQualifiedName());

			if (pass == FIRSTPASS) {

				if (associationClass.getAppliedStereotype("RIM::Participation") != null) {

					debug("Stereotyped with Participation "
							+ associationClass.getLabel());

					// Property's on association class for corresponding acts
					// and roles
					Property roleProperty = null;
					Property actProperty = null;

					// Locate the properties
					for (Object connection : associationClass.allConnections()) {
						Property associationClassProperty = (Property) connection;

						if (associationClassProperty.getType()
								.getAppliedStereotype("RIM::Role") != null) {
							roleProperty = associationClassProperty;
							debug("Found Role Property");
						}

						if (associationClassProperty.getType()
								.getAppliedStereotype("RIM::Act") != null) {

							actProperty = associationClassProperty;
							debug("Found Act Property");

						}

						if (associationClassProperty.getType()
								.getAppliedStereotype("RIM::Observation") != null) {

							actProperty = associationClassProperty;
							debug("Found Observation Property");

						}

						if (associationClassProperty.getType()
								.getAppliedStereotype("RIM::Procedure") != null) {

							actProperty = associationClassProperty;
							debug("Found Observation Property");

						}

						if (associationClassProperty.getType()
								.getAppliedStereotype(
										"RIM::SubstanceAdministrator") != null) {

							actProperty = associationClassProperty;
							debug("Found SubstanceAdministrator Property");

						}

						if (associationClassProperty.getType()
								.getAppliedStereotype("RIM::Person") != null) {

							actProperty = associationClassProperty;
							debug("Found Person Property");

						}
					}

					if (roleProperty != null && actProperty != null) {

						debug("Found Both");

						associationProperty = new AssociationProperty();

						// add association class so we can destroy later
						associationClasses.add(associationClass);

						// Set the upper and lower bounderies from the Role
						// Property
						associationProperty.setLower(roleProperty.getLower());

						associationProperty.setUpper(roleProperty.getUpper());
						
						
						debug("roleProperty.getName()"+roleProperty.getType().getQualifiedName()+"Participation");
						
						Type participationType = getType(roleProperty.getType().getQualifiedName()+"Participation");
						
						if (participationType != null)
						{
							associationProperty.setType(participationType);
						} else
						{
							// TODO Add configurable matrix based on role type to inline.
							associationProperty.setType(roleProperty.getType());		
						}

						if (actProperty.getType() instanceof Class) {
							Class actClass = (Class) actProperty.getType();
							for (Object object : actClass.getAllAttributes()) {
								Property actClassProperty = (Property) object;

								if (associationClass.equals(actClassProperty
										.getAssociation())) {
									// Use the name of the property in the act
									// class corresponding to the association
									// class for the inlined participation
									// property
									associationProperty
											.setName(actClassProperty.getName());
									actClassProperty.destroy();
									break;
								}

							}

							// If there is not property on the act class, Use
							// the association class label or the
							// the role type name
							if (associationProperty.getName() == null) {
								if (associationClass.getName() != null) {
									associationProperty
											.setName(associationClass.getName()
													.toLowerCase());
								} else {
									associationProperty.setName(roleProperty
											.getType().getName().toLowerCase());
								}

							}

						}

						// Add association property to collection of properties
						// to be created.
						if (hashMap.get(actProperty.getType()
								.getQualifiedName()) == null) {

							hashMap.put(actProperty.getType()
									.getQualifiedName(),
									new ArrayList<AssociationProperty>());
						}

						hashMap.get(actProperty.getType().getQualifiedName())
								.add(associationProperty);

					} else {
						warning("Invalid Participation Association Class, Class will not be inlined!");
					}

				}
			}

			return associationClass;

		}

		/**
		 * FIRSTPASS and SECONDPASS were originally enumerations After
		 * refactoring to use an inner class for the umlswitch logic Could not
		 * get enum to compile. final static ints on the other hand work -SWM
		 */
		public final static int FIRSTPASS = 1;

		public final static int SECONDPASS = 2;

	}

	@SuppressWarnings("unchecked")
	@Override
	public void execute() throws BuildException {

		informational("Start Inline AssociationClasses execute");

		try {
			InlineAssociationClassSwitch inlineAssocClassSwitch = new InlineAssociationClassSwitch();

			// First Pass identifies association classes
			inlineAssocClassSwitch
					.setPass(InlineAssociationClassSwitch.FIRSTPASS);

			executeSwitch(inlineAssocClassSwitch);

			inlineAssocClassSwitch
					.setPass(InlineAssociationClassSwitch.SECONDPASS);
			applySwitch(getUMLModel(), inlineAssocClassSwitch);

			// Destroy the associations
			inlineAssocClassSwitch.destroy();

			saveUMLModel(getUMLModel());

		} catch (Throwable t) {

			error("Exception encountered during Inline Association Class execute "
					+ t.getMessage());

			t.printStackTrace();
			throw new BuildException(t);
		}

		informational("End Inline AssociationClasses execute");

	}

}
