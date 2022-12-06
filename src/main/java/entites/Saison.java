package entites;

public enum Saison {
	
	SUMMER ("Summer"),
	WINTER ("Winter");
	
	public String libelle;
	
	Saison (String libelle) {
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
