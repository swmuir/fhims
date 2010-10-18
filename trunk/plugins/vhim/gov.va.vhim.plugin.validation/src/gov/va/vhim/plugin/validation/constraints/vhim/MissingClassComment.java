package gov.va.vhim.plugin.validation.constraints.vhim;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.AssociationClass;

/**
 * MissingClassComment validates that all classes need to have supporting documentation.
 * 
 * @author muirs
 *
 */
public class MissingClassComment extends AbstractModelConstraint {

	public MissingClassComment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public IStatus validate(IValidationContext ctx) {

		org.eclipse.uml2.uml.Class clazz = (org.eclipse.uml2.uml.Class) ctx
		.getTarget();
		
		IStatus status = ctx.createSuccessStatus();
		
		if (!(clazz instanceof AssociationClass)) {
			if (clazz.getOwnedComments().size() == 0) {
				status = ctx.createFailureStatus(new Object[] { clazz
						.getQualifiedName() });
			}
		}
		
	
		return status;
	}

}
