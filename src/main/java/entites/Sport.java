package entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/** Classe Sport 
 * 
 * @author Quentin
 */

@Entity
@Table(name="SPORT")
public class Sport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	
	@Column(name = "LIBELLE_EN", length = 200, nullable= false, unique= true)
	public String libelleEN;
	
	@Column(name = "LIBELLE_FR", length = 200, nullable= false, unique= true)
	public String libelleFR;
	
	/** Jointure OneToMany de Sport et Equipe
	 *  avec une liste des equipes
	 */
	@OneToMany(mappedBy = "pays")
	public List<Equipe> equipes = new ArrayList<Equipe>();
	
	/** Jointure ManyToMany de JeuOlympique à Sport
	 *  avec une liste des jeuOlympiques
	 */
	@ManyToMany(mappedBy = "sports")
	public List<JeuOlympique> jeuOlympiques = new ArrayList<JeuOlympique>();
	
	/**Constructeur de Athlete
	 * 
	 */
	public Sport() {
		super();
	}
	
	/** Constructeur de Athlete
	 * 
	 * @param libelleEN
	 * @param libelleFR
	 */
	public Sport(String libelleEN, String libelleFR) {
		super();
		this.libelleEN = libelleEN;
		this.libelleFR = libelleFR;
	}

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
	 * Getter pour l'attribut libelleEN
	 * @return the libelleEN
	 */
	public String getLibelleEN() {
		return libelleEN;
	}

	/**
	 * Setter pour l'attribut libelleEN
	 * @param libelleEN the libelleEN to set
	 */
	public void setLibelleEN(String libelleEN) {
		this.libelleEN = libelleEN;
	}

	/**
	 * Getter pour l'attribut libelleFR
	 * @return the libelleFR
	 */
	public String getLibelleFR() {
		return libelleFR;
	}

	/**
	 * Setter pour l'attribut libelleFR
	 * @param libelleFR the libelleFR to set
	 */
	public void setLibelleFR(String libelleFR) {
		this.libelleFR = libelleFR;
	}

	/**
	 * Getter pour l'attribut equipes
	 * @return the equipes
	 */
	public List<Equipe> getEquipes() {
		return equipes;
	}

	/**
	 * Setter pour l'attribut equipes
	 * @param equipes the equipes to set
	 */
	public void setEquipes(List<Equipe> equipes) {
		this.equipes = equipes;
	}

	/**
	 * Getter pour l'attribut jeuOlympique
	 * @return the jeuOlympique
	 */
	public List<JeuOlympique> getJeuOlympique() {
		return jeuOlympiques;
	}

	/**
	 * Setter pour l'attribut jeuOlympique
	 * @param jeuOlympique the jeuOlympique to set
	 */
	public void setJeuOlympique(List<JeuOlympique> jeuOlympiques) {
		this.jeuOlympiques = jeuOlympiques;
	}
	
}
