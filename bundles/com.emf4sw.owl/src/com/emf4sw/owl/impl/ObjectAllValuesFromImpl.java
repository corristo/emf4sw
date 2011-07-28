/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.emf4sw.owl.ClassExpression;
import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.ObjectAllValuesFrom;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object All Values From</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.ObjectAllValuesFromImpl#getAllValuesFrom <em>All Values From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectAllValuesFromImpl extends ObjectPropertyRestrictionImpl implements ObjectAllValuesFrom {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectAllValuesFromImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.OBJECT_ALL_VALUES_FROM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassExpression getAllValuesFrom() {
		return (ClassExpression)eGet(OWLPackage.Literals.OBJECT_ALL_VALUES_FROM__ALL_VALUES_FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllValuesFrom(ClassExpression newAllValuesFrom) {
		eSet(OWLPackage.Literals.OBJECT_ALL_VALUES_FROM__ALL_VALUES_FROM, newAllValuesFrom);
	}

} //ObjectAllValuesFromImpl
