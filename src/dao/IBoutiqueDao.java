package dao;

import java.util.List;

import metier.Categorie;
import metier.Commande;
import metier.Panier;
import metier.Produit;
import metier.Role;
import metier.User;

import com.sun.security.ntlm.Client;

public interface IBoutiqueDao {
	public String Authentifier (User user);
	public Long ajouterCategorie(Categorie c);
	public List<Categorie> listCategories();
	public Categorie getCategorie(Long idCat);
	public void supprimerCategrorie(Long idcat);
	public void modifierCategorie(Categorie c);
	public Long ajouterProduit(Produit p, Long idCat);
	public List<Produit> listproduits();
	public List<Produit> produitsParMotCle(String mc);
	public List<Produit> produitsParCategorie(Long idCat);
	public List<Produit> produitsSelectionnes();
	public Produit getProduit(Long idP);
	public void supprimerProduit(Long idP);
	public void modifierProduit(Produit p);
	public void ajouterUser(User u);
	public void attribuerRole(Role r,Long userID);
	public Commande enregistrerCommande(Panier p,Client c);
}
