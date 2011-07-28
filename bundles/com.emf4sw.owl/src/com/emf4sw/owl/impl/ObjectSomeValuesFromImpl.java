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
import com.emf4sw.owl.ObjectSomeValuesFrom;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Some Values From</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.ObjectSomeValuesFromImpl#getSomeValuesFrom <em>Some Values From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectSomeValuesFromImpl extends ObjectPropertyRestrictionImpl implements ObjectSomeValuesFrom {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectSomeValuesFromImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.OBJECT_SOME_VALUES_FROM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassExpression getSomeValuesFrom() {
		return (ClassExpression)eGet(OWLPackage.Literals.OBJECT_SOME_VALUES_FROM__SOME_VALUES_FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSomeValuesFrom(ClassExpression newSomeValuesFrom) {
		eSet(OWLPackage.Literals.OBJECT_SOME_VALUES_FROM__SOME_VALUES_FROM, newSomeValuesFrom);
	}

} //ObjectSomeValuesFromImpl
