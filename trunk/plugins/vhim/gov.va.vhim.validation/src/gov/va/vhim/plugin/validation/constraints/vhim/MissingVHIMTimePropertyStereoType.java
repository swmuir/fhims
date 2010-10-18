package gov.va.vhim.plugin.validation.constraints.vhim;

import gov.va.vhim.profile.util.IVHIMProfileConstants;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;

/**
 * MissingVHIMTimePropertyStereoType validates that "VHIMTimeProperty" attribute stereotype is applied 
 * to all the VHIM Domains (excluding Common and Base Datatype ) whose classes have attributes that have  
 * "PointInTime" DataType.
 * 
 * @author Srinath Vala
 *
 */
public class MissingVHIMTimePropertyStereoType extends AbstractModelConstraint {
	
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
			
			String name = property.getType().getName();
			String packageName=property.getNearestPackage().getName();
			
			if(IVHIMProfileConstants.VHIM_PACKAGE_COMMON.equals(packageName)||IVHIMProfileConstants.VHIM_PACKAGE_BASE_DATA_TYPES.equals(packageName)){
				
			}else{
				if (IVHIMProfileConstants.VHIM_STRING_PROPERTY_POINTINTIME.equals(name)) {
					
					Stereotype vhimPropertyStereoType = property
					.getAppliedStereotype(IVHIMProfileConstants.FULLYQUALIFIED_VHIM_TIME_PROPERTY_STEREOTYPE);
					
					if(vhimPropertyStereoType == null){
						status = ctx.createFailureStatus(new Object[] {
								property.getNearestPackage().getName(),
								((NamedElement) property.getOwner()).getName(),
								property.getName() });

					}

				}
			}
			
		}

		return status;

	}
}