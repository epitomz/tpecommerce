package action;

import java.util.List;

import metier.Categorie;

import org.springframework.beans.factory.annotation.Autowired;

import service.IAdminCategoriesService;

import com.opensymphony.xwork2.ActionSupport;

public class CategorieAction extends ActionSupport {
	private long idRole;
	private Categorie categorie;
	private List<Categorie> categories;
	
	@Autowired
	public IAdminCategoriesService AdmineCategoriesService;
	
	public String listeC() {
		return SUCCESS;
	}
	
	public String saveC() {
		AdmineCategoriesService.ajouterCategorie(categorie);
		return SUCCESS;
	}
	
	public String updateC() {
		return SUCCESS;
	}
	
	public String deleteC() {
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

	public IAdminCategoriesService getAdmineCategoriesService() {
		return AdmineCategoriesService;
	}

	public void setAdmineCategoriesService(
			IAdminCategoriesService admineCategoriesService) {
		AdmineCategoriesService = admineCategoriesService;
	}

	public void attribuerRole() {
	
}
}
