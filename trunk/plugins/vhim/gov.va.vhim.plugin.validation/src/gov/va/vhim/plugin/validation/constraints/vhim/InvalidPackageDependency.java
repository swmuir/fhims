package gov.va.vhim.plugin.validation.constraints.vhim;

import java.util.Collections;
import java.util.HashMap;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.util.UMLSwitch;

/*
* InvalidPackageDependency determines if a VHIM Domain package is referencing another
* VHIMDomain package. It would seem there should be an api level call on
* Package to give you a list of what packages it is dependent on. I could not
* find one - took this from original CheckModel Action.
* 
* @TODO Need to configure which packages are allowed to create dependencies and
*       which ones are not dynamicaly. Currently logic is hardcoded to support
*       common and basedataypes.
* 
* @author muirs
*/

public class InvalidPackageDependency extends AbstractModelConstraint {
	
	public HashMap<String, Property> packages = new HashMap<String,Property>();
	
	 public class PackageDependenciesSwitch extends UMLSwitch {

		@Override
		public Object caseProperty(Property object) {
			
//			System.out.println(object.getQualifiedName());
//			packages = null;
			
			if (object.getType() != null) {

				if (!packages.containsKey(object.getType().getNearestPackage())) {
					
//					System.out.println(object.getName() + " defined as " + object.getType().getQualifiedName());
					
					packages.put(object.getType().getNearestPackage().getQualifiedName(),
							object);
				}
			}
			return object;
		}
		
		
		
	}

	public InvalidPackageDependency() {
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

		System.out.println("Checking " + pckge.getQualifiedName());
		IStatus status = ctx.createSuccessStatus();
		
		PackageDependenciesSwitch packageDependenciesSwitch = new PackageDependenciesSwitch();
		
		
		packages.clear();
		
//		for (Object object : pckge.getOwnedElements() )
//		{
//			packageDependenciesSwitch.doSwitch((EObject)object);
//		}
		
		for (TreeIterator iterator = EcoreUtil.getAllContents(Collections
				.singletonList(pckge)); iterator.hasNext();) {
			EObject child = (EObject) iterator.next();
			
			packageDependenciesSwitch.doSwitch(child);
			
		}
		
		
		for (String dependencies:packages.keySet())
		{
			System.out.println(pckge.getName()+ " depends on package " + dependencies + " from "+ packages.get(dependencies).getQualifiedName());
		}
		
//		
//		for (Object object  : pckge.getElementImports())
//		{
//			ElementImport packageImport = (ElementImport )object;
//			
//			
//			System.out.println(pckge.getQualifiedName() + " imports " + packageImport.getNearestPackage().getQualifiedName());
//			
//		}
		

//		Stereotype vhimPackageStereoType =
//			pckge.getAppliedStereotype(IVHIMProfileConstants.VHIM_PROFILE_NAME + "::" + IVHIMProfileConstants.VHIM_PACKAGE_STEREOTYPE);
//		if ((vhimPackageStereoType != null) && ((EnumerationLiteral) 
//				(pckge.getValue(vhimPackageStereoType, IVHIMProfileConstants.VHIM_PACKAGE_PACKAGE_TYPE_PROPERTY))).
//				getName().equalsIgnoreCase(IVHIMProfileConstants.VHIM_PACKAGE_PACKAGE_TYPE_DOMAIN_ENUM)) {
//			
//			String currentPackage = pckge.getName();
//
//			final String packages = "UMLPrimitiveTypes:Common:BaseDatatypes";
//
//			for (Iterator it1 = pckge.allOwnedElements().iterator(); it1
//					.hasNext();) {
//
//				Object obj = it1.next();
//
//				if (obj instanceof Class) {
//
//					Class clz = (Class) obj;
//
//					List clzAttrs = clz.getAllAttributes();
//
//					for (Iterator it2 = clzAttrs.iterator(); it2.hasNext();) {
//
//						Object obj2 = it2.next();
//
//						if (obj2 instanceof Property) {
//
//							Property prpt = (Property) obj2;
//
//							Type propType = prpt.getType();
//
//							if (propType instanceof PrimitiveType) {
//
//								if (propType.getPackage() != null) {
//
//									String dependentPackage = propType
//											.getPackage().getName();
//									
////									org.eclipse.uml2.uml.Package p = propType.getPackage();
//
//									if (!dependentPackage
//											.equalsIgnoreCase(currentPackage)) {
//
//										if (!packages
//												.contains(dependentPackage)) {
//											status = ctx
//													.createFailureStatus(new Object[] {
//															currentPackage,
//															dependentPackage,
//															prpt
//																	.getQualifiedName() });
//										}
//
//									}
//								}
//							}
//
//						}
//					}
//
//				}
//
//			}
//
//		}

		return status;

	}

}
