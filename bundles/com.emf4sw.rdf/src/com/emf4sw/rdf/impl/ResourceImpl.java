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
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.emf4sw.rdf.Literal;
import com.emf4sw.rdf.Namespace;
import com.emf4sw.rdf.Node;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.RDFPackage;
import com.emf4sw.rdf.Resource;
import com.emf4sw.rdf.Triple;
import com.emf4sw.rdf.URIElement;
import com.emf4sw.rdf.vocabulary.RDF;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.rdf.impl.ResourceImpl#getURI <em>URI</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.ResourceImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.ResourceImpl#getGraph <em>Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceImpl extends SubjectNodeImpl implements Resource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDFPackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getURI() {
		return (String)eGet(RDFPackage.Literals.URI_ELEMENT__URI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setURI(String newURI) {
		eSet(RDFPackage.Literals.URI_ELEMENT__URI, newURI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getNamespace() {
		return (Namespace)eGet(RDFPackage.Literals.URI_ELEMENT__NAMESPACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(Namespace newNamespace) {
		eSet(RDFPackage.Literals.URI_ELEMENT__NAMESPACE, newNamespace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFGraph getGraph() {
		return (RDFGraph)eGet(RDFPackage.Literals.RESOURCE__GRAPH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraph(RDFGraph newGraph) {
		eSet(RDFPackage.Literals.RESOURCE__GRAPH, newGraph);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getLocalName() {
		final URI uri = URI.createURI(getURI());
		if (uri.hasFragment()) return uri.fragment();
		else 
			return uri.lastSegment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isTypeOf(String uri) {
		for (Node resource: getTypes()) {
			if (resource instanceof Resource && 
					uri.equals( ((Resource)resource).getURI())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Resource> getTypes() {
		final EList<Resource> types = new BasicEList<Resource>();
		for (Triple triple: getSubjectOf()) {
			if (triple.getPredicate().getURI().equals(RDF.type)) {
				types.add((Resource) triple.getObject());
			}
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getStringValue(String uri) {
		final Literal aLiteral = 
			(Literal) EcoreUtil.getObjectByType(getValues(uri), RDFPackage.eINSTANCE.getLiteral());
		return aLiteral != null ? aLiteral.getLexicalForm() : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Node> getValues(String uri) {
		final EList<Node> aList = new BasicEList<Node>();
		for (Triple aTriple: this.getSubjectOf()) {
			if (aTriple.getPredicate().getURI().equals(uri)) {
				aList.add(aTriple.getObject());
			}
		}
		return aList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getURIValues(String uri) {
		final EList<String> aList = new BasicEList<String>();
		for (Node aNode: getObject(uri)) {
			if (aNode instanceof URIElement) {
				aList.add(((URIElement) aNode).getURI());
			}
		}
		return aList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Node> getObject(String uri) {
		final EList<Node> objects = new BasicEList<Node>();
		for (Triple triple: getSubjectOf()) {
			if (triple.getPredicate().getURI().equals(uri)) {
				objects.add( triple.getObject() );
			}
		}
		return objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getStringValues(String uri) {
		final EList<String> values = new BasicEList<String>();
		final Collection<Literal> literals = 
			EcoreUtil.getObjectsByType(getValues(uri), RDFPackage.eINSTANCE.getLiteral());
		
		for (Literal literal: literals) {
			values.add(literal.getLexicalForm());
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RDFPackage.RESOURCE__GRAPH:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				//return basicSetGraph((RDFGraph)otherEnd, msgs);
				return eBasicSetContainer(otherEnd, RDFPackage.RESOURCE__GRAPH, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == URIElement.class) {
			switch (derivedFeatureID) {
				case RDFPackage.RESOURCE__URI: return RDFPackage.URI_ELEMENT__URI;
				case RDFPackage.RESOURCE__NAMESPACE: return RDFPackage.URI_ELEMENT__NAMESPACE;
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
		if (baseClass == URIElement.class) {
			switch (baseFeatureID) {
				case RDFPackage.URI_ELEMENT__URI: return RDFPackage.RESOURCE__URI;
				case RDFPackage.URI_ELEMENT__NAMESPACE: return RDFPackage.RESOURCE__NAMESPACE;
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

} //ResourceImpl
