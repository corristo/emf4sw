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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import com.emf4sw.rdf.DocumentGraph;
import com.emf4sw.rdf.NamedGraph;
import com.emf4sw.rdf.Namespace;
import com.emf4sw.rdf.Property;
import com.emf4sw.rdf.RDFFactory;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.RDFPackage;
import com.emf4sw.rdf.Resource;
import com.emf4sw.rdf.Triple;
import com.emf4sw.rdf.operations.RDFUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.rdf.impl.DocumentGraphImpl#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.DocumentGraphImpl#getSubGraphs <em>Sub Graphs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentGraphImpl extends RDFGraphImpl implements DocumentGraph {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDFPackage.Literals.DOCUMENT_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Namespace> getNamespaces() {
		return (EList<Namespace>)eGet(RDFPackage.Literals.DOCUMENT_GRAPH__NAMESPACES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<NamedGraph> getSubGraphs() {
		return (EList<NamedGraph>)eGet(RDFPackage.Literals.DOCUMENT_GRAPH__SUB_GRAPHS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public NamedGraph getNamedGraph(String uri) {
		NamedGraph aGraph = null;
		for (NamedGraph subGraph: getSubGraphs()) {
			if (subGraph.getURI().equals(uri)) {
				return subGraph;
			}
		}
		if (aGraph == null) {
			aGraph = RDFFactory.eINSTANCE.createNamedGraph();
			aGraph.setURI(uri);
			this.getSubGraphs().add(aGraph);
		}
		return aGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	@Override
	public synchronized void add(RDFGraph graph) {
		for (Triple triple: graph.getTriples()) {
			RDFUtil.copyTriple(triple, this);
		}
		if (graph instanceof DocumentGraph) {
			for (NamedGraph subGraph: ((DocumentGraph) graph).getSubGraphs()) {
				RDFUtil.copyNode(subGraph, this);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public EList<Triple> listAllTriples() {
		final EList<Triple> all = getTriples();
		for (RDFGraph subGraph: getSubGraphs()) {
			all.addAll(subGraph.listAllTriples());
		}
		return all;
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

} //DocumentGraphImpl
