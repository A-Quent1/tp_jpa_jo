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

/** Classe Pays 
 * 
 * @author Quentin
 */

@Entity
@Table(name="PAYS")
public class Pays {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	
	@Column(name = "CIO_CODE", length = 3, nullable= false)
	public String cioCode;
	
	@Column(name = "NOM_FR", length = 50, nullable= false)
	public String nomFR;
	
	@Column(name = "NOM_EN", length = 50, nullable= false)
	public String nomEN;
	
	@Column(name = "CODE_ISO_A3", length = 3, nullable= false)
	public String codeIsoA3;
	
	@Column(name = "OBSOLETE", length = 1, nullable= false)
	public String obsolete;
	
	/** Jointure OneToMany de Pays et Equipe
	 *  avec une liste des pays
	 */
	@OneToMany(mappedBy = "pays")
	public List<Equipe> equipes = new ArrayList<Equipe>();
	
	/** Jointure ManyToMany de Athlete à Pays
	 *  avec une liste des athletes
	 */
	@ManyToMany(mappedBy = "pays")
	public List<Athlete> athlete = new ArrayList<Athlete>();
	
	/** Jointure ManyToMany de JeuOlympique à Pays
	 *  avec une liste des jeuxOlympiques
	 */
	@ManyToMany(mappedBy = "pays")
	public List<JeuOlympique> jeuxOlympiques = new ArrayList<JeuOlympique>();
	
	/* Constructeur de Pays
	 * 
	 */
	public Pays() {
		super();
	}
	
	/** Constructeur de Pays
	 * 
	 * @param cioCode
	 * @param nomFR
	 * @param nomEN
	 * @param codeIsoA3
	 * @param obsolete
	 */
	public Pays(String cioCode, String nomFR, String nomEN, String codeIsoA3, String obsolete) {
		super();
		this.cioCode = cioCode;
		this.nomFR = nomFR;
		this.nomEN = nomEN;
		this.codeIsoA3 = codeIsoA3;
		this.obsolete = obsolete;
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
	 * Getter pour l'attribut cioCode
	 * @return the cioCode
	 */
	public String getCioCode() {
		return cioCode;
	}

	/**
	 * Setter pour l'attribut cioCode
	 * @param cioCode the cioCode to set
	 */
	public void setCioCode(String cioCode) {
		this.cioCode = cioCode;
	}

	/**
	 * Getter pour l'attribut nomFR
	 * @return the nomFR
	 */
	public String getNomFR() {
		return nomFR;
	}

	/**
	 * Setter pour l'attribut nomFR
	 * @param nomFR the nomFR to set
	 */
	public void setNomFR(String nomFR) {
		this.nomFR = nomFR;
	}

	/**
	 * Getter pour l'attribut nomEN
	 * @return the nomEN
	 */
	public String getNomEN() {
		return nomEN;
	}

	/**
	 * Setter pour l'attribut nomEN
	 * @param nomEN the nomEN to set
	 */
	public void setNomEN(String nomEN) {
		this.nomEN = nomEN;
	}

	/**
	 * Getter pour l'attribut codeIsoA3
	 * @return the codeIsoA3
	 */
	public String getCodeIsoA3() {
		return codeIsoA3;
	}

	/**
	 * Setter pour l'attribut codeIsoA3
	 * @param codeIsoA3 the codeIsoA3 to set
	 */
	public void setCodeIsoA3(String codeIsoA3) {
		this.codeIsoA3 = codeIsoA3;
	}

	/**
	 * Getter pour l'attribut obsolete
	 * @return the obsolete
	 */
	public String getObsolete() {
		return obsolete;
	}

	/**
	 * Setter pour l'attribut obsolete
	 * @param obsolete the obsolete to set
	 */
	public void setObsolete(String obsolete) {
		this.obsolete = obsolete;
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
	 * Getter pour l'attribut athlete
	 * @return the athlete
	 */
	public List<Athlete> getAthlete() {
		return athlete;
	}

	/**
	 * Setter pour l'attribut athlete
	 * @param athlete the athlete to set
	 */
	public void setAthlete(List<Athlete> athlete) {
		this.athlete = athlete;
	}

	/**
	 * Getter pour l'attribut jeuxOlympiques
	 * @return the jeuxOlympiques
	 */
	public List<JeuOlympique> getJeuxOlympiques() {
		return jeuxOlympiques;
	}

	/**
	 * Setter pour l'attribut jeuxOlympiques
	 * @param jeuxOlympiques the jeuxOlympiques to set
	 */
	public void setJeuxOlympiques(List<JeuOlympique> jeuxOlympiques) {
		this.jeuxOlympiques = jeuxOlympiques;
	}
	
}
