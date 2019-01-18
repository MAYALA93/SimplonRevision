package com.simplon.model.client;

import java.util.ArrayList;

public interface IClientRepository {
	
	public void ajouterClient(Client client);
	public void supprimerClient(String nom);
	public void modifierClient(String nom);
	public Client retournerClient(String nom);
	public ArrayList<Client> listDesClient();
}
//cela va permettre de pouvoir communiquer entre le model et la persistence 
//les implenter dans une classe 