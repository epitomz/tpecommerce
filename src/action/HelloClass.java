package action;

import javax.management.relation.Role;

import metier.User;

import com.opensymphony.xwork2.ActionSupport;

public class HelloClass extends ActionSupport {

	private String message;
	private String nom;
	
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public HelloClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String execute() throws Exception {
		// on mets � jour les variables acessibles apr�s par les getter/setter
		setMessage("Struts est lanc�");
		return SUCCESS;
	}
	
	public String bonjour(){
		setMessage("Bonjour Bob");
		return SUCCESS;
	}
	
	public String versFormulaire(){
		setMessage("Bienvenue dans le formulaire");
		return SUCCESS;
	}
	
	public String infosFormulaire(){
		
		setMessage(getNom());
		return SUCCESS;
	}
	
}
