package action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import metier.Produit;

import com.opensymphony.xwork2.ActionSupport;

import dao.IBoutiqueDao;

public class ProduitAction extends ActionSupport {

	private Produit produit;
	private List<Produit> produits;
	
	@Autowired
	public IBoutiqueDao dao;
	
	public String liste() {
		return SUCCESS;
	}
	
	public String save() {
		return SUCCESS;
	}
	
	public String update() {
		return SUCCESS;
	}
	
	public String delete() {
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

	public IBoutiqueDao getDao() {
		return dao;
	}

	public void setDao(IBoutiqueDao dao) {
		this.dao = dao;
	}
	
	
	
}