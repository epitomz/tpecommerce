package dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import metier.Categorie;
import metier.Client;
import metier.Commande;
import metier.LigneCommande;
import metier.Panier;
import metier.Produit;
import metier.Role;
import metier.User;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
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
		
		User u = (User) this.getSession().createQuery("FROM User u WHERE u.userName = ? and u.password = ?").setParameter(0,userName).setParameter(1, password).uniqueResult();
		
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
		List<Categorie> list=new ArrayList<Categorie>();
		list=getSession().createQuery("FROM Categorie").list();
		return list;
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
		getSession().update(c);
	}
	
	//--
	public Long ajouterProduit(Produit p, Long idCat){
		Categorie c=getCategorie(idCat);
		p.setCategorie(c);
		getSession().save(p);
		return (Long)p.getIdProduit();
		
	}
	

	public List<Produit> listproduits(){
		List<Produit> list= new ArrayList<Produit>();
				list=getSession().createQuery("FROM Produit").list();
		return list;
	}
	
	public List<Produit> produitsParMotCle(String mc){
		List<Produit> list= new ArrayList<Produit>();
		String query="FROM Produit p where p.designation like %"+mc+"%";
		list=getSession().createQuery(query).list();
		return list;
	}
	

	public List<Produit> produitsParCategorie(Long idCat){
		List<Produit> list= new ArrayList<Produit>();
		list=getSession().createQuery("FROM Produit p where p.idCategorie=?1").setParameter(1, idCat).list();
		return list;
	}
	

	public List<Produit> produitsSelectionnes(){
		List<Produit> list= new ArrayList<Produit>();
		list=getSession().createQuery("FROM Produit p where p.selectionne=1").list();
		return list;
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
		this.getSession().update(p);
	}
	
	//--
	public Long ajouterUser(User u){
		return (Long) getSession().save(u);
	}
	
	
	
	
	@Override
	public List<User> listUsers() {
		List<User> list= new ArrayList<User>();
		list=getSession().createQuery("FROM User").list();
		return list;
	}

	@Override
	public User getUser(Long idUser) {
		return (User) this.getSession().get(User.class, idUser);
	}

	@Override
	public void supprimerUser(Long idUser) {
		this.getSession().delete(this.getUser(idUser));
		
	}

	@Override
	public void modifierUser(User u) {
		getSession().update(u);
		
	}

	public void attribuerRole(Long roleID,Long userID){
		
		User u= (User) this.getSession().get(User.class, userID);
		Role r= (Role) this.getSession().get(Role.class, roleID);
		u.setRole(r);
		getSession().update(u);
		
		
	}
	
	public List<Role> listRoles(){
		List<Role> list= new ArrayList<Role>();
		list=getSession().createQuery("FROM Role").list();
		return list;
	}
	
	//Commande-----------------------
	
	public Commande enregistrerCommande(Panier p,Client c){
		Commande commande=new Commande();
		commande.setClient(c);
		commande.setDateCommande(new Date());
		commande.setLigneCommande(p.getLigneCommande());
		getSession().save(commande);
		return commande;
		
	}
	

	
	//ko
	public Set<LigneCommande> listerLigneCommande(){
		return null;
	}
	
	//ko
	public Set<LigneCommande> listerLigneCommande(Long idClient){
		return null;
	}
	
	//ko
	public Long saveCommande(Commande c){
		return null;
	}

	@Override
	public void deleteCommande(Commande c) {
		// TODO Auto-generated method stub
		
	}
	
	//Client------
	
	@Override
	public Long saveClient(Client c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Client c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateClient(Client c) {
		// TODO Auto-generated method stub
		
	}
	

}
