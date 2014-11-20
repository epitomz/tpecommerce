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
	

}
