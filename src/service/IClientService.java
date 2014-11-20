package service;

import java.util.Set;

import metier.Client;
import metier.Commande;
import metier.LigneCommande;

public interface IClientService extends InternauteBoutiqueService {
	
	    //Commande---------------
		public Long saveCommande(Commande c);
		public void deleteCommande(Long idCommande);
		public Commande getCommande(Long idCommande);
		public void updateCommande(Commande c);
		
		//LigneCommande---
		public Long saveLigneCommande(LigneCommande l);
		public void deleteLigneCommande(Long idLigneCommande);
		public void updateLigneCommande(LigneCommande l);
		public LigneCommande getLigneCommande(Long idLigneCommande);
		public Set<LigneCommande> listerLigneCommande();
		public Set<LigneCommande> listerLigneCommande(Long idClient);
		
		//Client-----------------
		public Long saveClient(Client c);
		public void deleteClient(Long idClient);
		public void updateClient(Client c);
		public Client getClient(Long idClient);
	
	

}
