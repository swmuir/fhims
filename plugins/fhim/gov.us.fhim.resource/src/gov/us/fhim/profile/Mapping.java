/**
 */
package gov.us.fhim.profile;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.us.fhim.profile.Mapping#getIndex <em>Index</em>}</li>
 *   <li>{@link gov.us.fhim.profile.Mapping#getBase_Classifier <em>Base Classifier</em>}</li>
 *   <li>{@link gov.us.fhim.profile.Mapping#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link gov.us.fhim.profile.Mapping#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.us.fhim.profile.FHIMPackage#getMapping()
 * @model annotation="uml2.extensions addedInVersion='1'"
 * @generated
 */
public interface Mapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' containment reference list.
	 * The list contents are of type {@link gov.us.fhim.profile.Index}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' containment reference list.
	 * @see gov.us.fhim.profile.FHIMPackage#getMapping_Index()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="uml2.extensions addedInVersion='1'"
	 * @generated
	 */
	EList<Index> getIndex();

	/**
	 * Returns the value of the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Classifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Classifier</em>' reference.
	 * @see #setBase_Classifier(Classifier)
	 * @see gov.us.fhim.profile.FHIMPackage#getMapping_Base_Classifier()
	 * @model required="true" ordered="false"
	 *        annotation="uml2.extensions addedInVersion='2'"
	 * @generated
	 */
	Classifier getBase_Classifier();

	/**
	 * Sets the value of the '{@link gov.us.fhim.profile.Mapping#getBase_Classifier <em>Base Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Classifier</em>' reference.
	 * @see #getBase_Classifier()
	 * @generated
	 */
	void setBase_Classifier(Classifier value);

	/**
	 * Returns the value of the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Property</em>' reference.
	 * @see #setBase_Property(Property)
	 * @see gov.us.fhim.profile.FHIMPackage#getMapping_Base_Property()
	 * @model required="true" ordered="false"
	 *        annotation="uml2.extensions addedInVersion='2'"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link gov.us.fhim.profile.Mapping#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' attribute list.
	 * @see gov.us.fhim.profile.FHIMPackage#getMapping_Attribute()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getAttribute();

} // Mapping
