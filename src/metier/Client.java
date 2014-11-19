package metier;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Client implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idClient;
	private String nomClient;
	private String adresse;
	private String email;
	private String tel;
	@OneToOne
	@JoinColumn(name = "user", referencedColumnName = "idUser")
	private User user;
	
	@OneToMany(mappedBy = "client")
	private Set<Commande> commandes;
	
	
	
	
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdClient() {
		return idClient;
	}
	public void setIdClient(long idClient) {
		this.idClient = idClient;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Set<Commande> getCommande() {
		return commandes;
	}
	public void setCommande(Set<Commande> commande) {
		this.commandes = commande;
	}
	
	

}
