package org.openhealthtools.mdht.uml.niem.ui.actions;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.common.ui.actions.OpenSubclassEditorAction;
import org.openhealthtools.mdht.uml.common.ui.dialogs.SubclassEditorDialog;
//import org.openhealthtools.mdht.uml.common.ui.actions.OpenSubclassEditorAction;
//import org.openhealthtools.mdht.uml.common.ui.dialogs.SubclassEditorDialog;
import org.openhealthtools.mdht.uml.common.ui.dialogs.SubclassEditorViewContentProvider;
import org.openhealthtools.mdht.uml.common.ui.dialogs.SubclassEditorViewLabelProvider;
//import org.openhealthtools.mdht.uml.common.ui.dialogs.SubclassHandler;
import org.openhealthtools.mdht.uml.niem.ui.dialogs.TemplateEditorViewContentProvider;
import org.openhealthtools.mdht.uml.niem.ui.dialogs.TemplateEditorViewLabelProvider;

public class OpenExtensionEditorAction extends OpenSubclassEditorAction {
	
	
	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(selectedClass);
		
			/*
			 * For the purposes of not updating mdht - employed cut and paste reuse
			 * 
			 */
			final SubclassHandler subclassHandler = new SubclassHandler(
					activePart.getSite().getShell(), selectedClass,
					getContentProvider(), getLabelProvider())
			{

				@Override
				protected SubclassEditorDialog createSubclassDialog() {
					SubclassEditorDialog subclassDialog = new SubclassEditorDialog(shell, labelProvider,
							contentProvider, getSubclass());
					
					subclassDialog.setTitle("NIEM Exchange Editor");
					
					// set the subclass attributes based on the tree viewer checked elements.
					EList<Property> subclassAttributes = getSubclass().getOwnedAttributes();
					if (subclassAttributes != null && !subclassAttributes.isEmpty()) {
						subclassDialog.setInitialElementSelections(subclassAttributes);
						subclassDialog.setModifyMode(true);
					}
					return subclassDialog;
				}

				
				
				
				
			};
			
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "Edit subclass properties") {
			    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					subclassHandler.openSubclassDialog();
			        return Status.OK_STATUS;
			    }};

		    try {
				IWorkspaceCommandStack commandStack = (IWorkspaceCommandStack) editingDomain.getCommandStack();
				operation.addContext(commandStack.getDefaultUndoContext());
		        commandStack.getOperationHistory().execute(operation, new NullProgressMonitor(), null);

		    } catch (ExecutionException ee) {
//			        Logger.logException(ee);
		    }

		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}
	}
	
	
	public void selectionChanged(IAction action, ISelection selection) {
		super.selectionChanged(action, selection);
		
		if (selectedClass != null) {
			Class cdaClass = CDAModelUtil.getCDAClass(selectedClass);
			//if the selectedClass is derived from a CDA model class, then enable the action
			if (cdaClass != null) {
				action.setEnabled(true);
				return;
			}
		}
		action.setEnabled(false);

	}
	
	protected SubclassEditorViewContentProvider getContentProvider() {
		return new TemplateEditorViewContentProvider();
	}

	protected SubclassEditorViewLabelProvider getLabelProvider() {
		return new TemplateEditorViewLabelProvider();
	}
}
