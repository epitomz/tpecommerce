package action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import service.IAdminProduitService;
import metier.Produit;

import com.opensymphony.xwork2.ActionSupport;

import dao.IBoutiqueDao;

public class ProduitAction extends ActionSupport {

	private Produit produit;
	private List<Produit> produits;
	private Long idCat;
	
	@Autowired
	public IAdminProduitService AdminProduitService;
	
	public String listeP() {

		return SUCCESS;
	}
	
	public String saveP() {
		AdminProduitService.ajouterProduit(produit,idCat);
		return SUCCESS;
	}
	
	public String updateP() {
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
		return AdminProduitService;
	}

	public void setAdminProduitService(IAdminProduitService adminProduitService) {
		AdminProduitService = adminProduitService;
	}

	
	
	
}
