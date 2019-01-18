package com.simplon.persistence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.simplon.model.client.Client;
import com.simplon.model.client.IClientRepository;

public class RepoClient implements IClientRepository{
	
	private static Map<String, Client> tableClients = new HashMap<>();
	//l'objet Map sert à ajouter des éléments associés à des clés valeurs 
	
	
	@Override
	public void ajouterClient(Client client) {
		for(Client c : tableClients.values()) {
			if(c.getNom().equals(client.getNom())) {
				System.out.println("Ce client existe déjà dans la table");
				return;
			//cela parcour les valeurs de la tableClient
				//et si le nom saisi correspond au client de la table
				// alors ce client existe déjà
			}
		}
			tableClients.put(client.getNom(), client);
	}

	@Override
	public void supprimerClient(String nom) {
		for(Client c : tableClients.values()) {
			if(c.getNom().toUpperCase().equals(nom.toUpperCase())) {
				tableClients.remove(c.getNom());
				return;
			// je sort de la boucle donc mettre retourne
			//
			}
		}
		System.out.println(nom+" non enregistré");
	}

	@Override
	public void modifierClient(String nom) {

	}

	@Override
	public Client retournerClient(String nom) {
		for(Client c : tableClients.values()) {
			if(c.getNom().toUpperCase().equals(nom.toUpperCase()))
				return c;
			//retourner les caractères en majuscules
		}
		System.out.println(nom+" non enregistré");
		return null;
	}

	@Override
	public ArrayList<Client> listDesClient() {
		
		return new ArrayList<Client>(tableClients.values());
	}

	
}
//private static en un seul exemplaire 
//
