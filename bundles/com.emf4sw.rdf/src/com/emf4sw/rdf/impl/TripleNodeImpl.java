/*******************************************************************************
 * Copyright (c) 2011 Guillaume Hillairet.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Guillaume Hillairet - initial API and implementation
 *******************************************************************************/
package com.emf4sw.rdf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.emf4sw.rdf.RDFPackage;
import com.emf4sw.rdf.Triple;
import com.emf4sw.rdf.TripleNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Triple Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.rdf.impl.TripleNodeImpl#getTriple <em>Triple</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TripleNodeImpl extends ResourceImpl implements TripleNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TripleNodeImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDFPackage.Literals.TRIPLE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Triple getTriple() {
		return (Triple)eGet(RDFPackage.Literals.TRIPLE_NODE__TRIPLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriple(Triple newTriple) {
		eSet(RDFPackage.Literals.TRIPLE_NODE__TRIPLE, newTriple);
	}

} //TripleNodeImpl
