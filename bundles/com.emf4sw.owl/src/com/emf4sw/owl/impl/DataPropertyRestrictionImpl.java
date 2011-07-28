/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.emf4sw.owl.DataPropertyRestriction;
import com.emf4sw.owl.OWLPackage;
import com.emf4sw.rdf.BlankNode;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.RDFPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Property Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.DataPropertyRestrictionImpl#getNodeID <em>Node ID</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.DataPropertyRestrictionImpl#getGraph <em>Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DataPropertyRestrictionImpl extends ClassExpressionImpl implements DataPropertyRestriction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPropertyRestrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.DATA_PROPERTY_RESTRICTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNodeID() {
		return (String)eGet(RDFPackage.Literals.BLANK_NODE__NODE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeID(String newNodeID) {
		eSet(RDFPackage.Literals.BLANK_NODE__NODE_ID, newNodeID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFGraph getGraph() {
		return (RDFGraph)eGet(RDFPackage.Literals.BLANK_NODE__GRAPH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraph(RDFGraph newGraph) {
		eSet(RDFPackage.Literals.BLANK_NODE__GRAPH, newGraph);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == BlankNode.class) {
			switch (derivedFeatureID) {
				case OWLPackage.DATA_PROPERTY_RESTRICTION__NODE_ID: return RDFPackage.BLANK_NODE__NODE_ID;
				case OWLPackage.DATA_PROPERTY_RESTRICTION__GRAPH: return RDFPackage.BLANK_NODE__GRAPH;
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
		if (baseClass == BlankNode.class) {
			switch (baseFeatureID) {
				case RDFPackage.BLANK_NODE__NODE_ID: return OWLPackage.DATA_PROPERTY_RESTRICTION__NODE_ID;
				case RDFPackage.BLANK_NODE__GRAPH: return OWLPackage.DATA_PROPERTY_RESTRICTION__GRAPH;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DataPropertyRestrictionImpl
