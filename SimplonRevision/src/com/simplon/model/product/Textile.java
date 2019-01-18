package com.simplon.model.product;

public class Textile extends Product{

	private ClothingSize size;
	

	public Textile(String nom, float prixAchat, float prixVente, ClothingSize size) {
		super(nom, prixAchat, prixVente);
		this.size = size;
	}
	
	/**
	 * @return the size
	 */
	public ClothingSize getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(ClothingSize size) {
		this.size = size;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Textile***\nnom : " + nom + "\nprixAchat : " + prixAchat + "\nprixVente : " + prixVente + "\nsize : " + size;
	}
	
}
