package gov.va.vhim.plugin.validation.constraints.uml;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;

/**
 * @author muirs
 * 
 * MissingType validates that all attributes must have a defined type.
 * 
 * @deprecated
 * 
 */
public class MissingType extends AbstractModelConstraint {

	public MissingType() {
		super();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext ctx) {

		Property property = (Property) ctx.getTarget();

		IStatus status = ctx.createSuccessStatus();;

		if (property.getType() == null) {
			status = ctx.createFailureStatus(new Object[] {
					property.getNearestPackage().getName(),
					((NamedElement) property.getOwner()).getName(),
					property.getName() });
		} 
		
		return status;

	}

}
