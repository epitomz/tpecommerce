package dao;

import java.util.List;
import java.util.Set;

import metier.Categorie;
import metier.Client;
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
		
		if(u!=null && u.isActived()==true){
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
	
	//--
	public Long ajouterProduit(Produit p, Long idCat){
		p=(Produit)getSession().save(p);
		Categorie c=getCategorie(idCat);
		Set<Produit> list=c.getListeProduit();
		list.add(p);
		c.setListeProduit(list);
		getSession().update(c);
		return p.getIdProduit();
		
	}
	
	//--
	public List<Produit> listproduits(){
		return this.getSession().createQuery("FROM Produit").list();
	}
	
	//ko
	public List<Produit> produitsParMotCle(String mc){
		//return this.getSession().createQuery("FROM Produit").list();
	}
	
	//ko
	public List<Produit> produitsParCategorie(Long idCat){
		//return this.getSession().createQuery("FROM Produit").list();
	}
	
	//ko
	public List<Produit> produitsSelectionnes(){
		//return this.getSession().createQuery("FROM Produit").list();
	}
	
	//--
	public Produit getProduit(Long idP){
		return (Produit) this.getSession().get(Produit.class, idP);
	}
	
	//--
	public void supprimerProduit(Long idP){
		this.getSession().delete(this.getProduit(idP));
	}
	
	//--
	public void modifierProduit(Produit p){
		this.getSession().update(p);
	}
	
	//--
	public void ajouterUser(User u){
		this.getSession().save(u);
	}
	
	//ko
	public void attribuerRole(Role r,Long userID){
		User u= (User) this.getSession().get(User.class, userID);
		Set<Role> liste =u.get;
//		list.add(p);
//		c.setListeProduit(list);
//		getSession().update(c);
//		return p.getIdProduit();
	}
	
	//ko
	public Commande enregistrerCommande(Panier p,Client c){
		
	}

}
