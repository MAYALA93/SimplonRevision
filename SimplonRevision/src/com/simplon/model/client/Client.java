package com.simplon.model.client;

import java.io.Serializable;

import com.simplon.model.product.Product;

public class Client implements Serializable{
	
	private String nom;
	private String prenom;
	private float argent;

	//constructeur
	public Client(String nom, String prenom, float argent) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.argent = argent;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the argent
	 */
	public float getArgent() {
		return argent;
	}

	/**
	 * @param argent the argent to set
	 */
	public void setArgent(float argent) {
		this.argent = argent;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Client***\nnom : " + nom + "\nprenom : " + prenom + "\nargent : " + argent;
	}
	
	public void acheterProduit(Product product, int quantite) {
		
	}

}
