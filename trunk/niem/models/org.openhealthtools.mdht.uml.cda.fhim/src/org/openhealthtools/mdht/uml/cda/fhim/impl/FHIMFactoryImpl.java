/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.fhim.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openhealthtools.mdht.uml.cda.fhim.FHIMFactory;
import org.openhealthtools.mdht.uml.cda.fhim.FHIMPackage;
import org.openhealthtools.mdht.uml.cda.fhim.MyActivity;
import org.openhealthtools.mdht.uml.cda.fhim.MyDocument;
import org.openhealthtools.mdht.uml.cda.fhim.MySection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FHIMFactoryImpl extends EFactoryImpl implements FHIMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FHIMFactory init() {
		try {
			FHIMFactory theFHIMFactory = (FHIMFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/fhim"); 
			if (theFHIMFactory != null) {
				return theFHIMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FHIMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FHIMPackage.MY_DOCUMENT: return createMyDocument();
			case FHIMPackage.MY_ACTIVITY: return createMyActivity();
			case FHIMPackage.MY_SECTION: return createMySection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyDocument createMyDocument() {
		MyDocumentImpl myDocument = new MyDocumentImpl();
		return myDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyActivity createMyActivity() {
		MyActivityImpl myActivity = new MyActivityImpl();
		return myActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MySection createMySection() {
		MySectionImpl mySection = new MySectionImpl();
		return mySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIMPackage getFHIMPackage() {
		return (FHIMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FHIMPackage getPackage() {
		return FHIMPackage.eINSTANCE;
	}

} //FHIMFactoryImpl
