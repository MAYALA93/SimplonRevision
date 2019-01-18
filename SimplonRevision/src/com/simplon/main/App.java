package com.simplon.main;

import java.util.ArrayList;
import java.util.List;

import com.simplon.model.client.Client;
import com.simplon.model.product.Alimentaire;
import com.simplon.model.product.Product;
import com.simplon.model.shop.Shop;
import com.simplon.persistence.RepoClient;

public class App {

	public static void main(String[] args) {
		
		Client steven = new Client("Orcun", "Steven", 900);
		Client hawa = new Client("Hawa", "Hawa", 1000);
		Client gael = new Client("Gael", "Gael", 1000);
		Client martin = new Client("Martin","Martin", 2000);
		
       RepoClient repoclient= new RepoClient();
       repoclient.ajouterClient(steven);
       repoclient.ajouterClient(hawa);
       repoclient.ajouterClient(steven);
      //la methode supprimer utilise un string
      //c'est pour cela qu'ils mettent des guillemets
       
		Shop carrefour = new Shop("carrefour", 0,0,0);
		System.out.println(carrefour.toString());
		Product coca = new Alimentaire("coca", 5, 10, false);
		carrefour.ajouterProduit(coca, 10);
		System.out.println(carrefour.toString());
		carrefour.vendreProduit(coca, 5);
		System.out.println(carrefour.toString());
		
	}

	public static void afficherTousLesClients(List<Client> clients) {
		for(Client c : clients) {
			System.out.println(c.toString()+"\n-------------------------");
		}
		
	}
}
