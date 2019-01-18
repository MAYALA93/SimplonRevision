package com.simplon.model.product;

public class Alimentaire extends Product{

	private boolean gluten;
	
	public Alimentaire(String nom, float prixAchat, float prixVente, boolean gluten) {
		super(nom, prixAchat, prixVente);
		this.gluten = gluten;
	}

	/**
	 * @return the gluten
	 */
	public boolean isGluten() {
		return gluten;
	}

	/**
	 * @param gluten the gluten to set
	 */
	public void setGluten(boolean gluten) {
		this.gluten = gluten;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Alimentaire***\nnom :" + nom + "\nprixAchat : " + prixAchat + "\nprixVente : " + prixVente + "\ngluten :"
				+ gluten;
	}
	
}
