package gov.va.vhim.profile.ui.properties;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.gmf.runtime.diagram.ui.properties.sections.AbstractModelerPropertySection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

public class MDASection extends AbstractModelerPropertySection {
	
	
	

	public MDASection() {
		super();
		
		
		
	
	}

	@Override
	public void createControls(Composite parent, final TabbedPropertySheetPage aTabbedPropertySheetPage) {	
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

Label message = getWidgetFactory()
.createLabel(
		composite,
		"VHIM MDA Support will be implemented in future relases - The VHIM Team (FY2009.R3)",
		SWT.LEFT);

labelData = new FormData();
// labelData.right = new FormAttachment(1, 0);
labelData.top = new FormAttachment(label, 0);
message.setLayoutData(labelData);

		
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
	public void handleElementModifiedEvent(Notification notification, EObject element) {
		// TODO Auto-generated method stub
		super.handleElementModifiedEvent(notification, element);
	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		// TODO Auto-generated method stub
		super.setInput(part, selection);
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
		// TODO Auto-generated method stub
		super.refresh();
	}
	
	
	

}
