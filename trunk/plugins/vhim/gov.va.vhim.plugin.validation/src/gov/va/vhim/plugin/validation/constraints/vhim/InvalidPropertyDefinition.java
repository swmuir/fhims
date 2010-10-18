package gov.va.vhim.plugin.validation.constraints.vhim;

import gov.va.vhim.profile.util.IVHIMProfileConstants;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EEnumLiteral;
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
 * 
 * @deprecated
 */
public class InvalidPropertyDefinition extends AbstractModelConstraint {

	public InvalidPropertyDefinition() {
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
		
		final String packages = "UMLPrimitiveTypes:Common:BaseDatatypes";
		
		if (!packages
				.contains(property.getNearestPackage().getName())){ 

		String stereoType = null;

		if (property.getType() != null) {

			String name = property.getType().getName();

			if (name != null) {
				if ("String".equals(name)) {
					stereoType = IVHIMProfileConstants.FULLYQUALIFIED_VHIM_STRING_PROPERTY_STEREOTYPE;
				} else if ("PointInTime".equals(name)) {
					stereoType = IVHIMProfileConstants.FULLYQUALIFIED_VHIM_TIME_PROPERTY_STEREOTYPE;
				} else if (name.startsWith("HL72C")) {
					stereoType = IVHIMProfileConstants.FULLYQUALIFIED_VHIM_CODED_PROPERTY_STEREOTYPE;
				} else {
					stereoType = IVHIMProfileConstants.FULLYQUALIFIED_VHIM_PROPERTY_STEREOTYPE;
				}
			}

		}

		if (property.getAssociation() == null) {

			Stereotype vhimPropertyStereoType = property
					.getAppliedStereotype(stereoType);

			if (vhimPropertyStereoType != null) {

				org.eclipse.emf.ecore.util.EcoreEList.Dynamic clients = (org.eclipse.emf.ecore.util.EcoreEList.Dynamic) property
						.getValue(
								vhimPropertyStereoType,
								IVHIMProfileConstants.VHIM_MODEL_ELEMENT_CLIENT_PROPERTY);
				if (clients.size() == 0) {
					status = ctx.createFailureStatus(new Object[] { property
							.getName() });
				} else if (clients.size() == 1) {
					EEnumLiteral el = (EEnumLiteral) clients.get(0);

					if (IVHIMProfileConstants.VHIM_MODEL_ELEMENT_CLIENT_UNSPECIFIED_ENUM
							.equals(el.getName())) {
						status = ctx.createFailureStatus(new Object[] {
								property.getNearestPackage().getName(),
								((NamedElement) property.getOwner()).getName(),
								property.getName() });
					}
				}
			}

			else {

	System.out.println(property.getNearestPackage().getName()+"."+
			((NamedElement) property.getOwner()).getName()+"."+
			property.getName());

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
