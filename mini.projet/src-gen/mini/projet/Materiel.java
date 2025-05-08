/**
 */
package mini.projet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Materiel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mini.projet.Materiel#getQuantite <em>Quantite</em>}</li>
 * </ul>
 *
 * @see mini.projet.ProjetPackage#getMateriel()
 * @model
 * @generated
 */
public interface Materiel extends Resource {
	/**
	 * Returns the value of the '<em><b>Quantite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite</em>' attribute.
	 * @see #setQuantite(int)
	 * @see mini.projet.ProjetPackage#getMateriel_Quantite()
	 * @model
	 * @generated
	 */
	int getQuantite();

	/**
	 * Sets the value of the '{@link mini.projet.Materiel#getQuantite <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite</em>' attribute.
	 * @see #getQuantite()
	 * @generated
	 */
	void setQuantite(int value);

} // Materiel
