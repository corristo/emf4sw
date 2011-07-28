/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import com.emf4sw.owl.DataRange;
import com.emf4sw.owl.FacetRestriction;
import com.emf4sw.owl.OWLPackage;
import com.emf4sw.rdf.Literal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facet Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.FacetRestrictionImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.FacetRestrictionImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FacetRestrictionImpl extends CDOObjectImpl implements FacetRestriction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacetRestrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.FACET_RESTRICTION;
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
	public DataRange getDatatype() {
		return (DataRange)eGet(OWLPackage.Literals.FACET_RESTRICTION__DATATYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatype(DataRange newDatatype) {
		eSet(OWLPackage.Literals.FACET_RESTRICTION__DATATYPE, newDatatype);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal getValue() {
		return (Literal)eGet(OWLPackage.Literals.FACET_RESTRICTION__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Literal newValue) {
		eSet(OWLPackage.Literals.FACET_RESTRICTION__VALUE, newValue);
	}

} //FacetRestrictionImpl
