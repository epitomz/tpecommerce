package service;

import java.util.List;

import metier.Categorie;
import metier.Client;
import metier.Commande;
import metier.Panier;
import metier.Produit;
import metier.Role;
import metier.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dao.IBoutiqueDao;

@Component
public class AdminCategoriesServiceImpl implements IAdminCategoriesService {

	@Autowired
	private IBoutiqueDao dao;
	
	public IBoutiqueDao getDao() {
		return dao;
	}

	public void setDao(IBoutiqueDao dao) {
		this.dao = dao;
	}

	@Override
	public Long ajouterProduit(Produit p, Long idCat) {
		return dao.ajouterProduit(p, idCat);
		
	}

	@Override
	public void supprimerProduit(Long idP) {
		dao.supprimerProduit(idP);
		
	}

	@Override
	public void modifierProduit(Produit p) {
		dao.modifierProduit(p);
		
	}

	@Override
	public String Authentifier(User user) {
		return dao.Authentifier(user);
		
	}

	@Override
	public List<Categorie> listCategories() {
		return dao.listCategories();
	}

	@Override
	public Categorie getCategorie(Long idCat) {
		return dao.getCategorie(idCat);
	}

	@Override
	public List<Produit> listproduits() {
		return dao.listproduits();
	}

	@Override
	public List<Produit> produitsParMotCle(String mc) {
		return dao.produitsParMotCle(mc);
	}

	@Override
	public List<Produit> produitsParCategorie(Long idCat) {
		return dao.produitsParCategorie(idCat);
	}

	@Override
	public List<Produit> produitsSelectionnes() {
		return dao.produitsSelectionnes();
	}

	@Override
	public Produit getProduit(Long idP) {
		return dao.getProduit(idP);
	}

	@Override
	public Commande enregistrerCommande(Panier p, Client c) {
		return dao.enregistrerCommande(p, c);
	}

	@Override
	public Long ajouterCategorie(Categorie c) {
		return dao.ajouterCategorie(c);
	}

	@Override
	public void supprimerCategrorie(Long idcat) {
		dao.supprimerCategrorie(idcat);
		
	}

	@Override
	public void modifierCategorie(Categorie c) {
		dao.modifierCategorie(c);
		
		
	}
	
	@Override
	public User getUser(Long idUser) {
		return dao.getUser(idUser);
	}
	
	public User getUser(String nom){
		return dao.getUser(nom);
	}
	
	@Override
	public List<User> listUsers() {
		return dao.listUsers();
	}


	@Override
	public void supprimerUser(Long idUser) {
		dao.supprimerUser(idUser);
		
	}

	@Override
	public void modifierUser(User u) {
		dao.modifierUser(u);
		
	}

	
	@Override
	public Long ajouterUser(User u) {
		return dao.ajouterUser(u);
		
	}
	
	@Override
	public List<Role> listRoles(){
		return dao.listRoles();
		
	}
	
	@Override
	public void attribuerRole(Long roleID, Long userID) {
		dao.attribuerRole(roleID, userID);

	}

	
	
}
