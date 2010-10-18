package gov.va.vhim.plugin.validation.constraints.vhim;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Association;

/**
 * MissingClassComment validates that all classes need to have supporting documentation.
 * 
 * @author muirs
 *
 */
public class MissingPropertyComment extends AbstractModelConstraint {

	public MissingPropertyComment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public IStatus validate(IValidationContext ctx) {

		org.eclipse.uml2.uml.Property property = (org.eclipse.uml2.uml.Property) ctx
				.getTarget();

		IStatus status = ctx.createSuccessStatus();

		if (!(property.getOwner() instanceof Association)) {
			// No reason to flag twice - null type is invalid
			if (property.getType() != null) {
				if (property.getOwnedComments().size() == 0) {
					status = ctx.createFailureStatus(new Object[] { property
							.getQualifiedName() });
				}
			}
		}
		return status;
	}

}
