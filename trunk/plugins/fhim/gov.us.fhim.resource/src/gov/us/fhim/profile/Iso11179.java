/**
 */
package gov.us.fhim.profile;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iso11179</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.us.fhim.profile.Iso11179#getId <em>Id</em>}</li>
 *   <li>{@link gov.us.fhim.profile.Iso11179#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link gov.us.fhim.profile.Iso11179#getCode <em>Code</em>}</li>
 *   <li>{@link gov.us.fhim.profile.Iso11179#getSource <em>Source</em>}</li>
 *   <li>{@link gov.us.fhim.profile.Iso11179#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.us.fhim.profile.FHIMPackage#getIso11179()
 * @model annotation="uml2.extensions addedInVersion='1'"
 * @generated
 */
public interface Iso11179 extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see gov.us.fhim.profile.FHIMPackage#getIso11179_Id()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="uml2.extensions addedInVersion='1'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link gov.us.fhim.profile.Iso11179#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Code System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code System</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code System</em>' attribute.
	 * @see #setCodeSystem(String)
	 * @see gov.us.fhim.profile.FHIMPackage#getIso11179_CodeSystem()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="uml2.extensions addedInVersion='1'"
	 * @generated
	 */
	String getCodeSystem();

	/**
	 * Sets the value of the '{@link gov.us.fhim.profile.Iso11179#getCodeSystem <em>Code System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code System</em>' attribute.
	 * @see #getCodeSystem()
	 * @generated
	 */
	void setCodeSystem(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see gov.us.fhim.profile.FHIMPackage#getIso11179_Code()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="uml2.extensions addedInVersion='1'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link gov.us.fhim.profile.Iso11179#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see gov.us.fhim.profile.FHIMPackage#getIso11179_Source()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="uml2.extensions addedInVersion='4'"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link gov.us.fhim.profile.Iso11179#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

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
	 * @see gov.us.fhim.profile.FHIMPackage#getIso11179_Base_Property()
	 * @model required="true" ordered="false"
	 *        annotation="uml2.extensions addedInVersion='2'"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link gov.us.fhim.profile.Iso11179#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

} // Iso11179
