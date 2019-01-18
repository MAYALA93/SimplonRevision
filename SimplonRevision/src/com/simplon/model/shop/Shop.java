package com.simplon.model.shop;
import java.util.ArrayList;
import java.util.List;

import com.simplon.model.product.*;

public class Shop {
	
	private String nom;
	private float valeurStock;
	private float ca;
	private float benefice;
	private List<Product> listProduct = new ArrayList<>();
	
	public Shop(String nom, float valeurStock, float ca, float benefice) {
		super();
		this.nom = nom;
		this.valeurStock = valeurStock;
		this.ca = ca;
		this.benefice = benefice;
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
	 * @return the valeurStock
	 */
	public float getValeurStock() {
		return valeurStock;
	}

	/**
	 * @param valeurStock the valeurStock to set
	 */
	public void setValeurStock(float valeurStock) {
		this.valeurStock = valeurStock;
	}

	/**
	 * @return the ca
	 */
	public float getCa() {
		return ca;
	}

	/**
	 * @param ca the ca to set
	 */
	public void setCa(float ca) {
		this.ca = ca;
	}

	/**
	 * @return the benefice
	 */
	public float getBenefice() {
		return benefice;
	}

	/**
	 * @param benefice the benefice to set
	 */
	public void setBenefice(float benefice) {
		this.benefice = benefice;
	}
	
	
	/**
	 * @return the listProduct
	 */
	public List<Product> getListProduct() {
		return listProduct;
	}

	/**
	 * @param listProduct the listProduct to set
	 */
	public void setListProduct(List<Product> listProduct) {
		this.listProduct = listProduct;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Shop***\nnom : " + nom + ", valeurStock : " + valeurStock + ", ca : " + ca + ", benefice : " + benefice;
	}
	
	
	public void ajouterProduit(Product product, int quantite){
		this.listProduct.add(product);
		this.valeurStock += product.getPrixAchat() * quantite;
	}
	
	public void vendreProduit(Product product, int quantite){
		if(produitDisponible(product)) {
			valeurStock -= product.getPrixAchat() * quantite;
			ca += product.getPrixVente() * quantite;
			benefice += (product.getPrixVente()*quantite - product.getPrixAchat()*quantite);
		}
		else {
			System.out.println("Produit indisponible");
		}
	}
	
	private boolean produitDisponible(Product product) {
		for(Product p : listProduct) {
			if(p.getNom().equals(product.getNom())) {
				return true;
			}
		}
		return false;
	}
}
