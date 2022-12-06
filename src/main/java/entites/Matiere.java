package entites;

/** Enumeration des Matieres des medailles 
 * 
 * @author Quentin
 */

public enum Matiere {
	
	BRONZE ("Bronze"),
	SILVER ("Silver"),
	GOLD ("Gold");
	
	public String libelle;
	
	Matiere (String libelle) {
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
