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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.emf4sw.rdf.Datatype;
import com.emf4sw.rdf.Literal;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.RDFPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.rdf.impl.LiteralImpl#getLexicalForm <em>Lexical Form</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.LiteralImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.LiteralImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.LiteralImpl#getGraph <em>Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiteralImpl extends NodeImpl implements Literal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDFPackage.Literals.LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLexicalForm() {
		return (String)eGet(RDFPackage.Literals.LITERAL__LEXICAL_FORM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLexicalForm(String newLexicalForm) {
		eSet(RDFPackage.Literals.LITERAL__LEXICAL_FORM, newLexicalForm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLang() {
		return (String)eGet(RDFPackage.Literals.LITERAL__LANG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLang(String newLang) {
		eSet(RDFPackage.Literals.LITERAL__LANG, newLang);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype getDatatype() {
		return (Datatype)eGet(RDFPackage.Literals.LITERAL__DATATYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatype(Datatype newDatatype) {
		eSet(RDFPackage.Literals.LITERAL__DATATYPE, newDatatype);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFGraph getGraph() {
		return (RDFGraph)eGet(RDFPackage.Literals.LITERAL__GRAPH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraph(RDFGraph newGraph) {
		eSet(RDFPackage.Literals.LITERAL__GRAPH, newGraph);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer();
		result.append("\"" + getLexicalForm() + "\"");
		if (getLang() != null && !getLang().trim().isEmpty()) {
			result.append("@" + getLang());
		}
//		if (getDatatype() != null) {
//			result.append("^^" + getDatatype().getURI());
//		}

		return result.toString();
	}

} //LiteralImpl
