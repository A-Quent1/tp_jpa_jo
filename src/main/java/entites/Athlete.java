package entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/** Classe Athlete 
 * 
 * @author Quentin
 */

@Entity
@Table(name="ATHLETE")
public class Athlete {
	
	@Id
	public int id;
	
	@Column(name = "NAME", length = 50, nullable= false)
	public String name;
	
	@Column(name = "SEX", nullable= false)
	public Sexe sex;
	
	@Column(name = "AGE", length = 2, nullable= false)
	public int age;
	
	@Column(name = "HEIGHT", length = 3)
	public int height;
	
	@Column(name = "WEIGHT", length = 3)
	public double weight;
	
	/** Jointure OneToMany de Athlete et Medaille
	 *  avec une liste des medailles
	 */
	@OneToMany(mappedBy = "athlete")
	public List<Medaille> medailles = new ArrayList<Medaille>();
	
	/** Jointure ManyToMany de Athlete à Pays
	 *  avec l'id de Athlete et de Pays
	 */
	@ManyToMany
	@JoinTable(name = "LIEN_ATHLETE_PAYS",
	joinColumns = @JoinColumn(name = "ID_ATHLETE", referencedColumnName = "Id"),
	inverseJoinColumns = @JoinColumn(name = "ID_PAYS", referencedColumnName = "Id" ))
	public List<Pays> pays = new ArrayList<Pays>();
	
	/** Jointure ManyToMany de Athlete à Epreuve
	 *  avec l'id de Athlete et de Epreuve
	 */
	@ManyToMany
	@JoinTable(name = "LIEN_ATHLETE_EPREUVE",
	joinColumns = @JoinColumn(name = "ID_ATHLETE", referencedColumnName = "Id"),
	inverseJoinColumns = @JoinColumn(name = "ID_EPREUVE", referencedColumnName = "Id" ))
	public List<Epreuve> epreuves = new ArrayList<Epreuve>();
	
	/** Jointure ManyToMany de Athlete à Equipe
	 *  avec l'id de Athlete et de Equipe
	 */
	@ManyToMany
	@JoinTable(name = "LIEN_ATHLETE_EQUIPE",
	joinColumns = @JoinColumn(name = "ID_ATHLETE", referencedColumnName = "Id"),
	inverseJoinColumns = @JoinColumn(name = "ID_EQUIPE", referencedColumnName = "Id" ))
	public List<Equipe> equipes = new ArrayList<Equipe>();
	
	/**Constructeur de Athlete
	 * 
	 */
	public Athlete() {
		super();
	}
	
	/**Constructeur de Athlete
	 * 
	 * @param id
	 * @param name
	 * @param sex
	 * @param age
	 * @param height
	 * @param weight
	 */
	public Athlete(int id, String name, Sexe sex, int age, int height, double weight) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.height = height;
		this.weight = weight;
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
	 * Getter pour l'attribut name
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter pour l'attribut name
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter pour l'attribut sex
	 * @return the sex
	 */
	public Sexe getSex() {
		return sex;
	}

	/**
	 * Setter pour l'attribut sex
	 * @param sex the sex to set
	 */
	public void setSex(Sexe sex) {
		this.sex = sex;
	}

	/**
	 * Getter pour l'attribut age
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Setter pour l'attribut age
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Getter pour l'attribut height
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Setter pour l'attribut height
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * Getter pour l'attribut weight
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * Setter pour l'attribut weight
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
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
	 * Getter pour l'attribut epreuves
	 * @return the epreuves
	 */
	public List<Epreuve> getEpreuves() {
		return epreuves;
	}

	/**
	 * Setter pour l'attribut epreuves
	 * @param epreuves the epreuves to set
	 */
	public void setEpreuves(List<Epreuve> epreuves) {
		this.epreuves = epreuves;
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
	
}
