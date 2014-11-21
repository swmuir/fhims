/**
 */
package gov.us.fhim.profile.impl;

import gov.us.fhim.profile.FHIMPackage;
import gov.us.fhim.profile.Iso11179;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iso11179</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.us.fhim.profile.impl.Iso11179Impl#getId <em>Id</em>}</li>
 *   <li>{@link gov.us.fhim.profile.impl.Iso11179Impl#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link gov.us.fhim.profile.impl.Iso11179Impl#getCode <em>Code</em>}</li>
 *   <li>{@link gov.us.fhim.profile.impl.Iso11179Impl#getSource <em>Source</em>}</li>
 *   <li>{@link gov.us.fhim.profile.impl.Iso11179Impl#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Iso11179Impl extends MinimalEObjectImpl.Container implements Iso11179 {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeSystem() <em>Code System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeSystem() <em>Code System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystem()
	 * @generated
	 * @ordered
	 */
	protected String codeSystem = CODE_SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Property() <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Property()
	 * @generated
	 * @ordered
	 */
	protected Property base_Property;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Iso11179Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	protected EClass eStaticClass() {
		return FHIMPackage.Literals.ISO11179;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, FHIMPackage.ISO11179__ID, oldId, id));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getCodeSystem() {
		return codeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setCodeSystem(String newCodeSystem) {
		String oldCodeSystem = codeSystem;
		codeSystem = newCodeSystem;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, FHIMPackage.ISO11179__CODE_SYSTEM, oldCodeSystem, codeSystem));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, FHIMPackage.ISO11179__CODE, oldCode, code));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, FHIMPackage.ISO11179__SOURCE, oldSource, source));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Property getBase_Property() {
		if (base_Property != null && base_Property.eIsProxy()) {
			InternalEObject oldBase_Property = (InternalEObject) base_Property;
			base_Property = (Property) eResolveProxy(oldBase_Property);
			if (base_Property != oldBase_Property) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, FHIMPackage.ISO11179__BASE_PROPERTY, oldBase_Property,
						base_Property));
				}
			}
		}
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetBase_Property() {
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setBase_Property(Property newBase_Property) {
		Property oldBase_Property = base_Property;
		base_Property = newBase_Property;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, FHIMPackage.ISO11179__BASE_PROPERTY, oldBase_Property, base_Property));
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
			case FHIMPackage.ISO11179__ID:
				return getId();
			case FHIMPackage.ISO11179__CODE_SYSTEM:
				return getCodeSystem();
			case FHIMPackage.ISO11179__CODE:
				return getCode();
			case FHIMPackage.ISO11179__SOURCE:
				return getSource();
			case FHIMPackage.ISO11179__BASE_PROPERTY:
				if (resolve) {
					return getBase_Property();
				}
				return basicGetBase_Property();
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
			case FHIMPackage.ISO11179__ID:
				setId((String) newValue);
				return;
			case FHIMPackage.ISO11179__CODE_SYSTEM:
				setCodeSystem((String) newValue);
				return;
			case FHIMPackage.ISO11179__CODE:
				setCode((String) newValue);
				return;
			case FHIMPackage.ISO11179__SOURCE:
				setSource((String) newValue);
				return;
			case FHIMPackage.ISO11179__BASE_PROPERTY:
				setBase_Property((Property) newValue);
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
			case FHIMPackage.ISO11179__ID:
				setId(ID_EDEFAULT);
				return;
			case FHIMPackage.ISO11179__CODE_SYSTEM:
				setCodeSystem(CODE_SYSTEM_EDEFAULT);
				return;
			case FHIMPackage.ISO11179__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case FHIMPackage.ISO11179__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case FHIMPackage.ISO11179__BASE_PROPERTY:
				setBase_Property((Property) null);
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
			case FHIMPackage.ISO11179__ID:
				return ID_EDEFAULT == null
						? id != null
						: !ID_EDEFAULT.equals(id);
			case FHIMPackage.ISO11179__CODE_SYSTEM:
				return CODE_SYSTEM_EDEFAULT == null
						? codeSystem != null
						: !CODE_SYSTEM_EDEFAULT.equals(codeSystem);
			case FHIMPackage.ISO11179__CODE:
				return CODE_EDEFAULT == null
						? code != null
						: !CODE_EDEFAULT.equals(code);
			case FHIMPackage.ISO11179__SOURCE:
				return SOURCE_EDEFAULT == null
						? source != null
						: !SOURCE_EDEFAULT.equals(source);
			case FHIMPackage.ISO11179__BASE_PROPERTY:
				return base_Property != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", codeSystem: ");
		result.append(codeSystem);
		result.append(", code: ");
		result.append(code);
		result.append(", source: ");
		result.append(source);
		result.append(')');
		return result.toString();
	}

} // Iso11179Impl
