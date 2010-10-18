package gov.va.vhim.plugin.validation.constraints.vhim;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

/**
 * MissingClassComment validates that all classes need to have supporting
 * documentation.
 * 
 * @author muirs
 * 
 */
public class MissingPackageComment extends AbstractModelConstraint {

	public MissingPackageComment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public IStatus validate(IValidationContext ctx) {

		org.eclipse.uml2.uml.Package packge = (org.eclipse.uml2.uml.Package) ctx
				.getTarget();

		IStatus status = ctx.createSuccessStatus();

		if (packge.getOwnedComments().size() == 0) {
			status = ctx.createFailureStatus(new Object[] { packge
					.getQualifiedName() });
		} else
		{
			org.eclipse.uml2.uml.Comment comment = (org.eclipse.uml2.uml.Comment)packge.getOwnedComments().get(0);
			
			if (comment.getBody().trim().length() == 0)
			{
				status = ctx.createFailureStatus(new Object[] { packge
						.getQualifiedName() });
			}
		}

		return status;
	}

}
