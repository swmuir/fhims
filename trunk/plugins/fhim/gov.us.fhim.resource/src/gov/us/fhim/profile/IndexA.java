/**
 */
package gov.us.fhim.profile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.us.fhim.profile.IndexA#getOne <em>One</em>}</li>
 *   <li>{@link gov.us.fhim.profile.IndexA#getTwp <em>Twp</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.us.fhim.profile.FHIMPackage#getIndexA()
 * @model
 * @generated
 */
public interface IndexA extends EObject {
	/**
	 * Returns the value of the '<em><b>One</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>One</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>One</em>' attribute.
	 * @see #setOne(String)
	 * @see gov.us.fhim.profile.FHIMPackage#getIndexA_One()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="uml2.extensions addedInVersion='1'"
	 * @generated
	 */
	String getOne();

	/**
	 * Sets the value of the '{@link gov.us.fhim.profile.IndexA#getOne <em>One</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>One</em>' attribute.
	 * @see #getOne()
	 * @generated
	 */
	void setOne(String value);

	/**
	 * Returns the value of the '<em><b>Twp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Twp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Twp</em>' attribute.
	 * @see #setTwp(String)
	 * @see gov.us.fhim.profile.FHIMPackage#getIndexA_Twp()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="uml2.extensions addedInVersion='1'"
	 * @generated
	 */
	String getTwp();

	/**
	 * Sets the value of the '{@link gov.us.fhim.profile.IndexA#getTwp <em>Twp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Twp</em>' attribute.
	 * @see #getTwp()
	 * @generated
	 */
	void setTwp(String value);

} // IndexA
