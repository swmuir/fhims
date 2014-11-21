/**
 */
package gov.us.fhim.profile.impl;

import gov.us.fhim.profile.FHIMPackage;
import gov.us.fhim.profile.Index;
import gov.us.fhim.profile.Mapping;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.us.fhim.profile.impl.MappingImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link gov.us.fhim.profile.impl.MappingImpl#getBase_Classifier <em>Base Classifier</em>}</li>
 *   <li>{@link gov.us.fhim.profile.impl.MappingImpl#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link gov.us.fhim.profile.impl.MappingImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingImpl extends MinimalEObjectImpl.Container implements Mapping {
	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected EList<Index> index;

	/**
	 * The cached value of the '{@link #getBase_Classifier() <em>Base Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Classifier()
	 * @generated
	 * @ordered
	 */
	protected Classifier base_Classifier;

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
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<String> attribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	protected EClass eStaticClass() {
		return FHIMPackage.Literals.MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Index> getIndex() {
		if (index == null) {
			index = new EObjectContainmentEList<Index>(Index.class, this, FHIMPackage.MAPPING__INDEX);
		}
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Classifier getBase_Classifier() {
		if (base_Classifier != null && base_Classifier.eIsProxy()) {
			InternalEObject oldBase_Classifier = (InternalEObject) base_Classifier;
			base_Classifier = (Classifier) eResolveProxy(oldBase_Classifier);
			if (base_Classifier != oldBase_Classifier) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, FHIMPackage.MAPPING__BASE_CLASSIFIER, oldBase_Classifier,
						base_Classifier));
				}
			}
		}
		return base_Classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetBase_Classifier() {
		return base_Classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setBase_Classifier(Classifier newBase_Classifier) {
		Classifier oldBase_Classifier = base_Classifier;
		base_Classifier = newBase_Classifier;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, FHIMPackage.MAPPING__BASE_CLASSIFIER, oldBase_Classifier, base_Classifier));
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
						this, Notification.RESOLVE, FHIMPackage.MAPPING__BASE_PROPERTY, oldBase_Property, base_Property));
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
				this, Notification.SET, FHIMPackage.MAPPING__BASE_PROPERTY, oldBase_Property, base_Property));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<String> getAttribute() {
		if (attribute == null) {
			attribute = new EDataTypeUniqueEList<String>(String.class, this, FHIMPackage.MAPPING__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIMPackage.MAPPING__INDEX:
				return ((InternalEList<?>) getIndex()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FHIMPackage.MAPPING__INDEX:
				return getIndex();
			case FHIMPackage.MAPPING__BASE_CLASSIFIER:
				if (resolve) {
					return getBase_Classifier();
				}
				return basicGetBase_Classifier();
			case FHIMPackage.MAPPING__BASE_PROPERTY:
				if (resolve) {
					return getBase_Property();
				}
				return basicGetBase_Property();
			case FHIMPackage.MAPPING__ATTRIBUTE:
				return getAttribute();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FHIMPackage.MAPPING__INDEX:
				getIndex().clear();
				getIndex().addAll((Collection<? extends Index>) newValue);
				return;
			case FHIMPackage.MAPPING__BASE_CLASSIFIER:
				setBase_Classifier((Classifier) newValue);
				return;
			case FHIMPackage.MAPPING__BASE_PROPERTY:
				setBase_Property((Property) newValue);
				return;
			case FHIMPackage.MAPPING__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends String>) newValue);
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
			case FHIMPackage.MAPPING__INDEX:
				getIndex().clear();
				return;
			case FHIMPackage.MAPPING__BASE_CLASSIFIER:
				setBase_Classifier((Classifier) null);
				return;
			case FHIMPackage.MAPPING__BASE_PROPERTY:
				setBase_Property((Property) null);
				return;
			case FHIMPackage.MAPPING__ATTRIBUTE:
				getAttribute().clear();
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
			case FHIMPackage.MAPPING__INDEX:
				return index != null && !index.isEmpty();
			case FHIMPackage.MAPPING__BASE_CLASSIFIER:
				return base_Classifier != null;
			case FHIMPackage.MAPPING__BASE_PROPERTY:
				return base_Property != null;
			case FHIMPackage.MAPPING__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
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
		result.append(" (attribute: ");
		result.append(attribute);
		result.append(')');
		return result.toString();
	}

} // MappingImpl
