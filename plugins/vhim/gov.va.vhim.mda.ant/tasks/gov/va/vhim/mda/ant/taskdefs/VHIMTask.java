package gov.va.vhim.mda.ant.taskdefs;

//import gov.va.vhim.mda.ant.taskdefs.InlineAssociationClass.SaveFragments;

import java.util.ArrayList;

import org.apache.tools.ant.BuildException;

public class VHIMTask extends VHIMBaseTask {

	ArrayList<VHIMBaseTask> tasks = new ArrayList<VHIMBaseTask>();

	@Override
	public void execute() throws BuildException {

		// Set the verbosity for the VHIMTask
		setVerbosity();

		debug("Begin VHIMTask Execute");

		loadUMLModel();

		for (VHIMBaseTask task : tasks) {
			// Sets the logging for the task to be fired
			// VHIMTask level overrides individual levels to match logging
			// verbosity

			if (task.getLogLevel() < getLogLevel()) {
				task.setLogLevel(getLogLevel());
			}
			task.setVerbosity();
			task.setUMLModel(getUMLModel());

			task.execute();
		}
	}

	public PruneAttributesTask createPruneAttributes() {

		informational("Creating Prune Attributes Task");

		PruneAttributesTask hideAttributesTask = new PruneAttributesTask();
		tasks.add(hideAttributesTask);
		return hideAttributesTask;
	}

	public InlineAssociationClassTask createInlineAssociationClass() {

		informational("Creating Inline Association Class Task");

		InlineAssociationClassTask inlineAssociationClassTask = new InlineAssociationClassTask();
		tasks.add(inlineAssociationClassTask);
		return inlineAssociationClassTask;
	}

	public TypeTransformation createTypeTransformation() {

		informational("Creating Type Transformation Task ");

		TypeTransformation typeTransformation= new TypeTransformation();
		
		tasks.add(typeTransformation);
		
		return typeTransformation;
	}

	public RenameAttributesTask createRenameAttributes() {

		informational("Creating Rename Attributes Task");

		RenameAttributesTask renameAttributesTask = new RenameAttributesTask();
		tasks.add(renameAttributesTask);
		return renameAttributesTask;
	}
	
	
	public ConvertToChoiceGroupTask createConvertToChoiceGroup() {

		informational("Creating Convert To Choice Group Task ");

		ConvertToChoiceGroupTask  convertToChoiceGroupTask = new ConvertToChoiceGroupTask();
		tasks.add(convertToChoiceGroupTask );
		return convertToChoiceGroupTask ;
	}
	

	public AppendAttributesTask createAppendAttributes() {
		informational("Creating Append Attributes Task");

		AppendAttributesTask appendAttributesTask = new AppendAttributesTask();
		tasks.add(appendAttributesTask);
		return appendAttributesTask;
	}
	
	public PublishModelTask  createPublishModel () {
		informational("Creating Publish Task");

		PublishModelTask  publishModelTask  = new PublishModelTask  ();
		tasks.add(publishModelTask  );
		return publishModelTask  ;
	}

	public OrderAttributesTask createOrderAttributes() {
	
		informational("Creating Order Attributes Task");
	
		OrderAttributesTask orderAttributesTask = new OrderAttributesTask();
		tasks.add(orderAttributesTask);
		return orderAttributesTask;
	}

}
