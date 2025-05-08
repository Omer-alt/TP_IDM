/**
 */
package mini.projet.impl;

import java.util.Collection;
import java.util.Date;

import mini.projet.ProjetPackage;
import mini.projet.Resource;
import mini.projet.WorkDefinition;
import mini.projet.WorkSequence;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mini.projet.impl.WorkDefinitionImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link mini.projet.impl.WorkDefinitionImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link mini.projet.impl.WorkDefinitionImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link mini.projet.impl.WorkDefinitionImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link mini.projet.impl.WorkDefinitionImpl#getLinksToSuccessor <em>Links To Successor</em>}</li>
 *   <li>{@link mini.projet.impl.WorkDefinitionImpl#getLinksToPredecessor <em>Links To Predecessor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkDefinitionImpl extends ProcessElementImpl implements WorkDefinition {
	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resource;

	/**
	 * The cached value of the '{@link #getLinksToSuccessor() <em>Links To Successor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinksToSuccessor()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkSequence> linksToSuccessor;

	/**
	 * The cached value of the '{@link #getLinksToPredecessor() <em>Links To Predecessor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinksToPredecessor()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkSequence> linksToPredecessor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetPackage.Literals.WORK_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetPackage.WORK_DEFINITION__DURATION, oldDuration,
					duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetPackage.WORK_DEFINITION__START_DATE,
					oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndDate(Date newEndDate) {
		Date oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetPackage.WORK_DEFINITION__END_DATE, oldEndDate,
					endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Resource> getResource() {
		if (resource == null) {
			resource = new EObjectContainmentWithInverseEList<Resource>(Resource.class, this,
					ProjetPackage.WORK_DEFINITION__RESOURCE, ProjetPackage.RESOURCE__WORKDEFINITION);
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkSequence> getLinksToSuccessor() {
		if (linksToSuccessor == null) {
			linksToSuccessor = new EObjectWithInverseResolvingEList<WorkSequence>(WorkSequence.class, this,
					ProjetPackage.WORK_DEFINITION__LINKS_TO_SUCCESSOR, ProjetPackage.WORK_SEQUENCE__PREDECESSOR);
		}
		return linksToSuccessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkSequence> getLinksToPredecessor() {
		if (linksToPredecessor == null) {
			linksToPredecessor = new EObjectWithInverseResolvingEList<WorkSequence>(WorkSequence.class, this,
					ProjetPackage.WORK_DEFINITION__LINKS_TO_PREDECESSOR, ProjetPackage.WORK_SEQUENCE__SUCCESSOR);
		}
		return linksToPredecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProjetPackage.WORK_DEFINITION__RESOURCE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getResource()).basicAdd(otherEnd, msgs);
		case ProjetPackage.WORK_DEFINITION__LINKS_TO_SUCCESSOR:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getLinksToSuccessor()).basicAdd(otherEnd, msgs);
		case ProjetPackage.WORK_DEFINITION__LINKS_TO_PREDECESSOR:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getLinksToPredecessor()).basicAdd(otherEnd,
					msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProjetPackage.WORK_DEFINITION__RESOURCE:
			return ((InternalEList<?>) getResource()).basicRemove(otherEnd, msgs);
		case ProjetPackage.WORK_DEFINITION__LINKS_TO_SUCCESSOR:
			return ((InternalEList<?>) getLinksToSuccessor()).basicRemove(otherEnd, msgs);
		case ProjetPackage.WORK_DEFINITION__LINKS_TO_PREDECESSOR:
			return ((InternalEList<?>) getLinksToPredecessor()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjetPackage.WORK_DEFINITION__DURATION:
			return getDuration();
		case ProjetPackage.WORK_DEFINITION__START_DATE:
			return getStartDate();
		case ProjetPackage.WORK_DEFINITION__END_DATE:
			return getEndDate();
		case ProjetPackage.WORK_DEFINITION__RESOURCE:
			return getResource();
		case ProjetPackage.WORK_DEFINITION__LINKS_TO_SUCCESSOR:
			return getLinksToSuccessor();
		case ProjetPackage.WORK_DEFINITION__LINKS_TO_PREDECESSOR:
			return getLinksToPredecessor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ProjetPackage.WORK_DEFINITION__DURATION:
			setDuration((Integer) newValue);
			return;
		case ProjetPackage.WORK_DEFINITION__START_DATE:
			setStartDate((Date) newValue);
			return;
		case ProjetPackage.WORK_DEFINITION__END_DATE:
			setEndDate((Date) newValue);
			return;
		case ProjetPackage.WORK_DEFINITION__RESOURCE:
			getResource().clear();
			getResource().addAll((Collection<? extends Resource>) newValue);
			return;
		case ProjetPackage.WORK_DEFINITION__LINKS_TO_SUCCESSOR:
			getLinksToSuccessor().clear();
			getLinksToSuccessor().addAll((Collection<? extends WorkSequence>) newValue);
			return;
		case ProjetPackage.WORK_DEFINITION__LINKS_TO_PREDECESSOR:
			getLinksToPredecessor().clear();
			getLinksToPredecessor().addAll((Collection<? extends WorkSequence>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ProjetPackage.WORK_DEFINITION__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		case ProjetPackage.WORK_DEFINITION__START_DATE:
			setStartDate(START_DATE_EDEFAULT);
			return;
		case ProjetPackage.WORK_DEFINITION__END_DATE:
			setEndDate(END_DATE_EDEFAULT);
			return;
		case ProjetPackage.WORK_DEFINITION__RESOURCE:
			getResource().clear();
			return;
		case ProjetPackage.WORK_DEFINITION__LINKS_TO_SUCCESSOR:
			getLinksToSuccessor().clear();
			return;
		case ProjetPackage.WORK_DEFINITION__LINKS_TO_PREDECESSOR:
			getLinksToPredecessor().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ProjetPackage.WORK_DEFINITION__DURATION:
			return duration != DURATION_EDEFAULT;
		case ProjetPackage.WORK_DEFINITION__START_DATE:
			return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
		case ProjetPackage.WORK_DEFINITION__END_DATE:
			return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
		case ProjetPackage.WORK_DEFINITION__RESOURCE:
			return resource != null && !resource.isEmpty();
		case ProjetPackage.WORK_DEFINITION__LINKS_TO_SUCCESSOR:
			return linksToSuccessor != null && !linksToSuccessor.isEmpty();
		case ProjetPackage.WORK_DEFINITION__LINKS_TO_PREDECESSOR:
			return linksToPredecessor != null && !linksToPredecessor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (duration: ");
		result.append(duration);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(')');
		return result.toString();
	}

} //WorkDefinitionImpl
