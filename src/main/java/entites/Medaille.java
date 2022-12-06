package entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="MEDAILLE")
public class Medaille {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	
	@Column(name = "MEDAL")
	public Matiere medal;
	
	@ManyToOne
	@JoinColumn(name = "ID_ATHLETE")
	public Athlete athlete;
	
	@ManyToOne
	@JoinColumn(name = "ID_EPREUVE")
	public Epreuve epreuve;
	
	@ManyToOne
	@JoinColumn(name = "ID_JO")
	public JeuOlympique jeuOlympique;

	/**
	 * Getter pour l'attribut id
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter pour l'attribut id
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Getter pour l'attribut medal
	 * @return the medal
	 */
	public Matiere getMedal() {
		return medal;
	}

	/**
	 * Setter pour l'attribut medal
	 * @param medal the medal to set
	 */
	public void setMedal(Matiere medal) {
		this.medal = medal;
	}

	/**
	 * Getter pour l'attribut athlete
	 * @return the athlete
	 */
	public Athlete getAthlete() {
		return athlete;
	}

	/**
	 * Setter pour l'attribut athlete
	 * @param athlete the athlete to set
	 */
	public void setAthlete(Athlete athlete) {
		this.athlete = athlete;
	}

	/**
	 * Getter pour l'attribut epreuve
	 * @return the epreuve
	 */
	public Epreuve getEpreuve() {
		return epreuve;
	}

	/**
	 * Setter pour l'attribut epreuve
	 * @param epreuve the epreuve to set
	 */
	public void setEpreuve(Epreuve epreuve) {
		this.epreuve = epreuve;
	}

	/**
	 * Getter pour l'attribut jeuOlympique
	 * @return the jeuOlympique
	 */
	public JeuOlympique getJeuOlympique() {
		return jeuOlympique;
	}

	/**
	 * Setter pour l'attribut jeuOlympique
	 * @param jeuOlympique the jeuOlympique to set
	 */
	public void setJeuOlympique(JeuOlympique jeuOlympique) {
		this.jeuOlympique = jeuOlympique;
	}
	
}
