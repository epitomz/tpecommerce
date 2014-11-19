package metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Produit {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idProduit;
	private String designation;
	private String description;
	private double prix;
	private int quantite;
	private boolean selectionne;
	@ManyToOne
	@JoinColumn(name = "categorie", referencedColumnName ="idCategorie")
	private Categorie categorie;
	
	
	
	
	
/*-------------------------------------------------*/	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}



/*-------------------------------------------------*/

public long getIdProduit() {
	return idProduit;
}



public void setIdProduit(long idProduit) {
	this.idProduit = idProduit;
}



public String getDesignation() {
	return designation;
}



public void setDesignation(String designation) {
	this.designation = designation;
}



public String getDescription() {
	return description;
}



public void setDescription(String description) {
	this.description = description;
}



public double getPrix() {
	return prix;
}



public void setPrix(double prix) {
	this.prix = prix;
}



public int getQuantite() {
	return quantite;
}



public void setQuantite(int quantite) {
	this.quantite = quantite;
}



public boolean isSelectionne() {
	return selectionne;
}



public void setSelectionne(boolean selectionne) {
	this.selectionne = selectionne;
}



public Categorie getCategorie() {
	return categorie;
}



public void setCategorie(Categorie categorie) {
	this.categorie = categorie;
}







	
/*-------------------------------------------------*/		
	

}
