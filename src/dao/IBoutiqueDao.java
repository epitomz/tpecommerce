package dao;

import java.util.List;
import java.util.Set;

import metier.Categorie;
import metier.Client;
import metier.Commande;
import metier.LigneCommande;
import metier.Panier;
import metier.Produit;
import metier.Role;
import metier.User;


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
	public Long ajouterUser(User u);
	public List<User> listUsers();
	public User getUser(Long idUser);
	public void supprimerUser(Long idUser);
	public void modifierUser(User u);
	public void attribuerRole(Long roleID,Long userID);
	public List<Role> listRoles();
	public Commande enregistrerCommande(Panier p,Client c);
	
	//Commande---------------
	public Long saveCommande(Commande c);
	public void deleteCommande(Long idCommande);
	public Commande getCommande(Long idCommande);
	public void updateCommande(Commande c);
	
	public Set<LigneCommande> listerLigneCommande();
	
	public Set<LigneCommande> listerLigneCommande(Long idClient);
	
	//Client-----------------
	public Long saveClient(Client c);
	public void deleteClient(Long idClient);
	public void updateClient(Client c);
	public Client getClient(Long idClient);
}

