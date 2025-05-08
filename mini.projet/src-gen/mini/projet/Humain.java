/**
 */
package mini.projet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Humain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mini.projet.Humain#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see mini.projet.ProjetPackage#getHumain()
 * @model
 * @generated
 */
public interface Humain extends Resource {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see mini.projet.ProjetPackage#getHumain_Role()
	 * @model
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link mini.projet.Humain#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

} // Humain
