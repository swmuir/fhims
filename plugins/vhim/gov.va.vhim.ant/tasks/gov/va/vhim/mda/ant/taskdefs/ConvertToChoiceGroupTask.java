package gov.va.vhim.mda.ant.taskdefs;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.tools.ant.BuildException;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;

/**
 * @author Sean Muir
 * 
 */

public class ConvertToChoiceGroupTask extends VHIMBaseTask {

	boolean inlineSingletons = false;

	/**
	 * 
	 * 
	 * @author Sean Muir
	 * 
	 * 
	 * 
	 */
	public class ConvertToChoiceGroupSwitch extends VHIMBaseTask.MDASwitch {

		HashMap<Class, ArrayList<Class>> hashMap = new HashMap<Class, ArrayList<Class>>();

		@Override
		public Object caseClass(Class umlClass) {

			debug("ConvertToChoiceGroupSwitch caseClass "
					+ umlClass.getQualifiedName());

			if (Boolean.TRUE.equals(getStereotypeValue(umlClass,
					"MDA::MDAClass", "convertToChoice"))) {
				debug(" Start Convert To Choice");
				if (umlClass.getSuperClasses().size() == 1) {

					Class superClass = (Class) umlClass.getSuperClasses()
							.get(0);

					if (hashMap.get(superClass) == null) {
						hashMap.put(superClass, new ArrayList<Class>());
					}

					hashMap.get(superClass).add(umlClass);

				} else {
					warning("Not Converting ! Invalid convert to choice hierachy for "
							+ umlClass.getQualifiedName());

				}
				debug(" end Convert To Choice");
			}
		
			return super.caseClass(umlClass);
		}

		public void convertToChoice() {
			for (Class superClass : hashMap.keySet()) {

				if (!inlineSingletons || hashMap.get(superClass).size() > 1) {
					debug("Create nested choice");

					Class nestedChoice = (Class) superClass
							.createNestedClassifier("NestedChoicePattern",
									superClass.eClass());

					for (Class nested : hashMap.get(superClass)) {

						debug("Create nested choice attribute "
								+ nested.getName().toLowerCase());

						nestedChoice.createOwnedAttribute(nested.getName()
								.toLowerCase(), nested);
					}

					debug("Apply XMLSchema");

					nestedChoice.applyStereotype(nestedChoice
							.getApplicableStereotype("XMLSchema::Choice"));
					nestedChoice.applyStereotype(nestedChoice
							.getApplicableStereotype("XMLSchema::Group"));

					debug("Create nested property");

					Association association = superClass.createAssociation(
							true, AggregationKind.COMPOSITE_LITERAL, "_"
									+ superClass.getName().toLowerCase()
											.substring(0, 1)
									+ superClass.getName().substring(1)
									+ "Choice", 1, 1, nestedChoice, false,
							AggregationKind.NONE_LITERAL, null, 1, 1);

					informational("Create association property"
							+ association.getQualifiedName());

				} else {

					debug("Create property choice");
					
					Class singleton = (Class) hashMap.get(superClass).get(0);

					Property inlinedSingleton = superClass
							.createOwnedAttribute(singleton.getName()
									.toLowerCase(), singleton);

					inlinedSingleton.setAggregation(AggregationKind
							.get(AggregationKind.COMPOSITE));

					informational("Create Inlined Singleton property"
							+ inlinedSingleton.getQualifiedName());

				}

				debug("Done");

			}

			
			debug("Eliminate Original Generalizations");
			for (Class superClass : hashMap.keySet()) {

				for (Class nested : hashMap.get(superClass)) {
					nested.getGeneralization(superClass).destroy();
				}

			}
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public void execute() throws BuildException {

		informational("Start Convert To Choice Group execute");

		try {
			ConvertToChoiceGroupSwitch convertToChoiceGroupSwitch = new ConvertToChoiceGroupSwitch();

			executeSwitch(convertToChoiceGroupSwitch, false);

			convertToChoiceGroupSwitch.convertToChoice();

			saveUMLModel(getUMLModel());

		} catch (Throwable t) {

			error("Exception encountered during Convert To Choice Group Task  execute "
					+ t.getMessage());

			t.printStackTrace();
			throw new BuildException(t);
		}

		informational("End Inline Convert To Choice Group execute");

	}

	public void setInlineSingletons(boolean inlineSingletons) {
		this.inlineSingletons = inlineSingletons;
	}

}
