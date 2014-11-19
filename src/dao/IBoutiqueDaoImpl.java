package dao;

import java.util.List;

import metier.Categorie;
import metier.Commande;
import metier.Panier;
import metier.Produit;
import metier.Role;
import metier.User;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import business.model.City;

import com.sun.security.ntlm.Client;

@Repository("BoutiqueDao")
@Transactional

public class IBoutiqueDaoImpl implements IBoutiqueDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	//Méthodes------------------------------------------------------
	
	//--
	public String Authentifier (User user){
		
		String userName = user.getUserName();
		String password = user.getPassword();
		boolean actived = user.isActived();
		
		User u = (User) this.getSession().createQuery("FROM User u WHERE u.userName = ? && u.password = ?").setParameter(0,userName).setParameter(1, password).uniqueResult();
		
		if(u!=null && u.isActived()==1){
			return "success";
		}
		else{
			return "fail";
		}
			
	}
	
	//--
	public Long ajouterCategorie(Categorie c){
		this.getSession().save(c);
		return c.getIdCategorie();
	}
	
	//--
	public List<Categorie> listCategories(){
		return this.getSession().createQuery("FROM Categorie").list();
	}
	
	//--
	public Categorie getCategorie(Long idCat){
		return (Categorie) this.getSession().get(Categorie.class, idCat);
	}
	
	//--
	public void supprimerCategrorie(Long idcat){
		this.getSession().delete(this.getCategorie(idcat));
	}
	
	//--
	public void modifierCategorie(Categorie c){
		this.getSession().update(c);
	}
	
	//ko
	public Long ajouterProduit(Produit p, Long idCat){
		//this.getSession().save(c);
	}
	
	//--
	public List<Produit> listproduits(){
		return this.getSession().createQuery("FROM Produit").list();
	}
	
	//ko
	public List<Produit> produitsParMotCle(String mc){
		
	}
	
	//ko
	public List<Produit> produitsParCategorie(Long idCat){
		
	}
	
	//ko
	public List<Produit> produitsSelectionnes(){
		
	}
	
	//--
	public Produit getProduit(Long idP){
		return (Produit) this.getSession().get(Produit.class, idP);
	}
	
	//--
	public void supprimerProduit(Long idP){
		this.getSession().delete(this.getProduit(idP));
	}
	
	//ko
	public void modifierProduit(Produit p){
		
	}
	
	//--
	public void ajouterUser(User u){
		this.getSession().save(u);
	}
	
	//ko
	public void attribuerRole(Role r,Long userID){
		
	}
	
	//ko
	public Commande enregistrerCommande(Panier p,Client c){
		
	}

}
