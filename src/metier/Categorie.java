package metier;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categorie implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idCategorie;
	private String nomCategorie;
	private String description;
	@OneToMany(mappedBy = "categorie")
	private Set<Produit> produits;
	
	/*-------------------------------------------------*/
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	/*-------------------------------------------------*/
	public long getIdCategorie() {
		return idCategorie;
	}
	public void setIdCategorie(long idCategorie) {
		this.idCategorie = idCategorie;
	}
	public String getNomCategorie() {
		return nomCategorie;
	}
	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}



	public Set<Produit> getListeProduit() {
		return produits;
	}



	public void setListeProduit(Set<Produit> listeProduit) {
		this.produits = listeProduit;
	}



	public Set<Produit> getProduits() {
		return produits;
	}



	public void setProduits(Set<Produit> produits) {
		this.produits = produits;
	}
	
	
	

}
