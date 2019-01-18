package com.simplon.model.product;

public abstract  class Product {
	
	protected String nom;
	protected float prixAchat;
	protected float prixVente;
	
	
	public Product(String nom, float prixAchat, float prixVente) {
		super();
		this.nom = nom;
		this.prixAchat = prixAchat;
		this.prixVente = prixVente;
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
	 * @return the prixAchat
	 */
	public float getPrixAchat() {
		return prixAchat;
	}


	/**
	 * @param prixAchat the prixAchat to set
	 */
	public void setPrixAchat(float prixAchat) {
		this.prixAchat = prixAchat;
	}


	/**
	 * @return the prixVente
	 */
	public float getPrixVente() {
		return prixVente;
	}


	/**
	 * @param prixVente the prixVente to set
	 */
	public void setPrixVente(float prixVente) {
		this.prixVente = prixVente;
	}

	@Override
	public String toString() {
		return "Product***\nnom : " + nom + "\nprixAchat=" + prixAchat + "\nprixVente=" + prixVente;
	}
	
	
}
