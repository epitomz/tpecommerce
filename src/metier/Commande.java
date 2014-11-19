package metier;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Commande implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idCommande;
	private Date dateCommande;
	@OneToMany(mappedBy = "commande")
	private Set<LigneCommande> ligneCommandes;
	@ManyToOne
	@JoinColumn(name = "client", referencedColumnName ="idClient")
	private Client client;
	
	
	
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Long getIdCommande() {
		return idCommande;
	}




	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}




	public Date getDateCommande() {
		return dateCommande;
	}




	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}




	public Set<LigneCommande> getLigneCommande() {
		return ligneCommandes;
	}




	public void setLigneCommande(Set<LigneCommande> ligneCommande) {
		this.ligneCommandes = ligneCommande;
	}




	public Client getClient() {
		return client;
	}




	public void setClient(Client client) {
		this.client = client;
	}

	

	
	
}
