package gov.va.vhim.plugin.validation.constraints.uml;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;


/**
 * @author muirs
 * 
 * InvalidDefaultValuemakes sure that classes do not have default values. 
 *
 */
public class InvalidDefaultValue extends AbstractModelConstraint {

	public InvalidDefaultValue() {
		super();
	}

	@Override
	public IStatus validate(IValidationContext ctx) {

		Property property = (Property) ctx.getTarget();

		IStatus status = ctx.createSuccessStatus();

		if (property.getType() != null) {
			if (property.getType() instanceof org.eclipse.uml2.uml.Class) {
				if (property.isSetDefault()) {
					status = ctx.createFailureStatus(new Object[] {
							property.getNearestPackage().getName(),
							((NamedElement) property.getOwner()).getName(),
							property.getName() });
				}
			}
		}
		return status;

	}

}
