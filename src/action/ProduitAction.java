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
	private boolean editMode = false;

	@Autowired
	public IAdminCategoriesService AdminCategoriesService;

	public void setIdCat(long idCat) {
		this.idCat = idCat;
	}

	public String listeP() {
		produits = AdminCategoriesService.listproduits();
		return SUCCESS;
	}

	public String listeCetP() {
		produits = AdminCategoriesService.listproduits();
		categories = AdminCategoriesService.listCategories();
		return SUCCESS;
	}

	public String saveP() {
		if (editMode == false) {
			AdminCategoriesService.ajouterProduit(produit, idCat);
		} else {
			AdminCategoriesService.modifierProduit(produit);
			editMode = false;
		}
		this.listeCetP();

		produit = new Produit();
		return SUCCESS;
	}

	public String updateP() {
		editMode = true;
		produit = AdminCategoriesService.getProduit(ref);
		this.listeCetP();

		return SUCCESS;
	}

	public String deleteP() {
		AdminCategoriesService.supprimerProduit(ref);
		this.listeCetP();
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

	public long getRef() {
		return ref;
	}

	public void setRef(long ref) {
		this.ref = ref;
	}

	public boolean isEditMode() {
		return editMode;
	}

	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}

}
