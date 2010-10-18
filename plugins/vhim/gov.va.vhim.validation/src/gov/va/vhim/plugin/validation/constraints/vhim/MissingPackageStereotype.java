package gov.va.vhim.plugin.validation.constraints.vhim;

import gov.va.vhim.profile.util.IVHIMProfileConstants;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Stereotype;

/**
 * InvalidPackageDefinition validates that all packages need to have the
 * VHIMPackage stereotype and client attibute set for proper MDA processing.
 * Default is HDR
 * 
 * @author muirs
 * 
 */
public class MissingPackageStereotype extends AbstractModelConstraint {

	public MissingPackageStereotype() {
		super();
	}

	/*
	 * 
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext ctx) {

		org.eclipse.uml2.uml.Package pckge = (org.eclipse.uml2.uml.Package) ctx
				.getTarget();

		IStatus status = ctx.createSuccessStatus();

		Stereotype vhimPackageStereoType = pckge
				.getAppliedStereotype(IVHIMProfileConstants.VHIM_PROFILE_NAME
						+ "::" + IVHIMProfileConstants.VHIM_PACKAGE_STEREOTYPE);
		if (vhimPackageStereoType == null) {

			status = ctx.createFailureStatus(new Object[] { pckge.getName() });
		}

		return status;

	}

}
