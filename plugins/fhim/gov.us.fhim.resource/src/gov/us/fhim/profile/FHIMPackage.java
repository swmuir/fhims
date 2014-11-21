/**
 */
package gov.us.fhim.profile;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gov.us.fhim.profile.FHIMFactory
 * @model kind="package"
 * @generated
 */
public interface FHIMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "profile";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://gov.us.fhim/profile/1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "FHIM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FHIMPackage eINSTANCE = gov.us.fhim.profile.impl.FHIMPackageImpl.init();

	/**
	 * The meta object id for the '{@link gov.us.fhim.profile.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.us.fhim.profile.impl.MappingImpl
	 * @see gov.us.fhim.profile.impl.FHIMPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__INDEX = 0;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__BASE_CLASSIFIER = 1;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__BASE_PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.us.fhim.profile.impl.IndexImpl <em>Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.us.fhim.profile.impl.IndexImpl
	 * @see gov.us.fhim.profile.impl.FHIMPackageImpl#getIndex()
	 * @generated
	 */
	int INDEX = 1;

	/**
	 * The feature id for the '<em><b>Standard Or Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__STANDARD_OR_PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.us.fhim.profile.impl.Iso11179Impl <em>Iso11179</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.us.fhim.profile.impl.Iso11179Impl
	 * @see gov.us.fhim.profile.impl.FHIMPackageImpl#getIso11179()
	 * @generated
	 */
	int ISO11179 = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO11179__ID = 0;

	/**
	 * The feature id for the '<em><b>Code System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO11179__CODE_SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO11179__CODE = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO11179__SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO11179__BASE_PROPERTY = 4;

	/**
	 * The number of structural features of the '<em>Iso11179</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO11179_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Iso11179</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO11179_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.us.fhim.profile.StandardOrProject <em>Standard Or Project</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.us.fhim.profile.StandardOrProject
	 * @see gov.us.fhim.profile.impl.FHIMPackageImpl#getStandardOrProject()
	 * @generated
	 */
	int STANDARD_OR_PROJECT = 3;

	/**
	 * Returns the meta object for class '{@link gov.us.fhim.profile.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see gov.us.fhim.profile.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.us.fhim.profile.Mapping#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Index</em>'.
	 * @see gov.us.fhim.profile.Mapping#getIndex()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Index();

	/**
	 * Returns the meta object for the reference '{@link gov.us.fhim.profile.Mapping#getBase_Classifier <em>Base Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Classifier</em>'.
	 * @see gov.us.fhim.profile.Mapping#getBase_Classifier()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Base_Classifier();

	/**
	 * Returns the meta object for the reference '{@link gov.us.fhim.profile.Mapping#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see gov.us.fhim.profile.Mapping#getBase_Property()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Base_Property();

	/**
	 * Returns the meta object for the attribute list '{@link gov.us.fhim.profile.Mapping#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Attribute</em>'.
	 * @see gov.us.fhim.profile.Mapping#getAttribute()
	 * @see #getMapping()
	 * @generated
	 */
	EAttribute getMapping_Attribute();

	/**
	 * Returns the meta object for class '{@link gov.us.fhim.profile.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index</em>'.
	 * @see gov.us.fhim.profile.Index
	 * @generated
	 */
	EClass getIndex();

	/**
	 * Returns the meta object for the attribute '{@link gov.us.fhim.profile.Index#getStandardOrProject <em>Standard Or Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Or Project</em>'.
	 * @see gov.us.fhim.profile.Index#getStandardOrProject()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_StandardOrProject();

	/**
	 * Returns the meta object for the attribute '{@link gov.us.fhim.profile.Index#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.us.fhim.profile.Index#getValue()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_Value();

	/**
	 * Returns the meta object for class '{@link gov.us.fhim.profile.Iso11179 <em>Iso11179</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iso11179</em>'.
	 * @see gov.us.fhim.profile.Iso11179
	 * @generated
	 */
	EClass getIso11179();

	/**
	 * Returns the meta object for the attribute '{@link gov.us.fhim.profile.Iso11179#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.us.fhim.profile.Iso11179#getId()
	 * @see #getIso11179()
	 * @generated
	 */
	EAttribute getIso11179_Id();

	/**
	 * Returns the meta object for the attribute '{@link gov.us.fhim.profile.Iso11179#getCodeSystem <em>Code System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code System</em>'.
	 * @see gov.us.fhim.profile.Iso11179#getCodeSystem()
	 * @see #getIso11179()
	 * @generated
	 */
	EAttribute getIso11179_CodeSystem();

	/**
	 * Returns the meta object for the attribute '{@link gov.us.fhim.profile.Iso11179#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see gov.us.fhim.profile.Iso11179#getCode()
	 * @see #getIso11179()
	 * @generated
	 */
	EAttribute getIso11179_Code();

	/**
	 * Returns the meta object for the attribute '{@link gov.us.fhim.profile.Iso11179#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see gov.us.fhim.profile.Iso11179#getSource()
	 * @see #getIso11179()
	 * @generated
	 */
	EAttribute getIso11179_Source();

	/**
	 * Returns the meta object for the reference '{@link gov.us.fhim.profile.Iso11179#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see gov.us.fhim.profile.Iso11179#getBase_Property()
	 * @see #getIso11179()
	 * @generated
	 */
	EReference getIso11179_Base_Property();

	/**
	 * Returns the meta object for enum '{@link gov.us.fhim.profile.StandardOrProject <em>Standard Or Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Standard Or Project</em>'.
	 * @see gov.us.fhim.profile.StandardOrProject
	 * @generated
	 */
	EEnum getStandardOrProject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FHIMFactory getFHIMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gov.us.fhim.profile.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.us.fhim.profile.impl.MappingImpl
		 * @see gov.us.fhim.profile.impl.FHIMPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__INDEX = eINSTANCE.getMapping_Index();

		/**
		 * The meta object literal for the '<em><b>Base Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__BASE_CLASSIFIER = eINSTANCE.getMapping_Base_Classifier();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__BASE_PROPERTY = eINSTANCE.getMapping_Base_Property();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING__ATTRIBUTE = eINSTANCE.getMapping_Attribute();

		/**
		 * The meta object literal for the '{@link gov.us.fhim.profile.impl.IndexImpl <em>Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.us.fhim.profile.impl.IndexImpl
		 * @see gov.us.fhim.profile.impl.FHIMPackageImpl#getIndex()
		 * @generated
		 */
		EClass INDEX = eINSTANCE.getIndex();

		/**
		 * The meta object literal for the '<em><b>Standard Or Project</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX__STANDARD_OR_PROJECT = eINSTANCE.getIndex_StandardOrProject();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX__VALUE = eINSTANCE.getIndex_Value();

		/**
		 * The meta object literal for the '{@link gov.us.fhim.profile.impl.Iso11179Impl <em>Iso11179</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.us.fhim.profile.impl.Iso11179Impl
		 * @see gov.us.fhim.profile.impl.FHIMPackageImpl#getIso11179()
		 * @generated
		 */
		EClass ISO11179 = eINSTANCE.getIso11179();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISO11179__ID = eINSTANCE.getIso11179_Id();

		/**
		 * The meta object literal for the '<em><b>Code System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISO11179__CODE_SYSTEM = eINSTANCE.getIso11179_CodeSystem();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISO11179__CODE = eINSTANCE.getIso11179_Code();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISO11179__SOURCE = eINSTANCE.getIso11179_Source();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISO11179__BASE_PROPERTY = eINSTANCE.getIso11179_Base_Property();

		/**
		 * The meta object literal for the '{@link gov.us.fhim.profile.StandardOrProject <em>Standard Or Project</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.us.fhim.profile.StandardOrProject
		 * @see gov.us.fhim.profile.impl.FHIMPackageImpl#getStandardOrProject()
		 * @generated
		 */
		EEnum STANDARD_OR_PROJECT = eINSTANCE.getStandardOrProject();

	}

} // FHIMPackage
