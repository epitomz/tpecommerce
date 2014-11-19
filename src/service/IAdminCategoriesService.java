package service;


import metier.Categorie;
import metier.Role;
import metier.User;

public interface IAdminCategoriesService extends IAdminProduitService {

	public Long ajouterCategorie(Categorie c);
	public void supprimerCategrorie(Long idcat);
	public void modifierCategorie(Categorie c);
	public void ajouterUser(User u);
	public void attribuerRole(Role r,Long userID);

}
