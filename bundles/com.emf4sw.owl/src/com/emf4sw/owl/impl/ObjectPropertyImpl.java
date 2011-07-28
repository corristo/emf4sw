/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import com.emf4sw.owl.ClassExpression;
import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.ObjectProperty;
import com.emf4sw.owl.impl.notify.ClassPropertyTripleAdapter.ObjectPropertyTripleAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.ObjectPropertyImpl#getIsInverseFunctional <em>Is Inverse Functional</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.ObjectPropertyImpl#getIsSymmetric <em>Is Symmetric</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.ObjectPropertyImpl#getIsAsymmetric <em>Is Asymmetric</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.ObjectPropertyImpl#getIsTransitive <em>Is Transitive</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.ObjectPropertyImpl#getIsReflexive <em>Is Reflexive</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.ObjectPropertyImpl#getIsIrreflexive <em>Is Irreflexive</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.ObjectPropertyImpl#getInverseOf <em>Inverse Of</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.ObjectPropertyImpl#getRange <em>Range</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.ObjectPropertyImpl#getEquivalentProperties <em>Equivalent Properties</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.ObjectPropertyImpl#getSubPropertyOf <em>Sub Property Of</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.ObjectPropertyImpl#getDisjointProperties <em>Disjoint Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectPropertyImpl extends ClassPropertyImpl implements ObjectProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ObjectPropertyImpl() {
		super();
		eAdapters().add(new ObjectPropertyTripleAdapter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.OBJECT_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsInverseFunctional() {
		return (Boolean)eGet(OWLPackage.Literals.OBJECT_PROPERTY__IS_INVERSE_FUNCTIONAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInverseFunctional(Boolean newIsInverseFunctional) {
		eSet(OWLPackage.Literals.OBJECT_PROPERTY__IS_INVERSE_FUNCTIONAL, newIsInverseFunctional);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsSymmetric() {
		return (Boolean)eGet(OWLPackage.Literals.OBJECT_PROPERTY__IS_SYMMETRIC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSymmetric(Boolean newIsSymmetric) {
		eSet(OWLPackage.Literals.OBJECT_PROPERTY__IS_SYMMETRIC, newIsSymmetric);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsAsymmetric() {
		return (Boolean)eGet(OWLPackage.Literals.OBJECT_PROPERTY__IS_ASYMMETRIC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAsymmetric(Boolean newIsAsymmetric) {
		eSet(OWLPackage.Literals.OBJECT_PROPERTY__IS_ASYMMETRIC, newIsAsymmetric);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsTransitive() {
		return (Boolean)eGet(OWLPackage.Literals.OBJECT_PROPERTY__IS_TRANSITIVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTransitive(Boolean newIsTransitive) {
		eSet(OWLPackage.Literals.OBJECT_PROPERTY__IS_TRANSITIVE, newIsTransitive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsReflexive() {
		return (Boolean)eGet(OWLPackage.Literals.OBJECT_PROPERTY__IS_REFLEXIVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReflexive(Boolean newIsReflexive) {
		eSet(OWLPackage.Literals.OBJECT_PROPERTY__IS_REFLEXIVE, newIsReflexive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsIrreflexive() {
		return (Boolean)eGet(OWLPackage.Literals.OBJECT_PROPERTY__IS_IRREFLEXIVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsIrreflexive(Boolean newIsIrreflexive) {
		eSet(OWLPackage.Literals.OBJECT_PROPERTY__IS_IRREFLEXIVE, newIsIrreflexive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ObjectProperty> getInverseOf() {
		return (EList<ObjectProperty>)eGet(OWLPackage.Literals.OBJECT_PROPERTY__INVERSE_OF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ClassExpression> getRange() {
		return (EList<ClassExpression>)eGet(OWLPackage.Literals.OBJECT_PROPERTY__RANGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ObjectProperty> getEquivalentProperties() {
		return (EList<ObjectProperty>)eGet(OWLPackage.Literals.OBJECT_PROPERTY__EQUIVALENT_PROPERTIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ObjectProperty> getSubPropertyOf() {
		return (EList<ObjectProperty>)eGet(OWLPackage.Literals.OBJECT_PROPERTY__SUB_PROPERTY_OF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ObjectProperty> getDisjointProperties() {
		return (EList<ObjectProperty>)eGet(OWLPackage.Literals.OBJECT_PROPERTY__DISJOINT_PROPERTIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
//		if (eIsProxy()) 
		return super.toString();

//		StringBuffer result = new StringBuffer(super.toString());
//		result.append(" (isInverseFunctional: ");
//		result.append(isInverseFunctional);
//		result.append(", isSymmetric: ");
//		result.append(isSymmetric);
//		result.append(", isAsymmetric: ");
//		result.append(isAsymmetric);
//		result.append(", isTransitive: ");
//		result.append(isTransitive);
//		result.append(", isReflexive: ");
//		result.append(isReflexive);
//		result.append(", isIrreflexive: ");
//		result.append(isIrreflexive);
//		result.append(')');
//		return result.toString();
	}

} //ObjectPropertyImpl
