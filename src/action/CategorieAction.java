package action;

import java.util.List;

import metier.Categorie;
import metier.User;

import org.springframework.beans.factory.annotation.Autowired;

import service.IAdminCategoriesService;

import com.opensymphony.xwork2.ActionSupport;

public class CategorieAction extends ActionSupport {
	private long idRole;
	private Categorie categorie;
	private List<Categorie> categories;
	private long idCat;
	private boolean editMode=false;
	
	private User user;
	private List<User> users;
	private long idUser;
	
	
	@Autowired
	public IAdminCategoriesService adminCategoriesService;
	
	public String listeC() {
		categories=adminCategoriesService.listCategories();
		return SUCCESS;
	}
	
	public String saveC() {
		if(!editMode)
			adminCategoriesService.ajouterCategorie(categorie);
		else{
			adminCategoriesService.modifierCategorie(categorie);
			editMode=false;
			categorie=new Categorie();
		}
		categories=adminCategoriesService.listCategories();
		return SUCCESS;
	}
	
	public String updateC() {
		editMode=true;
		categorie=adminCategoriesService.getCategorie(idCat);
		categories=adminCategoriesService.listCategories();
		return SUCCESS;
	}
	
	public String deleteC() {
		adminCategoriesService.supprimerCategrorie(idCat);
		categories=adminCategoriesService.listCategories();
		return SUCCESS;
	}

	public String listeU() {
		users=adminCategoriesService.listUsers();
		return SUCCESS;
	}
	
	public String saveU() {
		if(!editMode)
			adminCategoriesService.ajouterUser(user);
		else{
			adminCategoriesService.modifierUser(user);
			editMode=false;
			user=new User();
		}
		users=adminCategoriesService.listUsers();
		return SUCCESS;
	}
	
	public String updateU() {
		editMode=true;
		user=adminCategoriesService.getUser(idUser);
		userss=adminCategoriesService.listUsers();
		return SUCCESS;
	}
	
	public String deleteU() {
		adminCategoriesService.supprimerCategrorie(idCat);
		categories=adminCategoriesService.listCategories();
		return SUCCESS;
	}
	
	
	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public List<Categorie> getCategories() {
		return categories;
	}

	public void setCategories(List<Categorie> categories) {
		this.categories = categories;
	}



	public long getIdRole() {
		return idRole;
	}

	public void setIdRole(long idRole) {
		this.idRole = idRole;
	}

	public IAdminCategoriesService getAdminCategoriesService() {
		return adminCategoriesService;
	}
	public void setAdminCategoriesService(
			IAdminCategoriesService adminCategoriesService) {
		this.adminCategoriesService = adminCategoriesService;
	}
	
	
	public boolean isEditMode() {
		return editMode;
	}

	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}

	
	

	public long getIdCat() {
		return idCat;
	}

	public void setIdCat(long idCat) {
		this.idCat = idCat;
	}

	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public long getIdUser() {
		return idUser;
	}

	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}

	public void attribuerRole() {
	
	}


}
