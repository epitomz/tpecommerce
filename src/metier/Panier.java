package metier;

import java.io.Serializable;
import java.util.Set;

public class Panier implements Serializable{
	
	
	
	private Set<LigneCommande> ligneCommande;

	public Panier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Set<LigneCommande> getLigneCommande() {
		return ligneCommande;
	}

	public void setLigneCommande(Set<LigneCommande> ligneCommande) {
		this.ligneCommande = ligneCommande;
	}
	
	
	
}
