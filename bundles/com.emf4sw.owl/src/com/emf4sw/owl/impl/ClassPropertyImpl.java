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
import com.emf4sw.owl.ClassProperty;
import com.emf4sw.owl.OWLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.ClassPropertyImpl#getIsFunctional <em>Is Functional</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.ClassPropertyImpl#getDomain <em>Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ClassPropertyImpl extends OWLPropertyImpl implements ClassProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.CLASS_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsFunctional() {
		return (Boolean)eGet(OWLPackage.Literals.CLASS_PROPERTY__IS_FUNCTIONAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFunctional(Boolean newIsFunctional) {
		eSet(OWLPackage.Literals.CLASS_PROPERTY__IS_FUNCTIONAL, newIsFunctional);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ClassExpression> getDomain() {
		return (EList<ClassExpression>)eGet(OWLPackage.Literals.CLASS_PROPERTY__DOMAIN, true);
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
//		result.append(" (isFunctional: ");
//		result.append(isFunctional);
//		result.append(')');
//		return result.toString();
	}

} //ClassPropertyImpl
