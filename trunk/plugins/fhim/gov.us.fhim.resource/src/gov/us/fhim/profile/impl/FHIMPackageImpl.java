/**
 */
package gov.us.fhim.profile.impl;

import gov.us.fhim.profile.FHIMFactory;
import gov.us.fhim.profile.FHIMPackage;
import gov.us.fhim.profile.Index;
import gov.us.fhim.profile.Iso11179;
import gov.us.fhim.profile.Mapping;
import gov.us.fhim.profile.StandardOrProject;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.uml2.types.TypesPackage;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FHIMPackageImpl extends EPackageImpl implements FHIMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iso11179EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum standardOrProjectEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see gov.us.fhim.profile.FHIMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FHIMPackageImpl() {
		super(eNS_URI, FHIMFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FHIMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FHIMPackage init() {
		if (isInited) {
			return (FHIMPackage) EPackage.Registry.INSTANCE.getEPackage(FHIMPackage.eNS_URI);
		}

		// Obtain or create and register package
		FHIMPackageImpl theFHIMPackage = (FHIMPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FHIMPackageImpl
				? EPackage.Registry.INSTANCE.get(eNS_URI)
				: new FHIMPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFHIMPackage.createPackageContents();

		// Initialize created meta-data
		theFHIMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFHIMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FHIMPackage.eNS_URI, theFHIMPackage);
		return theFHIMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EClass getMapping() {
		return mappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EReference getMapping_Index() {
		return (EReference) mappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EReference getMapping_Base_Classifier() {
		return (EReference) mappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EReference getMapping_Base_Property() {
		return (EReference) mappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EAttribute getMapping_Attribute() {
		return (EAttribute) mappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EClass getIndex() {
		return indexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EAttribute getIndex_StandardOrProject() {
		return (EAttribute) indexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EAttribute getIndex_Value() {
		return (EAttribute) indexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EClass getIso11179() {
		return iso11179EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EAttribute getIso11179_Id() {
		return (EAttribute) iso11179EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EAttribute getIso11179_CodeSystem() {
		return (EAttribute) iso11179EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EAttribute getIso11179_Code() {
		return (EAttribute) iso11179EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EAttribute getIso11179_Source() {
		return (EAttribute) iso11179EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EReference getIso11179_Base_Property() {
		return (EReference) iso11179EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EEnum getStandardOrProject() {
		return standardOrProjectEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public FHIMFactory getFHIMFactory() {
		return (FHIMFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) {
			return;
		}
		isCreated = true;

		// Create classes and their features
		mappingEClass = createEClass(MAPPING);
		createEReference(mappingEClass, MAPPING__INDEX);
		createEReference(mappingEClass, MAPPING__BASE_CLASSIFIER);
		createEReference(mappingEClass, MAPPING__BASE_PROPERTY);
		createEAttribute(mappingEClass, MAPPING__ATTRIBUTE);

		indexEClass = createEClass(INDEX);
		createEAttribute(indexEClass, INDEX__STANDARD_OR_PROJECT);
		createEAttribute(indexEClass, INDEX__VALUE);

		iso11179EClass = createEClass(ISO11179);
		createEAttribute(iso11179EClass, ISO11179__ID);
		createEAttribute(iso11179EClass, ISO11179__CODE_SYSTEM);
		createEAttribute(iso11179EClass, ISO11179__CODE);
		createEAttribute(iso11179EClass, ISO11179__SOURCE);
		createEReference(iso11179EClass, ISO11179__BASE_PROPERTY);

		// Create enums
		standardOrProjectEEnum = createEEnum(STANDARD_OR_PROJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) {
			return;
		}
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage) EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage) EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(mappingEClass, Mapping.class, "Mapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getMapping_Index(), this.getIndex(), null, "index", null, 1, -1, Mapping.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
			!IS_ORDERED);
		initEReference(
			getMapping_Base_Classifier(), theUMLPackage.getClassifier(), null, "base_Classifier", null, 1, 1,
			Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(
			getMapping_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1, Mapping.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getMapping_Attribute(), theTypesPackage.getString(), "attribute", null, 0, -1, Mapping.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(indexEClass, Index.class, "Index", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getIndex_StandardOrProject(), this.getStandardOrProject(), "standardOrProject", null, 1, 1, Index.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getIndex_Value(), theTypesPackage.getString(), "value", null, 1, 1, Index.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iso11179EClass, Iso11179.class, "Iso11179", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getIso11179_Id(), theTypesPackage.getString(), "id", null, 1, 1, Iso11179.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getIso11179_CodeSystem(), theTypesPackage.getString(), "codeSystem", null, 1, 1, Iso11179.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getIso11179_Code(), theTypesPackage.getString(), "code", null, 1, 1, Iso11179.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getIso11179_Source(), theTypesPackage.getString(), "source", null, 1, 1, Iso11179.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(
			getIso11179_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1,
			Iso11179.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(standardOrProjectEEnum, StandardOrProject.class, "StandardOrProject");
		addEEnumLiteral(standardOrProjectEEnum, StandardOrProject.CCDA);
		addEEnumLiteral(standardOrProjectEEnum, StandardOrProject.HL7CDA);
		addEEnumLiteral(standardOrProjectEEnum, StandardOrProject.HL7FHIR);
		addEEnumLiteral(standardOrProjectEEnum, StandardOrProject.HL_7V2);
		addEEnumLiteral(standardOrProjectEEnum, StandardOrProject.HL_7V3);
		addEEnumLiteral(standardOrProjectEEnum, StandardOrProject.NCPDP);
		addEEnumLiteral(standardOrProjectEEnum, StandardOrProject.X12);
		addEEnumLiteral(standardOrProjectEEnum, StandardOrProject.ONCSI_BLUE_BUTTON);
		addEEnumLiteral(standardOrProjectEEnum, StandardOrProject.ONCSICQF);
		addEEnumLiteral(standardOrProjectEEnum, StandardOrProject.ONCSIDAF);
		addEEnumLiteral(standardOrProjectEEnum, StandardOrProject.ONCSIDPROV);
		addEEnumLiteral(standardOrProjectEEnum, StandardOrProject.ONCSIDS4P);
		addEEnumLiteral(standardOrProjectEEnum, StandardOrProject.ONCS_IES_MD);
		addEEnumLiteral(standardOrProjectEEnum, StandardOrProject.ONCSIEUU_SE_HEALTH);
		addEEnumLiteral(standardOrProjectEEnum, StandardOrProject.ONCSI_HE_D);
		addEEnumLiteral(standardOrProjectEEnum, StandardOrProject.ONCSILCC);
		addEEnumLiteral(standardOrProjectEEnum, StandardOrProject.ONCSILOI);
		addEEnumLiteral(standardOrProjectEEnum, StandardOrProject.ONCSILRI);
		addEEnumLiteral(standardOrProjectEEnum, StandardOrProject.ONCSIPD);
		addEEnumLiteral(standardOrProjectEEnum, StandardOrProject.ONCSIPDMP);
		addEEnumLiteral(standardOrProjectEEnum, StandardOrProject.ONCSI_PUBLIC_HEALTH);
		addEEnumLiteral(standardOrProjectEEnum, StandardOrProject.ONCSIQH);
		addEEnumLiteral(standardOrProjectEEnum, StandardOrProject.ONCSIRH_EX);
		addEEnumLiteral(standardOrProjectEEnum, StandardOrProject.ONCSISDC);
		addEEnumLiteral(standardOrProjectEEnum, StandardOrProject.ONCSITOC);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// uml2.extensions
		createUml2Annotations();
	}

	/**
	 * Initializes the annotations for <b>uml2.extensions</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUml2Annotations() {
		String source = "uml2.extensions";
		addAnnotation(mappingEClass, source, new String[] { "addedInVersion", "1" });
		addAnnotation(getMapping_Index(), source, new String[] { "addedInVersion", "1" });
		addAnnotation(getMapping_Base_Classifier(), source, new String[] { "addedInVersion", "2" });
		addAnnotation(getMapping_Base_Property(), source, new String[] { "addedInVersion", "2" });
		addAnnotation(indexEClass, source, new String[] { "addedInVersion", "1" });
		addAnnotation(getIndex_StandardOrProject(), source, new String[] { "addedInVersion", "1" });
		addAnnotation(getIndex_Value(), source, new String[] { "addedInVersion", "1" });
		addAnnotation(standardOrProjectEEnum, source, new String[] { "addedInVersion", "1" });
		addAnnotation(standardOrProjectEEnum.getELiterals().get(0), source, new String[] { "addedInVersion", "1" });
		addAnnotation(standardOrProjectEEnum.getELiterals().get(1), source, new String[] { "addedInVersion", "4" });
		addAnnotation(standardOrProjectEEnum.getELiterals().get(2), source, new String[] { "addedInVersion", "1" });
		addAnnotation(standardOrProjectEEnum.getELiterals().get(3), source, new String[] { "addedInVersion", "1" });
		addAnnotation(standardOrProjectEEnum.getELiterals().get(4), source, new String[] { "addedInVersion", "4" });
		addAnnotation(standardOrProjectEEnum.getELiterals().get(5), source, new String[] { "addedInVersion", "4" });
		addAnnotation(standardOrProjectEEnum.getELiterals().get(6), source, new String[] { "addedInVersion", "4" });
		addAnnotation(standardOrProjectEEnum.getELiterals().get(7), source, new String[] { "addedInVersion", "4" });
		addAnnotation(standardOrProjectEEnum.getELiterals().get(8), source, new String[] { "addedInVersion", "4" });
		addAnnotation(standardOrProjectEEnum.getELiterals().get(9), source, new String[] { "addedInVersion", "4" });
		addAnnotation(standardOrProjectEEnum.getELiterals().get(10), source, new String[] { "addedInVersion", "4" });
		addAnnotation(standardOrProjectEEnum.getELiterals().get(11), source, new String[] { "addedInVersion", "4" });
		addAnnotation(standardOrProjectEEnum.getELiterals().get(12), source, new String[] { "addedInVersion", "4" });
		addAnnotation(standardOrProjectEEnum.getELiterals().get(13), source, new String[] { "addedInVersion", "4" });
		addAnnotation(standardOrProjectEEnum.getELiterals().get(14), source, new String[] { "addedInVersion", "4" });
		addAnnotation(standardOrProjectEEnum.getELiterals().get(15), source, new String[] { "addedInVersion", "4" });
		addAnnotation(standardOrProjectEEnum.getELiterals().get(16), source, new String[] { "addedInVersion", "4" });
		addAnnotation(standardOrProjectEEnum.getELiterals().get(17), source, new String[] { "addedInVersion", "4" });
		addAnnotation(standardOrProjectEEnum.getELiterals().get(18), source, new String[] { "addedInVersion", "4" });
		addAnnotation(standardOrProjectEEnum.getELiterals().get(19), source, new String[] { "addedInVersion", "4" });
		addAnnotation(standardOrProjectEEnum.getELiterals().get(20), source, new String[] { "addedInVersion", "4" });
		addAnnotation(standardOrProjectEEnum.getELiterals().get(21), source, new String[] { "addedInVersion", "4" });
		addAnnotation(standardOrProjectEEnum.getELiterals().get(22), source, new String[] { "addedInVersion", "4" });
		addAnnotation(standardOrProjectEEnum.getELiterals().get(23), source, new String[] { "addedInVersion", "4" });
		addAnnotation(standardOrProjectEEnum.getELiterals().get(24), source, new String[] { "addedInVersion", "4" });
		addAnnotation(iso11179EClass, source, new String[] { "addedInVersion", "1" });
		addAnnotation(getIso11179_Id(), source, new String[] { "addedInVersion", "1" });
		addAnnotation(getIso11179_CodeSystem(), source, new String[] { "addedInVersion", "1" });
		addAnnotation(getIso11179_Code(), source, new String[] { "addedInVersion", "1" });
		addAnnotation(getIso11179_Source(), source, new String[] { "addedInVersion", "4" });
		addAnnotation(getIso11179_Base_Property(), source, new String[] { "addedInVersion", "2" });
	}

} // FHIMPackageImpl
