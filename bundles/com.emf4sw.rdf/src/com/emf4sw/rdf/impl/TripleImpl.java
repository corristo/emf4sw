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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.emf4sw.rdf.Node;
import com.emf4sw.rdf.Property;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.RDFPackage;
import com.emf4sw.rdf.SubjectNode;
import com.emf4sw.rdf.Triple;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Triple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.rdf.impl.TripleImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.TripleImpl#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.TripleImpl#getObject <em>Object</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.TripleImpl#getGraph <em>Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TripleImpl extends CDOObjectImpl implements Triple {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TripleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDFPackage.Literals.TRIPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectNode getSubject() {
		return (SubjectNode)eGet(RDFPackage.Literals.TRIPLE__SUBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(SubjectNode newSubject) {
		eSet(RDFPackage.Literals.TRIPLE__SUBJECT, newSubject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getPredicate() {
		return (Property)eGet(RDFPackage.Literals.TRIPLE__PREDICATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredicate(Property newPredicate) {
		eSet(RDFPackage.Literals.TRIPLE__PREDICATE, newPredicate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getObject() {
		return (Node)eGet(RDFPackage.Literals.TRIPLE__OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(Node newObject) {
		eSet(RDFPackage.Literals.TRIPLE__OBJECT, newObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFGraph getGraph() {
		return (RDFGraph)eGet(RDFPackage.Literals.TRIPLE__GRAPH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraph(RDFGraph newGraph) {
		eSet(RDFPackage.Literals.TRIPLE__GRAPH, newGraph);
	}

	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();
		
		return getSubject() + " " + getPredicate() + " " + getObject();
	}
} //TripleImpl
