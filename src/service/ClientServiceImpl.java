package service;

import java.util.List;

import metier.Categorie;
import metier.Client;
import metier.Commande;
import metier.Panier;
import metier.Produit;
import metier.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dao.IBoutiqueDao;


@Component
public class ClientServiceImpl implements IClientService{
	
	@Autowired
	private IBoutiqueDao dao;

	@Override
	public Long saveCommande(Commande c) {
		// TODO Auto-generated method stub
		return dao.saveCommande(c);
	}

	@Override
	public String Authentifier(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categorie> listCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categorie getCategorie(Long idCat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> listproduits() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> produitsParMotCle(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> produitsParCategorie(Long idCat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> produitsSelectionnes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit getProduit(Long idP) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Commande enregistrerCommande(Panier p, Client c) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
