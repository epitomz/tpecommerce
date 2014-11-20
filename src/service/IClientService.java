package service;

import metier.Produit;

public interface IClientService extends InternauteBoutiqueService {
	public Long ajouterProduit(Produit p, Long idCat);
	public void supprimerProduit(Long idP);
	public void modifierProduit(Produit p);

}
