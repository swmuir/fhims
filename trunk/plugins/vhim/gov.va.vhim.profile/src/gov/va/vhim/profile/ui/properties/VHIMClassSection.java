package gov.va.vhim.profile.ui.properties;

import java.util.List;

import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.properties.sections.AbstractModelerPropertySection;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;

public class VHIMClassSection extends AbstractModelerPropertySection {

	CCombo multiObservationCombo = null;

	boolean modified = false;

	private NamedElement nameElement;

	public VHIMClassSection() {
		super();		
	}

	@Override
	public void createControls(Composite parent,
			final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		Composite composite = getWidgetFactory()
				.createFlatFormComposite(parent);

		FormData data = null;

		Label label = getWidgetFactory().createLabel(composite,
				"Veterans Health Administration Information Model", SWT.CENTER);

		FormData labelData = new FormData();
		labelData.left = new FormAttachment(0, 0);
		labelData.top = new FormAttachment(0, 0);
		labelData.bottom = new FormAttachment(1, 0);
		label.setLayoutData(labelData);

		Label question = getWidgetFactory().createLabel(composite,
				"Does this Act contain multiple observations ?", SWT.LEFT);

		labelData = new FormData();
		// labelData.right = new FormAttachment(1, 0);
		labelData.top = new FormAttachment(label, 0);
		question.setLayoutData(labelData);

		// Gotta be a standard yes/no combo somewhere

		multiObservationCombo = getWidgetFactory().createCCombo(composite,
				SWT.NONE);
		multiObservationCombo.setEditable(false);
		multiObservationCombo.add("Yes");
		multiObservationCombo.add("No");

		multiObservationCombo.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				modified = true;
				modifyFields();
			}

			public void widgetSelected(SelectionEvent e) {
				modified = true;
				modifyFields();
			}
		});

		labelData = new FormData();
		labelData.left = new FormAttachment(question, 0);
		labelData.top = new FormAttachment(label, 0);
		multiObservationCombo.setLayoutData(labelData);

	}

	@Override
	public void aboutToBeHidden() {
		// TODO Auto-generated method stub
		super.aboutToBeHidden();
	}

	@Override
	public void aboutToBeShown() {
		// TODO Auto-generated method stub
		super.aboutToBeShown();
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		super.dispose();
	}

	@Override
	public NotificationFilter getFilter() {
		// TODO Auto-generated method stub
		return super.getFilter();
	}

	@Override
	public List getInput() {
		// TODO Auto-generated method stub
		return super.getInput();
	}

	@Override
	public void handleElementModifiedEvent(Notification notification,
			EObject element) {
		// TODO Auto-generated method stub
		super.handleElementModifiedEvent(notification, element);
	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		EObject element = getEObject();
		if (element instanceof View) {
			element = ((View) element).getElement();
		}
		Assert.isTrue(element instanceof NamedElement);
		this.nameElement = (NamedElement) element;

	}

	@Override
	public void update(Notification notification, EObject element) {
		// TODO Auto-generated method stub
		super.update(notification, element);
	}

	@Override
	public IWorkbenchPart getPart() {
		// TODO Auto-generated method stub
		return super.getPart();
	}

	@Override
	public void refresh() {
		Stereotype stereotype = nameElement
				.getAppliedStereotype("VHIM::VHIMClass");
		Boolean multiObservation = (Boolean) nameElement.getValue(stereotype,
				"isMultiObservation");
		if (multiObservationCombo != null) {
			if (Boolean.TRUE.equals(multiObservation)) {
				multiObservationCombo.select(0);
			} else {
				multiObservationCombo.select(1);
			}
		}

	}

	private void modifyFields() {

		if (modified) {
			try {
				TransactionalEditingDomain editingDomain = TransactionUtil
						.getEditingDomain(nameElement);

				IUndoableOperation operation = new AbstractEMFOperation(
						editingDomain, "temp") {

					@Override
					protected IStatus doExecute(IProgressMonitor monitor,
							IAdaptable info)
							throws org.eclipse.core.commands.ExecutionException {

						Stereotype stereotype = nameElement
								.getAppliedStereotype("VHIM::VHIMClass");

						Boolean multiObservation = (Boolean) nameElement
								.getValue(stereotype, "isMultiObservation");

						if (multiObservationCombo != null) {

							if (multiObservationCombo.getSelectionIndex() == 0) {
								nameElement.setValue(stereotype,
										"isMultiObservation", Boolean.TRUE);
							} else {
								nameElement.setValue(stereotype,
										"isMultiObservation", Boolean.FALSE);
							}
						}

						return Status.OK_STATUS;
					}
				};

				IWorkspaceCommandStack commandStack = (IWorkspaceCommandStack) editingDomain
						.getCommandStack();
				operation.addContext(commandStack.getDefaultUndoContext());
				commandStack.getOperationHistory().execute(operation,
						new NullProgressMonitor(), getPart());

			} catch (Exception e) {
				throw new RuntimeException(e.getCause());
			}
		}
	}

}
