package service;


import java.util.List;

import metier.Categorie;
import metier.User;

public interface IAdminCategoriesService extends IAdminProduitService {

	public Long ajouterCategorie(Categorie c);
	public void supprimerCategrorie(Long idcat);
	public void modifierCategorie(Categorie c);
	public void ajouterUser(User u);
	public User getUser(Long idUser);
	public List<User> listUsers();
	public void supprimerUser(Long idUser);
	public void modifierUser(User u);
	public void attribuerRole(Long roleID,Long userID);

}
