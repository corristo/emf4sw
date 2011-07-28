/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.emf4sw.owl.AnnotatedElement;
import com.emf4sw.owl.Annotation;
import com.emf4sw.owl.AnnotationProperty;
import com.emf4sw.owl.ClassExpression;
import com.emf4sw.owl.OWLClass;
import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.OWLProperty;
import com.emf4sw.owl.impl.notify.OWLClassTripleAdapter;
import com.emf4sw.rdf.impl.ResourceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.OWLClassImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.OWLClassImpl#getKeys <em>Keys</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.OWLClassImpl#getSubClassOf <em>Sub Class Of</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.OWLClassImpl#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.OWLClassImpl#getDisjointClasses <em>Disjoint Classes</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.OWLClassImpl#getEquivalentClasses <em>Equivalent Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OWLClassImpl extends ResourceImpl implements OWLClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected OWLClassImpl() {
		super();
		eAdapters().add(new OWLClassTripleAdapter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.OWL_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Annotation> getAnnotations() {
		return (EList<Annotation>)eGet(OWLPackage.Literals.ANNOTATED_ELEMENT__ANNOTATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OWLProperty> getKeys() {
		return (EList<OWLProperty>)eGet(OWLPackage.Literals.CLASS_EXPRESSION__KEYS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ClassExpression> getSubClassOf() {
		return (EList<ClassExpression>)eGet(OWLPackage.Literals.CLASS_EXPRESSION__SUB_CLASS_OF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ClassExpression> getSuperClass() {
		return (EList<ClassExpression>)eGet(OWLPackage.Literals.CLASS_EXPRESSION__SUPER_CLASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ClassExpression> getDisjointClasses() {
		return (EList<ClassExpression>)eGet(OWLPackage.Literals.CLASS_EXPRESSION__DISJOINT_CLASSES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ClassExpression> getEquivalentClasses() {
		return (EList<ClassExpression>)eGet(OWLPackage.Literals.CLASS_EXPRESSION__EQUIVALENT_CLASSES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addAnnotation(AnnotationProperty property, Object value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AnnotatedElement.class) {
			switch (derivedFeatureID) {
				case OWLPackage.OWL_CLASS__ANNOTATIONS: return OWLPackage.ANNOTATED_ELEMENT__ANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == ClassExpression.class) {
			switch (derivedFeatureID) {
				case OWLPackage.OWL_CLASS__KEYS: return OWLPackage.CLASS_EXPRESSION__KEYS;
				case OWLPackage.OWL_CLASS__SUB_CLASS_OF: return OWLPackage.CLASS_EXPRESSION__SUB_CLASS_OF;
				case OWLPackage.OWL_CLASS__SUPER_CLASS: return OWLPackage.CLASS_EXPRESSION__SUPER_CLASS;
				case OWLPackage.OWL_CLASS__DISJOINT_CLASSES: return OWLPackage.CLASS_EXPRESSION__DISJOINT_CLASSES;
				case OWLPackage.OWL_CLASS__EQUIVALENT_CLASSES: return OWLPackage.CLASS_EXPRESSION__EQUIVALENT_CLASSES;
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
		if (baseClass == AnnotatedElement.class) {
			switch (baseFeatureID) {
				case OWLPackage.ANNOTATED_ELEMENT__ANNOTATIONS: return OWLPackage.OWL_CLASS__ANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == ClassExpression.class) {
			switch (baseFeatureID) {
				case OWLPackage.CLASS_EXPRESSION__KEYS: return OWLPackage.OWL_CLASS__KEYS;
				case OWLPackage.CLASS_EXPRESSION__SUB_CLASS_OF: return OWLPackage.OWL_CLASS__SUB_CLASS_OF;
				case OWLPackage.CLASS_EXPRESSION__SUPER_CLASS: return OWLPackage.OWL_CLASS__SUPER_CLASS;
				case OWLPackage.CLASS_EXPRESSION__DISJOINT_CLASSES: return OWLPackage.OWL_CLASS__DISJOINT_CLASSES;
				case OWLPackage.CLASS_EXPRESSION__EQUIVALENT_CLASSES: return OWLPackage.OWL_CLASS__EQUIVALENT_CLASSES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //OWLClassImpl
