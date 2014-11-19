package service;

import java.util.List;

import metier.Categorie;
import metier.Client;
import metier.Commande;
import metier.Produit;
import metier.User;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dao.IBoutiqueDao;


@Repository("AdminProduitService")
@Transactional
public class AdminProduitServiceImpl implements IAdminProduitService{
	
	private IBoutiqueDao dao;

	
	
	public IBoutiqueDao getDao() {
		return dao;
	}

	public void setDao(IBoutiqueDao dao) {
		this.dao = dao;
	}

	@Override
	public String Authentifier(User user) {
		// TODO Auto-generated method stub
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
	

}
