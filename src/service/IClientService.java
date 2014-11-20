package service;

import metier.Commande;

public interface IClientService extends InternauteBoutiqueService {
	
	public Long saveCommande(Commande c);
	
	

}
