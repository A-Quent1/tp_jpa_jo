package entites;

/** Enumeration des Sexes des athletes 
 * 
 * @author Quentin
 */

public enum Sexe {
	
	F ("Female"),
	M ("Male");
	
	public String libelle;
	
	Sexe (String libelle) {
		this.libelle = libelle;
	}

	/**
	 * Getter pour l'attribut libelle
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Setter pour l'attribut libelle
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	

}
