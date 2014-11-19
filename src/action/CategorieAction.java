package action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import metier.Categorie;
import metier.Produit;

import com.opensymphony.xwork2.ActionSupport;

import dao.IBoutiqueDao;

public class CategorieAction extends ActionSupport {
	private long idRole;
	private Categorie categorie;
	private List<Categorie> categories;
	
	@Autowired
	public IBoutiqueDao dao;
	
	public String listeC() {
		return SUCCESS;
	}
	
	public String saveC() {
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

	public IBoutiqueDao getDao() {
		return dao;
	}

	public void setDao(IBoutiqueDao dao) {
		this.dao = dao;
	}

	public void attribuerRole()
	
}
