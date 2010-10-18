package gov.va.vhim.mda.ant.taskdefs;

import org.apache.tools.ant.BuildException;

/**
 * 
 * 
 * @author Sean Muir
 * 
 */
public class PublishModelTask extends VHIMBaseTask {
//
//	private class DiagramSwitch extends UMLSwitch {
//
//		HashMap<Class, org.eclipse.gmf.runtime.notation.Node> classes = new HashMap<Class, org.eclipse.gmf.runtime.notation.Node>();
//
//		public boolean associations = true;
//
//		@Override
//		public Object caseClass(Class object) {
//
//			if (!classes.containsKey(object)) {
//
//				if (object instanceof AssociationClass) {
//
//				} else {
//
//					classes.put(object, UMLModeler.getUMLDiagramHelper()
//							.createNode(diagram, object));
//				}
//
//			}
//
//			org.eclipse.gmf.runtime.notation.Node view1 = classes.get(object);
//
//			if (associations) {
//
//				for (Object o1 : object.getAssociations()) {
//					Association association = (Association) o1;
//
//					for (Object o2 : association.getEndTypes()) {
//						Type type = (Type) o2;
//
//						if (!type.equals(object)) {
//
//							if (!classes.containsKey((Class) type)) {
//
//								Node node = UMLModeler
//								.getUMLDiagramHelper().createNode(
//										diagram, (Class) type);
//								
//							
//										
//								classes.put((Class) type, node);
//								
//								/*
//								 * UMLModeler
//										.getUMLDiagramHelper().createNode(
//												diagram, (Class) type)
//								 */
//								
//							}
//
//							org.eclipse.gmf.runtime.notation.Node view2 = classes
//									.get((Class) type);
//
//							UMLModeler.getUMLDiagramHelper().createEdge(view1,
//									view2, association);
//						}
//
//					}
//
//				}
//			}
//
//			return object;
//		}
//
//		public Diagram diagram;
//
//	}
//
//	/**
//	 * 
//	 * 
//	 * @author Sean Muir
//	 * 
//	 */
//	public class PublishSwitch extends VHIMBaseTask.MDASwitch {
//
//		@Override
//		public Object casePackage(Package pckage) {
//
//			try {
//
//				informational("Start PublishSwitch.casePackage");			
//
//				DiagramSwitch diagramSwitch = new DiagramSwitch();
//
//				informational("Create Diagram for Package " + pckage.getName());
//
//				if (pckage.getOwner() != null) {
//
//					diagramSwitch.diagram = UMLModeler.getUMLDiagramHelper()
//							.createDiagram(pckage,
//									UMLDiagramKind.CLASS_LITERAL, pckage);
//					
//					informational(diagramSwitch.diagram.toString() );
//					
//					if (diagramSwitch.diagram == null) {
//						informational("diagram is null");
//					}
//					
//					
//					diagramSwitch.diagram.setMeasurementUnit(MeasurementUnit.HIMETRIC_LITERAL);
//					
//					diagramSwitch.diagram.setVisible(true);
//					
//					
//					
//					diagramSwitch.diagram.setName(pckage.getName());
//
//					if ("Common".equals(pckage.getName())) {
//						diagramSwitch.associations = false;
//					}
//
//					if ("BaseDatatypes".equals(pckage.getName())) {
//						diagramSwitch.associations = false;
//					}
//
//					informational("DiagramSwitch");
//					for (Object object : pckage.getOwnedMembers()) {
//						diagramSwitch.doSwitch((EObject) object);
//					}
//				}
//
//			} catch (Throwable e) {
//
//				error(e.getMessage());
//			}
//
//			return pckage;
//		}
//
//	}

	public void execute() throws BuildException {

//		informational("Start Publish Model ");
//
//		try {
//
//			TransactionalEditingDomain editTransaction = UMLModeler
//					.getEditingDomain();
//
//			editTransaction.getCommandStack().execute(
//
//			// Start of EMF Transaction
//					new RecordingCommand(editTransaction, "VHIMSamplePluglet") {
//
//						@Override
//						protected void doExecute() {
//							executeSwitch(new PublishSwitch());
//						}
//					});
//
//		} catch (Throwable t) {
//			error("Exception encountered during Publish Model Task execute "
//					+ t.getMessage());
//			t.printStackTrace();
//			throw new BuildException(t);
//		}
//
//		informational("End Publish Model");

	}

}
