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

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import com.emf4sw.rdf.BlankNode;
import com.emf4sw.rdf.Datatype;
import com.emf4sw.rdf.Literal;
import com.emf4sw.rdf.Node;
import com.emf4sw.rdf.Property;
import com.emf4sw.rdf.RDFFactory;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.RDFPackage;
import com.emf4sw.rdf.Resource;
import com.emf4sw.rdf.SubjectNode;
import com.emf4sw.rdf.Triple;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.rdf.impl.RDFGraphImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.RDFGraphImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.RDFGraphImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.RDFGraphImpl#getBlankNodes <em>Blank Nodes</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.RDFGraphImpl#getDatatypes <em>Datatypes</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.RDFGraphImpl#getLiterals <em>Literals</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.RDFGraphImpl#getTriples <em>Triples</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RDFGraphImpl extends URIElementImpl implements RDFGraph {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDFGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDFPackage.Literals.RDF_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getNodes() {
		return (FeatureMap)eGet(RDFPackage.Literals.RDF_GRAPH__NODES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Resource> getResources() {
		return (EList<Resource>)eGet(RDFPackage.Literals.RDF_GRAPH__RESOURCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Property> getProperties() {
		return (EList<Property>)eGet(RDFPackage.Literals.RDF_GRAPH__PROPERTIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BlankNode> getBlankNodes() {
		return (EList<BlankNode>)eGet(RDFPackage.Literals.RDF_GRAPH__BLANK_NODES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Datatype> getDatatypes() {
		return (EList<Datatype>)eGet(RDFPackage.Literals.RDF_GRAPH__DATATYPES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Literal> getLiterals() {
		return (EList<Literal>)eGet(RDFPackage.Literals.RDF_GRAPH__LITERALS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Triple> getTriples() {
		return (EList<Triple>)eGet(RDFPackage.Literals.RDF_GRAPH__TRIPLES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isEquivalentTo(RDFGraph graph) {
		return false;
//		return RDFOperations.equivalentTo(this, graph);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract void add(RDFGraph graph);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RDFGraph union(RDFGraph graph) {
		return graph;
//		return RDFOperations.unionOf(this, graph);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RDFGraph diff(RDFGraph graph) {
		return graph;
//		return RDFOperations.differenceOf(this, graph);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Triple addTriple(Node subject, Property property, Node object) {
		Triple triple = null;
		if (subject != null && property != null && object != null) {
			 triple = RDFFactory.eINSTANCE.createTriple();
			 triple.setSubject((SubjectNode) subject);
			 triple.setPredicate(property);
			 triple.setObject(object);
			 this.getTriples().add(triple);
		}
		return triple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<SubjectNode> listSubjectsWithProperty(Property property) {
		final EList<SubjectNode> nodes = new BasicEList<SubjectNode>();
		for (Triple triple: listAllTriples()) {
			if (triple.getPredicate().equals(property)) {
				nodes.add(triple.getSubject());
			}
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<SubjectNode> listSubjectsWithPropertyValue(Property property, Node object) {
		final EList<SubjectNode> nodes = new BasicEList<SubjectNode>();
		for (Triple triple: listAllTriples()) {
			if (triple.getPredicate().equals(property) && triple.getObject().equals(object)) {
				nodes.add(triple.getSubject());
			}
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract EList<Triple> listAllTriples();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract EList<Resource> listAllResources();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract EList<Property> listAllProperties();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<SubjectNode> listSubjects() {
		final EList<SubjectNode> subjects = new BasicEList<SubjectNode>();
		for (Triple aTriple: getTriples()) {
			if (!subjects.contains(aTriple.getSubject())) {
				subjects.add(aTriple.getSubject());
			}
		}
		return subjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Resource getResource(String uri) {
		EObject obj = eResource() == null ? null : eResource().getEObject(uri);
		if (obj == null) {
			obj = RDFFactory.eINSTANCE.createResource();
			((Resource) obj).setURI(uri);
			this.getResources().add((Resource) obj);
		}
		return obj instanceof Resource ? (Resource)obj : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Property getProperty(String uri) {
		EObject obj = eResource() == null ? null : eResource().getEObject(uri);
		if (obj == null) {
			obj = RDFFactory.eINSTANCE.createProperty();
			((Property) obj).setURI(uri);
			this.getProperties().add((Property) obj);
		}
		return obj instanceof Property ? (Property)obj : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Datatype getDatatype(String uri) {
		EObject obj = eResource() == null ? null : eResource().getEObject(uri);
		if (obj == null) {
			obj = RDFFactory.eINSTANCE.createDatatype();
			((Datatype) obj).setURI(uri);
			this.getDatatypes().add((Datatype) obj);
		}
		return obj instanceof Datatype ? (Datatype)obj : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BlankNode getBlankNode(String nodeID) {
		EObject obj = eResource() == null ? null : eResource().getEObject(nodeID);
		if (obj == null) {
			obj = RDFFactory.eINSTANCE.createBlankNode();
			((BlankNode) obj).setNodeID(nodeID);
			this.getBlankNodes().add((BlankNode) obj);
		}
		return obj instanceof BlankNode ? (BlankNode)obj : null;
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

} //RDFGraphImpl
