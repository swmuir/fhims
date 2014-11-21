/**
 */
package gov.us.fhim.profile.impl;

import gov.us.fhim.profile.FHIMPackage;
import gov.us.fhim.profile.Index;
import gov.us.fhim.profile.StandardOrProject;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.us.fhim.profile.impl.IndexImpl#getStandardOrProject <em>Standard Or Project</em>}</li>
 *   <li>{@link gov.us.fhim.profile.impl.IndexImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndexImpl extends MinimalEObjectImpl.Container implements Index {
	/**
	 * The default value of the '{@link #getStandardOrProject() <em>Standard Or Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardOrProject()
	 * @generated
	 * @ordered
	 */
	protected static final StandardOrProject STANDARD_OR_PROJECT_EDEFAULT = StandardOrProject.CCDA;

	/**
	 * The cached value of the '{@link #getStandardOrProject() <em>Standard Or Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardOrProject()
	 * @generated
	 * @ordered
	 */
	protected StandardOrProject standardOrProject = STANDARD_OR_PROJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	protected EClass eStaticClass() {
		return FHIMPackage.Literals.INDEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public StandardOrProject getStandardOrProject() {
		return standardOrProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setStandardOrProject(StandardOrProject newStandardOrProject) {
		StandardOrProject oldStandardOrProject = standardOrProject;
		standardOrProject = newStandardOrProject == null
				? STANDARD_OR_PROJECT_EDEFAULT
				: newStandardOrProject;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, FHIMPackage.INDEX__STANDARD_OR_PROJECT, oldStandardOrProject, standardOrProject));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, FHIMPackage.INDEX__VALUE, oldValue, value));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FHIMPackage.INDEX__STANDARD_OR_PROJECT:
				return getStandardOrProject();
			case FHIMPackage.INDEX__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FHIMPackage.INDEX__STANDARD_OR_PROJECT:
				setStandardOrProject((StandardOrProject) newValue);
				return;
			case FHIMPackage.INDEX__VALUE:
				setValue((String) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FHIMPackage.INDEX__STANDARD_OR_PROJECT:
				setStandardOrProject(STANDARD_OR_PROJECT_EDEFAULT);
				return;
			case FHIMPackage.INDEX__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FHIMPackage.INDEX__STANDARD_OR_PROJECT:
				return standardOrProject != STANDARD_OR_PROJECT_EDEFAULT;
			case FHIMPackage.INDEX__VALUE:
				return VALUE_EDEFAULT == null
						? value != null
						: !VALUE_EDEFAULT.equals(value);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (standardOrProject: ");
		result.append(standardOrProject);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} // IndexImpl
