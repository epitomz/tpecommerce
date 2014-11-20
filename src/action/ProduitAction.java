package action;

import java.util.List;

import metier.Categorie;
import metier.Produit;

import org.springframework.beans.factory.annotation.Autowired;

import service.AdminCategoriesServiceImpl;
import service.IAdminCategoriesService;
import service.IAdminProduitService;

import com.opensymphony.xwork2.ActionSupport;

public class ProduitAction extends ActionSupport {

	private Produit produit;
	private List<Produit> produits;
	private long idCat;
	private List<Categorie> categories;
	private long ref;
	
	@Autowired
	public IAdminCategoriesService AdminCategoriesService;
	
	
	public void setIdCat(long idCat) {
		this.idCat = idCat;
	}

	public String listeP() {
		produits=AdminCategoriesService.listproduits();
		return SUCCESS;
	}
	
	public String listeCetP(){
		produits=AdminCategoriesService.listproduits();
		categories=AdminCategoriesService.listCategories();
		return SUCCESS;
	}
	
	public String saveP() {
		AdminCategoriesService.ajouterProduit(produit,idCat);
		produits = AdminCategoriesService.listproduits();
		categories = AdminCategoriesService.listCategories();
		return SUCCESS;
	}
	
	public String updateP() {
		produit = AdminCategoriesService.getProduit(ref);
		produits = AdminCategoriesService.listproduits();
		categories = AdminCategoriesService.listCategories();
		return SUCCESS;
	}
	
	public String deleteP() {
		return SUCCESS;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

	public IAdminProduitService getAdminProduitService() {
		return AdminCategoriesService;
	}

	public void setAdminProduitService(IAdminProduitService adminProduitService) {
		AdminCategoriesService = AdminCategoriesService;
	}

	public Long getIdCat() {
		return idCat;
	}

	public void setIdCat(Long idCat) {
		this.idCat = idCat;
	}

	public List<Categorie> getCategories() {
		return categories;
	}

	public void setCategories(List<Categorie> categories) {
		this.categories = categories;
	}

	public IAdminCategoriesService getAdminCategoriesService() {
		return AdminCategoriesService;
	}

	public void setAdminCategoriesService(
			IAdminCategoriesService adminCategoriesService) {
		AdminCategoriesService = adminCategoriesService;
	}

	
	
	
}
