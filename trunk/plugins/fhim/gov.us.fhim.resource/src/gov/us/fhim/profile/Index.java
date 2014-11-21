/**
 */
package gov.us.fhim.profile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.us.fhim.profile.Index#getStandardOrProject <em>Standard Or Project</em>}</li>
 *   <li>{@link gov.us.fhim.profile.Index#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.us.fhim.profile.FHIMPackage#getIndex()
 * @model annotation="uml2.extensions addedInVersion='1'"
 * @generated
 */
public interface Index extends EObject {
	/**
	 * Returns the value of the '<em><b>Standard Or Project</b></em>' attribute.
	 * The literals are from the enumeration {@link gov.us.fhim.profile.StandardOrProject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Or Project</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Or Project</em>' attribute.
	 * @see gov.us.fhim.profile.StandardOrProject
	 * @see #setStandardOrProject(StandardOrProject)
	 * @see gov.us.fhim.profile.FHIMPackage#getIndex_StandardOrProject()
	 * @model required="true" ordered="false"
	 *        annotation="uml2.extensions addedInVersion='1'"
	 * @generated
	 */
	StandardOrProject getStandardOrProject();

	/**
	 * Sets the value of the '{@link gov.us.fhim.profile.Index#getStandardOrProject <em>Standard Or Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Or Project</em>' attribute.
	 * @see gov.us.fhim.profile.StandardOrProject
	 * @see #getStandardOrProject()
	 * @generated
	 */
	void setStandardOrProject(StandardOrProject value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see gov.us.fhim.profile.FHIMPackage#getIndex_Value()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="uml2.extensions addedInVersion='1'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link gov.us.fhim.profile.Index#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Index
