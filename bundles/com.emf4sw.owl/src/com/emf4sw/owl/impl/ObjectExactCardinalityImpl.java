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
import com.emf4sw.owl.ObjectExactCardinality;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Exact Cardinality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.ObjectExactCardinalityImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.ObjectExactCardinalityImpl#getOnClass <em>On Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectExactCardinalityImpl extends ObjectPropertyRestrictionImpl implements ObjectExactCardinality {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectExactCardinalityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.OBJECT_EXACT_CARDINALITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCardinality() {
		return (Integer)eGet(OWLPackage.Literals.OBJECT_EXACT_CARDINALITY__CARDINALITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(int newCardinality) {
		eSet(OWLPackage.Literals.OBJECT_EXACT_CARDINALITY__CARDINALITY, newCardinality);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassExpression getOnClass() {
		return (ClassExpression)eGet(OWLPackage.Literals.OBJECT_EXACT_CARDINALITY__ON_CLASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnClass(ClassExpression newOnClass) {
		eSet(OWLPackage.Literals.OBJECT_EXACT_CARDINALITY__ON_CLASS, newOnClass);
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
//		result.append(" (cardinality: ");
//		result.append(cardinality);
//		result.append(')');
//		return result.toString();
	}

} //ObjectExactCardinalityImpl
