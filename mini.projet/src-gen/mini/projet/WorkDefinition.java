/**
 */
package mini.projet;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mini.projet.WorkDefinition#getDuration <em>Duration</em>}</li>
 *   <li>{@link mini.projet.WorkDefinition#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link mini.projet.WorkDefinition#getEndDate <em>End Date</em>}</li>
 *   <li>{@link mini.projet.WorkDefinition#getResource <em>Resource</em>}</li>
 *   <li>{@link mini.projet.WorkDefinition#getLinksToSuccessor <em>Links To Successor</em>}</li>
 *   <li>{@link mini.projet.WorkDefinition#getLinksToPredecessor <em>Links To Predecessor</em>}</li>
 * </ul>
 *
 * @see mini.projet.ProjetPackage#getWorkDefinition()
 * @model
 * @generated
 */
public interface WorkDefinition extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see mini.projet.ProjetPackage#getWorkDefinition_Duration()
	 * @model
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link mini.projet.WorkDefinition#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see mini.projet.ProjetPackage#getWorkDefinition_StartDate()
	 * @model
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link mini.projet.WorkDefinition#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see mini.projet.ProjetPackage#getWorkDefinition_EndDate()
	 * @model
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link mini.projet.WorkDefinition#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference list.
	 * The list contents are of type {@link mini.projet.Resource}.
	 * It is bidirectional and its opposite is '{@link mini.projet.Resource#getWorkdefinition <em>Workdefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference list.
	 * @see mini.projet.ProjetPackage#getWorkDefinition_Resource()
	 * @see mini.projet.Resource#getWorkdefinition
	 * @model opposite="workdefinition" containment="true"
	 * @generated
	 */
	EList<Resource> getResource();

	/**
	 * Returns the value of the '<em><b>Links To Successor</b></em>' reference list.
	 * The list contents are of type {@link mini.projet.WorkSequence}.
	 * It is bidirectional and its opposite is '{@link mini.projet.WorkSequence#getPredecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links To Successor</em>' reference list.
	 * @see mini.projet.ProjetPackage#getWorkDefinition_LinksToSuccessor()
	 * @see mini.projet.WorkSequence#getPredecessor
	 * @model opposite="predecessor"
	 * @generated
	 */
	EList<WorkSequence> getLinksToSuccessor();

	/**
	 * Returns the value of the '<em><b>Links To Predecessor</b></em>' reference list.
	 * The list contents are of type {@link mini.projet.WorkSequence}.
	 * It is bidirectional and its opposite is '{@link mini.projet.WorkSequence#getSuccessor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links To Predecessor</em>' reference list.
	 * @see mini.projet.ProjetPackage#getWorkDefinition_LinksToPredecessor()
	 * @see mini.projet.WorkSequence#getSuccessor
	 * @model opposite="successor"
	 * @generated
	 */
	EList<WorkSequence> getLinksToPredecessor();

} // WorkDefinition
