package service;

import java.util.List;
import java.util.Set;

import metier.Categorie;
import metier.Client;
import metier.Commande;
import metier.LigneCommande;
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

	//Commande----------------------------------------------------------------------
	@Override
	public Long saveCommande(Commande c) {
		// TODO Auto-generated method stub
		return dao.saveCommande(c);
	}

	@Override
	public void deleteCommande(Long idCommande) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Commande getCommande(Long idCommande) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void updateCommande(Commande c) {
		// TODO Auto-generated method stub
		
	}

	//LigneCommande------------------------------------------------------------------
	@Override
	public Long saveLigneCommande(LigneCommande l) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteLigneCommande(Long idLigneCommande) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void updateLigneCommande(LigneCommande l) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public LigneCommande getLigneCommande(Long idLigneCommande) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Set<LigneCommande> listerLigneCommande() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Set<LigneCommande> listerLigneCommande(Long idClient) {
		// TODO Auto-generated method stub
		return null;
	}

	//Client--------------------------------------------------------------------------

	@Override
	public Long saveClient(Client c) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteClient(Long idClient) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void updateClient(Client c) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Client getClient(Long idClient) {
		// TODO Auto-generated method stub
		return null;
	}
	
	//Internaute--------------------------------------------------------------------


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
