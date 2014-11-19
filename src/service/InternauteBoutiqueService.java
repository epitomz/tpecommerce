package service;

import java.util.List;

import metier.Categorie;
import metier.Commande;
import metier.Panier;
import metier.Produit;
import metier.User;

import com.sun.security.ntlm.Client;

public interface InternauteBoutiqueService {
	
	
	public String Authentifier (User user) ;
	public List<Categorie> listCategories();
	public Categorie getCategorie(Long idCat);
	public List<Produit> listproduits();
	public List<Produit> produitsParMotCle(String mc);
	public List<Produit> produitsParCategorie(Long idCat);
	public List<Produit> produitsSelectionnes();
	public Produit getProduit(Long idP);
	public Commande enregistrerCommande(Panier p,Client c);


}
