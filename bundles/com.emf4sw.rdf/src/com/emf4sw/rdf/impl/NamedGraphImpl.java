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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import com.emf4sw.rdf.DocumentGraph;
import com.emf4sw.rdf.NamedGraph;
import com.emf4sw.rdf.Node;
import com.emf4sw.rdf.Property;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.RDFPackage;
import com.emf4sw.rdf.Resource;
import com.emf4sw.rdf.Triple;
import com.emf4sw.rdf.operations.RDFUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.rdf.impl.NamedGraphImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.NamedGraphImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.NamedGraphImpl#getObjectOf <em>Object Of</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.NamedGraphImpl#getDocument <em>Document</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamedGraphImpl extends RDFGraphImpl implements NamedGraph {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDFPackage.Literals.NAMED_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return (String)eGet(RDFPackage.Literals.NODE__LABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		eSet(RDFPackage.Literals.NODE__LABEL, newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return (String)eGet(RDFPackage.Literals.NODE__COMMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		eSet(RDFPackage.Literals.NODE__COMMENT, newComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	@Override
	public void add(RDFGraph graph) {
		for (Triple triple: graph.getTriples()) {
			RDFUtil.copyTriple(triple, this);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public EList<Triple> listAllTriples() {
		return getTriples();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public EList<Resource> listAllResources() {
		final Collection<Resource> all = 
			EcoreUtil.getObjectsByType(getNodes(), RDFPackage.eINSTANCE.getResource());
		return new BasicEList<Resource>(all);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public EList<Property> listAllProperties() {
		final Collection<Property> all = 
			EcoreUtil.getObjectsByType(getNodes(), RDFPackage.eINSTANCE.getProperty());
		return new BasicEList<Property>(all);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Triple> getObjectOf() {
		return (EList<Triple>)eGet(RDFPackage.Literals.NODE__OBJECT_OF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentGraph getDocument() {
		return (DocumentGraph)eGet(RDFPackage.Literals.NAMED_GRAPH__DOCUMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocument(DocumentGraph newDocument) {
		eSet(RDFPackage.Literals.NAMED_GRAPH__DOCUMENT, newDocument);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Node.class) {
			switch (derivedFeatureID) {
				case RDFPackage.NAMED_GRAPH__LABEL: return RDFPackage.NODE__LABEL;
				case RDFPackage.NAMED_GRAPH__COMMENT: return RDFPackage.NODE__COMMENT;
				case RDFPackage.NAMED_GRAPH__OBJECT_OF: return RDFPackage.NODE__OBJECT_OF;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Node.class) {
			switch (baseFeatureID) {
				case RDFPackage.NODE__LABEL: return RDFPackage.NAMED_GRAPH__LABEL;
				case RDFPackage.NODE__COMMENT: return RDFPackage.NAMED_GRAPH__COMMENT;
				case RDFPackage.NODE__OBJECT_OF: return RDFPackage.NAMED_GRAPH__OBJECT_OF;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();
		
		return "<"+getURI()+">";
	}

} //NamedGraphImpl
