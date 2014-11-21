package gov.us.fhim.ui.properties;

import gov.us.fhim.profile.FHIMFactory;
import gov.us.fhim.profile.Index;
import gov.us.fhim.profile.Mapping;
import gov.us.fhim.profile.StandardOrProject;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.ui.properties.sections.ResettableModelerPropertySection;

public class FHIMMappedProperty extends ResettableModelerPropertySection {

	protected Element modelElement;

	@Override
	public void refresh() {
		super.refresh();

		if (table.getItemCount() == 0) {
			for (int i = 0; i < 10; i++) {
				TableItem item = new TableItem(table, SWT.NONE);
				item.setText(new String[] { "", "" });
			}
		}

		Stereotype mapping = modelElement.getApplicableStereotype("fhim::Mapping");
		Mapping m = (Mapping) modelElement.getStereotypeApplication(mapping);
		if (m != null) {

			int itemCtr = 0;
			for (Index e : m.getIndex()) {

				TableItem item = table.getItem(itemCtr++);

				if (!StringUtils.isEmpty(e.getValue())) {
					item.setText(new String[] { e.getStandardOrProject().getLiteral(), e.getValue() });
				} else {
					item.setText(new String[] { "", e.getValue() });
				}

			}
		} else {
			for (int i = 0; i < 10; i++) {
				TableItem item = table.getItem(i);
				item.setText(new String[] { "", "" });
			}
		}

	}

	@Override
	protected void resetFields() {
	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		EObject element = getEObject();
		Assert.isTrue(element instanceof Element);
		this.modelElement = (Element) element;
	}

	private void update(final Table table) {
		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(modelElement);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {

				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {

					Stereotype mapping = modelElement.getApplicableStereotype("fhim::Mapping");

					if (!modelElement.isStereotypeApplied(mapping)) {
						modelElement.applyStereotype(mapping);
					}

					Mapping mapping2 = (Mapping) modelElement.getStereotypeApplication(mapping);

					mapping2.getIndex().clear();

					for (TableItem ti : table.getItems()) {

						Index e = FHIMFactory.eINSTANCE.createIndex();

						if (!StringUtils.isEmpty(ti.getText(0))) {
							e.setStandardOrProject(StandardOrProject.get(ti.getText(0)));
						} else {
							e.setStandardOrProject(StandardOrProject.ONCSITOC);
						}

						e.setValue(ti.getText(1));
						mapping2.getIndex().add(e);

					}

					return Status.OK_STATUS;
				}
			};

			execute(operation);

		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}
	}

	Table table;

	@Override
	public void createControls(final Composite parent, final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		Composite composite = getWidgetFactory().createGroup(parent, "FHIM to Domain Mappings");
		FormLayout layout = new FormLayout();

		layout.marginWidth = ITabbedPropertyConstants.HSPACE + 2;
		layout.marginHeight = ITabbedPropertyConstants.VSPACE;
		layout.spacing = ITabbedPropertyConstants.VMARGIN + 1;
		composite.setLayout(layout);

		table = getWidgetFactory().createTable(composite, SWT.BORDER | SWT.MULTI);

		table.setLinesVisible(true);
		table.setHeaderVisible(true);

		String[] titles = { "Specification", "Mapping" };

		for (int i = 0; i < 2; i++) {
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setText(titles[i]);
			column.setWidth(250);
		}

		final TableEditor editor = new TableEditor(table);
		editor.horizontalAlignment = SWT.LEFT;
		editor.grabHorizontal = true;
		table.addListener(SWT.MouseDown, new Listener() {

			public void handleEvent(Event event) {
				Rectangle clientArea = table.getClientArea();
				Point pt = new Point(event.x, event.y);
				int index = table.getTopIndex();
				while (index < table.getItemCount()) {
					boolean visible = false;
					final TableItem item = table.getItem(index);
					for (int i = 0; i < table.getColumnCount(); i++) {
						Rectangle rect = item.getBounds(i);
						if (rect.contains(pt)) {
							final int column = i;

							if (column == 0) {
								final CCombo combo = new CCombo(table, SWT.NONE);
								combo.setText("CCombo");
								combo.add("");

								for (StandardOrProject sorp : StandardOrProject.values()) {

									combo.add(sorp.getLiteral());
								}

								Listener textListener = new Listener() {

									public void handleEvent(final Event e) {
										switch (e.type) {
											case SWT.FocusOut:
												item.setText(column, combo.getText());
												update(table);
												combo.dispose();
												break;
											case SWT.Traverse:
												switch (e.detail) {
													case SWT.TRAVERSE_RETURN:
														item.setText(column, combo.getText());
													case SWT.TRAVERSE_ESCAPE:
														combo.dispose();
														e.doit = false;
												}
												break;
										}
									}
								};
								combo.addListener(SWT.FocusOut, textListener);
								combo.addListener(SWT.Traverse, textListener);
								editor.setEditor(combo, item, i);
								combo.setText(item.getText(i));
								// combo.selectAll();
								combo.setFocus();

							} else {
								final Text text = new Text(table, SWT.NONE);

								Listener textListener = new Listener() {

									public void handleEvent(final Event e) {
										switch (e.type) {
											case SWT.FocusOut:
												item.setText(column, text.getText());
												update(table);
												text.dispose();
												break;
											case SWT.Traverse:
												switch (e.detail) {
													case SWT.TRAVERSE_RETURN:
														item.setText(column, text.getText());
													case SWT.TRAVERSE_ESCAPE:
														text.dispose();
														e.doit = false;
												}
												break;
										}
									}
								};
								text.addListener(SWT.FocusOut, textListener);
								text.addListener(SWT.Traverse, textListener);
								editor.setEditor(text, item, i);
								text.setText(item.getText(i));
								text.selectAll();
								text.setFocus();
							}

							return;
						}
						if (!visible && rect.intersects(clientArea)) {
							visible = true;
						}
					}
					if (!visible) {
						return;
					}
					index++;
				}
			}
		});

	}

}
