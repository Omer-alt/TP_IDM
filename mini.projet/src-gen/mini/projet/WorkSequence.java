/**
 */
package mini.projet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mini.projet.WorkSequence#getType <em>Type</em>}</li>
 *   <li>{@link mini.projet.WorkSequence#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link mini.projet.WorkSequence#getSuccessor <em>Successor</em>}</li>
 * </ul>
 *
 * @see mini.projet.ProjetPackage#getWorkSequence()
 * @model
 * @generated
 */
public interface WorkSequence extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mini.projet.WorkSequenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mini.projet.WorkSequenceType
	 * @see #setType(WorkSequenceType)
	 * @see mini.projet.ProjetPackage#getWorkSequence_Type()
	 * @model
	 * @generated
	 */
	WorkSequenceType getType();

	/**
	 * Sets the value of the '{@link mini.projet.WorkSequence#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mini.projet.WorkSequenceType
	 * @see #getType()
	 * @generated
	 */
	void setType(WorkSequenceType value);

	/**
	 * Returns the value of the '<em><b>Predecessor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mini.projet.WorkDefinition#getLinksToSuccessor <em>Links To Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessor</em>' reference.
	 * @see #setPredecessor(WorkDefinition)
	 * @see mini.projet.ProjetPackage#getWorkSequence_Predecessor()
	 * @see mini.projet.WorkDefinition#getLinksToSuccessor
	 * @model opposite="linksToSuccessor" required="true"
	 * @generated
	 */
	WorkDefinition getPredecessor();

	/**
	 * Sets the value of the '{@link mini.projet.WorkSequence#getPredecessor <em>Predecessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predecessor</em>' reference.
	 * @see #getPredecessor()
	 * @generated
	 */
	void setPredecessor(WorkDefinition value);

	/**
	 * Returns the value of the '<em><b>Successor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mini.projet.WorkDefinition#getLinksToPredecessor <em>Links To Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successor</em>' reference.
	 * @see #setSuccessor(WorkDefinition)
	 * @see mini.projet.ProjetPackage#getWorkSequence_Successor()
	 * @see mini.projet.WorkDefinition#getLinksToPredecessor
	 * @model opposite="linksToPredecessor" required="true"
	 * @generated
	 */
	WorkDefinition getSuccessor();

	/**
	 * Sets the value of the '{@link mini.projet.WorkSequence#getSuccessor <em>Successor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successor</em>' reference.
	 * @see #getSuccessor()
	 * @generated
	 */
	void setSuccessor(WorkDefinition value);

} // WorkSequence
