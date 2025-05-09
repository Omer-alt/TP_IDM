/**
 * generated by Xtext 2.38.0
 */
package org.xtext.simplepdl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.simplepdl.myDsl.WorkSequence#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.simplepdl.myDsl.WorkSequence#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link org.xtext.simplepdl.myDsl.WorkSequence#getSuccessor <em>Successor</em>}</li>
 * </ul>
 *
 * @see org.xtext.simplepdl.myDsl.MyDslPackage#getWorkSequence()
 * @model
 * @generated
 */
public interface WorkSequence extends ProcessElement
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.simplepdl.myDsl.WorkSequenceType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.xtext.simplepdl.myDsl.WorkSequenceType
   * @see #setType(WorkSequenceType)
   * @see org.xtext.simplepdl.myDsl.MyDslPackage#getWorkSequence_Type()
   * @model
   * @generated
   */
  WorkSequenceType getType();

  /**
   * Sets the value of the '{@link org.xtext.simplepdl.myDsl.WorkSequence#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.xtext.simplepdl.myDsl.WorkSequenceType
   * @see #getType()
   * @generated
   */
  void setType(WorkSequenceType value);

  /**
   * Returns the value of the '<em><b>Predecessor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predecessor</em>' reference.
   * @see #setPredecessor(WorkDefinition)
   * @see org.xtext.simplepdl.myDsl.MyDslPackage#getWorkSequence_Predecessor()
   * @model
   * @generated
   */
  WorkDefinition getPredecessor();

  /**
   * Sets the value of the '{@link org.xtext.simplepdl.myDsl.WorkSequence#getPredecessor <em>Predecessor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predecessor</em>' reference.
   * @see #getPredecessor()
   * @generated
   */
  void setPredecessor(WorkDefinition value);

  /**
   * Returns the value of the '<em><b>Successor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Successor</em>' reference.
   * @see #setSuccessor(WorkDefinition)
   * @see org.xtext.simplepdl.myDsl.MyDslPackage#getWorkSequence_Successor()
   * @model
   * @generated
   */
  WorkDefinition getSuccessor();

  /**
   * Sets the value of the '{@link org.xtext.simplepdl.myDsl.WorkSequence#getSuccessor <em>Successor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Successor</em>' reference.
   * @see #getSuccessor()
   * @generated
   */
  void setSuccessor(WorkDefinition value);

} // WorkSequence
