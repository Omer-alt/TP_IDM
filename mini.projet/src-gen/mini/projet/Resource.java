/**
 */
package mini.projet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mini.projet.Resource#getName_resource <em>Name resource</em>}</li>
 *   <li>{@link mini.projet.Resource#getWorkdefinition <em>Workdefinition</em>}</li>
 * </ul>
 *
 * @see mini.projet.ProjetPackage#getResource()
 * @model abstract="true"
 * @generated
 */
public interface Resource extends EObject {
	/**
	 * Returns the value of the '<em><b>Name resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name resource</em>' attribute.
	 * @see #setName_resource(String)
	 * @see mini.projet.ProjetPackage#getResource_Name_resource()
	 * @model
	 * @generated
	 */
	String getName_resource();

	/**
	 * Sets the value of the '{@link mini.projet.Resource#getName_resource <em>Name resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name resource</em>' attribute.
	 * @see #getName_resource()
	 * @generated
	 */
	void setName_resource(String value);

	/**
	 * Returns the value of the '<em><b>Workdefinition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mini.projet.WorkDefinition#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workdefinition</em>' container reference.
	 * @see #setWorkdefinition(WorkDefinition)
	 * @see mini.projet.ProjetPackage#getResource_Workdefinition()
	 * @see mini.projet.WorkDefinition#getResource
	 * @model opposite="resource" transient="false"
	 * @generated
	 */
	WorkDefinition getWorkdefinition();

	/**
	 * Sets the value of the '{@link mini.projet.Resource#getWorkdefinition <em>Workdefinition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workdefinition</em>' container reference.
	 * @see #getWorkdefinition()
	 * @generated
	 */
	void setWorkdefinition(WorkDefinition value);

} // Resource
