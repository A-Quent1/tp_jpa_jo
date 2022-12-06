package entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="JEUOLYMPIQUE")
public class JeuOlympique {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	
	@Column(name = "YEAR", length = 4, nullable= false)
	public int year;
	
	@Column(name = "SEASON", nullable= false)
	public Saison season;
	
	@Column(name = "CITY", length = 50, nullable= false)
	public String city;
	
	@OneToMany(mappedBy = "jeuOlympique")
	public List<Medaille> medailles = new ArrayList<Medaille>();
	
	@ManyToMany
	@JoinTable(name = "LIEN_JO_EPREUVE",
	joinColumns = @JoinColumn(name = "ID_JO", referencedColumnName = "Id"),
	inverseJoinColumns = @JoinColumn(name = "ID_EPREUVE", referencedColumnName = "Id" ))
	public List<Epreuve> epreuves = new ArrayList<Epreuve>();
	
	@ManyToMany
	@JoinTable(name = "LIEN_JO_EQUIPE",
	joinColumns = @JoinColumn(name = "ID_JO", referencedColumnName = "Id"),
	inverseJoinColumns = @JoinColumn(name = "ID_EQUIPE", referencedColumnName = "Id" ))
	public List<Equipe> equipes = new ArrayList<Equipe>();
	
	@ManyToMany
	@JoinTable(name = "LIEN_JO_PAYS",
	joinColumns = @JoinColumn(name = "ID_JO", referencedColumnName = "Id"),
	inverseJoinColumns = @JoinColumn(name = "ID_PAYS", referencedColumnName = "Id" ))
	public List<Pays> pays = new ArrayList<Pays>();
	
	@ManyToMany
	@JoinTable(name = "LIEN_JO_SPORT",
	joinColumns = @JoinColumn(name = "ID_JO", referencedColumnName = "Id"),
	inverseJoinColumns = @JoinColumn(name = "ID_SPORT", referencedColumnName = "Id" ))
	public List<Sport> sports = new ArrayList<Sport>();
	
	public JeuOlympique() {
		super();
	}

	public JeuOlympique(int year, Saison season, String city) {
		super();
		this.year = year;
		this.season = season;
		this.city = city;
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
	 * Getter pour l'attribut year
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Setter pour l'attribut year
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * Getter pour l'attribut season
	 * @return the season
	 */
	public Saison getSeason() {
		return season;
	}

	/**
	 * Setter pour l'attribut season
	 * @param season the season to set
	 */
	public void setSeason(Saison season) {
		this.season = season;
	}

	/**
	 * Getter pour l'attribut city
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Setter pour l'attribut city
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Getter pour l'attribut medailles
	 * @return the medailles
	 */
	public List<Medaille> getMedailles() {
		return medailles;
	}

	/**
	 * Setter pour l'attribut medailles
	 * @param medailles the medailles to set
	 */
	public void setMedailles(List<Medaille> medailles) {
		this.medailles = medailles;
	}

	/**
	 * Getter pour l'attribut epreuve
	 * @return the epreuve
	 */
	public List<Epreuve> getEpreuve() {
		return epreuves;
	}

	/**
	 * Setter pour l'attribut epreuve
	 * @param epreuve the epreuve to set
	 */
	public void setEpreuve(List<Epreuve> epreuves) {
		this.epreuves = epreuves;
	}

	/**
	 * Getter pour l'attribut equipe
	 * @return the equipe
	 */
	public List<Equipe> getEquipe() {
		return equipes;
	}

	/**
	 * Setter pour l'attribut equipe
	 * @param equipe the equipe to set
	 */
	public void setEquipe(List<Equipe> equipes) {
		this.equipes = equipes;
	}

	/**
	 * Getter pour l'attribut pays
	 * @return the pays
	 */
	public List<Pays> getPays() {
		return pays;
	}

	/**
	 * Setter pour l'attribut pays
	 * @param pays the pays to set
	 */
	public void setPays(List<Pays> pays) {
		this.pays = pays;
	}

	/**
	 * Getter pour l'attribut sport
	 * @return the sport
	 */
	public List<Sport> getSport() {
		return sports;
	}

	/**
	 * Setter pour l'attribut sport
	 * @param sport the sport to set
	 */
	public void setSport(List<Sport> sports) {
		this.sports = sports;
	}
	
}
