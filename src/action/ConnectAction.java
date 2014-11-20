package action;

import java.util.List;
import java.util.Map;

import metier.Categorie;
import metier.Produit;
import metier.Role;
import metier.User;

import org.springframework.beans.factory.annotation.Autowired;

import service.IAdminCategoriesService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ConnectAction extends ActionSupport {

	@Autowired
	public IAdminCategoriesService AdminCategoriesService;

	private User user;
	private Role role;
	private List<Produit> produits;
	private List<Categorie> categories;
	private List<User> users;

	public String login() {
		users = AdminCategoriesService.listUsers();
		return SUCCESS;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public String connect() throws InterruptedException {
		String connected = AdminCategoriesService.Authentifier(user);
		if (connected.equals("success")) {
			user = AdminCategoriesService.getUser(user.getUserName());
			Map session = ActionContext.getContext().getSession();
			session.put("logined", "true");
			session.put("username", user.getUserName());
			Long role = user.getRole().getIdRole();
			session.put("role", role.toString());	
		}
		
		produits = AdminCategoriesService.listproduits();
		categories = AdminCategoriesService.listCategories();
		return connected;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

	public List<Categorie> getCategories() {
		return categories;
	}

	public void setCategories(List<Categorie> categories) {
		this.categories = categories;
	}

	public String logout() {
		AdminCategoriesService.Authentifier(user);
		Map session = ActionContext.getContext().getSession();
		session.remove("logined");
		session.remove("username");
		session.remove("role");
		produits = AdminCategoriesService.listproduits();
		categories = AdminCategoriesService.listCategories();
		return SUCCESS;
	}

	public IAdminCategoriesService getAdminCategoriesService() {
		return AdminCategoriesService;
	}

	public void setAdminCategoriesService(
			IAdminCategoriesService adminCategoriesService) {
		AdminCategoriesService = adminCategoriesService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
