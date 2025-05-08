/**
 */
package mini.projet;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mini.projet.ProjetPackage
 * @generated
 */
public interface ProjetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProjetFactory eINSTANCE = mini.projet.impl.ProjetFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process</em>'.
	 * @generated
	 */
	Process createProcess();

	/**
	 * Returns a new object of class '<em>Process Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Element</em>'.
	 * @generated
	 */
	ProcessElement createProcessElement();

	/**
	 * Returns a new object of class '<em>Work Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Definition</em>'.
	 * @generated
	 */
	WorkDefinition createWorkDefinition();

	/**
	 * Returns a new object of class '<em>Work Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Sequence</em>'.
	 * @generated
	 */
	WorkSequence createWorkSequence();

	/**
	 * Returns a new object of class '<em>Humain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Humain</em>'.
	 * @generated
	 */
	Humain createHumain();

	/**
	 * Returns a new object of class '<em>Materiel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Materiel</em>'.
	 * @generated
	 */
	Materiel createMateriel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProjetPackage getProjetPackage();

} //ProjetFactory
