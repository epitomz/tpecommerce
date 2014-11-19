package action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import metier.Produit;

import com.opensymphony.xwork2.ActionSupport;

import dao.IBoutiqueDao;

public class ClientAction extends ActionSupport {

	private Produit produit;
	private List<Produit> produits;
	
	@Autowired
	public IBoutiqueDao dao;
	
	
	
}
