/**
 */
package fr.ensma.idm.projet.familydsl.model.arbregen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Personne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ensma.idm.projet.familydsl.model.arbregen.Personne#getNom <em>Nom</em>}</li>
 *   <li>{@link fr.ensma.idm.projet.familydsl.model.arbregen.Personne#getAge <em>Age</em>}</li>
 *   <li>{@link fr.ensma.idm.projet.familydsl.model.arbregen.Personne#getSesParents <em>Ses Parents</em>}</li>
 *   <li>{@link fr.ensma.idm.projet.familydsl.model.arbregen.Personne#getMere <em>Mere</em>}</li>
 *   <li>{@link fr.ensma.idm.projet.familydsl.model.arbregen.Personne#getPere <em>Pere</em>}</li>
 *   <li>{@link fr.ensma.idm.projet.familydsl.model.arbregen.Personne#getHabitation <em>Habitation</em>}</li>
 * </ul>
 *
 * @see fr.ensma.idm.projet.familydsl.model.arbregen.ArbregenPackage#getPersonne()
 * @model abstract="true"
 * @generated
 */
public interface Personne extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.ArbregenPackage#getPersonne_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link fr.ensma.idm.projet.familydsl.model.arbregen.Personne#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.ArbregenPackage#getPersonne_Age()
	 * @model required="true"
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link fr.ensma.idm.projet.familydsl.model.arbregen.Personne#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Ses Parents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ses Parents</em>' attribute.
	 * @see #setSesParents(String)
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.ArbregenPackage#getPersonne_SesParents()
	 * @model derived="true"
	 * @generated
	 */
	String getSesParents();

	/**
	 * Sets the value of the '{@link fr.ensma.idm.projet.familydsl.model.arbregen.Personne#getSesParents <em>Ses Parents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ses Parents</em>' attribute.
	 * @see #getSesParents()
	 * @generated
	 */
	void setSesParents(String value);

	/**
	 * Returns the value of the '<em><b>Mere</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.ensma.idm.projet.familydsl.model.arbregen.Femme#getEnfants <em>Enfants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mere</em>' reference.
	 * @see #setMere(Femme)
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.ArbregenPackage#getPersonne_Mere()
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.Femme#getEnfants
	 * @model opposite="enfants"
	 * @generated
	 */
	Femme getMere();

	/**
	 * Sets the value of the '{@link fr.ensma.idm.projet.familydsl.model.arbregen.Personne#getMere <em>Mere</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mere</em>' reference.
	 * @see #getMere()
	 * @generated
	 */
	void setMere(Femme value);

	/**
	 * Returns the value of the '<em><b>Pere</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.ensma.idm.projet.familydsl.model.arbregen.Homme#getEnfants <em>Enfants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pere</em>' reference.
	 * @see #setPere(Homme)
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.ArbregenPackage#getPersonne_Pere()
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.Homme#getEnfants
	 * @model opposite="enfants"
	 * @generated
	 */
	Homme getPere();

	/**
	 * Sets the value of the '{@link fr.ensma.idm.projet.familydsl.model.arbregen.Personne#getPere <em>Pere</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pere</em>' reference.
	 * @see #getPere()
	 * @generated
	 */
	void setPere(Homme value);

	/**
	 * Returns the value of the '<em><b>Habitation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Habitation</em>' containment reference.
	 * @see #setHabitation(Adresse)
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.ArbregenPackage#getPersonne_Habitation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Adresse getHabitation();

	/**
	 * Sets the value of the '{@link fr.ensma.idm.projet.familydsl.model.arbregen.Personne#getHabitation <em>Habitation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Habitation</em>' containment reference.
	 * @see #getHabitation()
	 * @generated
	 */
	void setHabitation(Adresse value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String affichier();

} // Personne
