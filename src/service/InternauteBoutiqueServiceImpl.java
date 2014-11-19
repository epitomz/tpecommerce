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

@Repository("InternautreBoutiqueService")
@Transactional
public class InternauteBoutiqueServiceImpl implements InternauteBoutiqueService {
	
	private IBoutiqueDao dao;

	
	public IBoutiqueDao getDao() {
		return dao;
	}

	public void setDao(IBoutiqueDao dao) {
		this.dao = dao;
	}

	@Override
	public String Authentifier(User user) {
		return dao.Authentifier(user);
		
	}

	@Override
	public List<Categorie> listCategories() {
		// TODO Auto-generated method stub
		return dao.listCategories();
	}

	@Override
	public Categorie getCategorie(Long idCat) {
		// TODO Auto-generated method stub
		return dao.getCategorie(idCat);
	}

	@Override
	public List<Produit> listproduits() {
		// TODO Auto-generated method stub
		return dao.listproduits();
	}

	@Override
	public List<Produit> produitsParMotCle(String mc) {
		// TODO Auto-generated method stub
		return dao.produitsParMotCle(mc);
	}

	@Override
	public List<Produit> produitsParCategorie(Long idCat) {
		// TODO Auto-generated method stub
		return dao.produitsParCategorie(idCat);
	}

	@Override
	public List<Produit> produitsSelectionnes() {
		
		return dao.produitsSelectionnes();
	}

	@Override
	public Produit getProduit(Long idP) {
		// TODO Auto-generated method stub
		return dao.getProduit(idP);
	}

	@Override
	public Commande enregistrerCommande(Panier p, Client c) {
		// TODO Auto-generated method stub
		return dao.enregistrerCommande(p, c);
	}
	
	
	
	
	

}
