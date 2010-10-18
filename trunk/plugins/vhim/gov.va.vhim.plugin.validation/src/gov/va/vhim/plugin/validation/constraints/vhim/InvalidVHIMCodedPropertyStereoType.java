package gov.va.vhim.plugin.validation.constraints.vhim;

import gov.va.vhim.profile.util.IVHIMProfileConstants;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;

/**
 * InvalidPackageDefinition validates that all packages need to have the
 * VHIMPackage stereotype and client attibute set for proper MDA processing.
 * Default is HDR
 * 
 * @author muirs
 * @deprecated
 */
public class InvalidVHIMCodedPropertyStereoType extends AbstractModelConstraint {

	public InvalidVHIMCodedPropertyStereoType() {
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

		Property property = (Property) ctx.getTarget();

		IStatus status = ctx.createSuccessStatus();

		if (property.getAssociation() == null) {

			Stereotype vhimPropertyStereoType = property
					.getAppliedStereotype(IVHIMProfileConstants.FULLYQUALIFIED_VHIM_CODED_PROPERTY_STEREOTYPE);
			
			/*
			 * If we have the stereotype set, and either VUID or Vocabulary not set - create error status.
			 */

			if (vhimPropertyStereoType != null) {
				if (property
						.getValue(
								vhimPropertyStereoType,
								IVHIMProfileConstants.VHIM_CODED_PROPERTY_VALUE_SET_VUID_PROPERTY) == null
						||

						property
								.getValue(
										vhimPropertyStereoType,
										IVHIMProfileConstants.VHIM_CODED_PROPERTY_VOCABULARY_DOMAIN_NAME_PROPERTY) == null) {
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
