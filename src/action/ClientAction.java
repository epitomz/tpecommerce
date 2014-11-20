package action;

import java.util.List;
import java.util.Set;

import metier.Client;
import metier.Commande;
import metier.LigneCommande;
import metier.Panier;
import metier.Produit;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import dao.IBoutiqueDao;

public class ClientAction extends ActionSupport {

	private Produit produit;
	private List<Produit> produits;
	
	private Panier panier;
	private Commande commande;
	private Long idCommande;
	private Client client;
	private Long idClient;
	private double total;
	private LigneCommande ligneCommande;
	private Long idLigneCommande;
	private Set<LigneCommande> listeLigneCommande;
		
	@Autowired
	public IBoutiqueDao dao;

	public ClientAction() {
		super();
		// TODO Auto-generated constructor stub
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

	public Panier getPanier() {
		return panier;
	}

	public void setPanier(Panier panier) {
		this.panier = panier;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public Long getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public LigneCommande getLigneCommande() {
		return ligneCommande;
	}

	public void setLigneCommande(LigneCommande ligneCommande) {
		this.ligneCommande = ligneCommande;
	}

	public Long getIdLigneCommande() {
		return idLigneCommande;
	}

	public void setIdLigneCommande(Long idLigneCommande) {
		this.idLigneCommande = idLigneCommande;
	}

	public Set<LigneCommande> getListeLigneCommande() {
		return listeLigneCommande;
	}

	public void setListeLigneCommande(Set<LigneCommande> listeLigneCommande) {
		this.listeLigneCommande = listeLigneCommande;
	}

	public IBoutiqueDao getDao() {
		return dao;
	}

	public void setDao(IBoutiqueDao dao) {
		this.dao = dao;
	}
	
	public String listerLigneCommande(){
		if(idClient == null)
		{
		listeLigneCommande = dao.listerLigneCommande();
		}
		else{
			listeLigneCommande = dao.listerLigneCommande(idClient);
		}
		
		return SUCCESS;
	}
	
	
	
	public String majTotal(Set<LigneCommande> listeLigneCommande){
		
		total = 0;
		
		for(LigneCommande c : listeLigneCommande){
			total = total + c.getProduit().getPrix() * c.getQuantite();
		}
		
		return SUCCESS;
		
	}
	
	public String saveLigneCommande(){
		dao.saveLigneCommande(ligneCommande);
		return SUCCESS;
		
	}
	
	public String saveCommande(){
		dao.saveCommande(commande);
		return SUCCESS;
		
	}
	

	
	public String updateClient(){
		dao.updateClient(client);
		return SUCCESS;
		
	}
	
	
	
}
