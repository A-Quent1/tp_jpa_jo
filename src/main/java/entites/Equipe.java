package entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="EQUIPE")
public class Equipe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	
	@Column(name = "TEAM", length = 100, nullable= false)
	public String team;
	
	@Column(name = "NOC", length = 3, nullable= false)
	public String noc;
	
	@ManyToOne
	@JoinColumn(name = "ID_PAYS")
	public Pays pays;
	
	@ManyToMany(mappedBy = "equipes")
	public List<Athlete> athletes = new ArrayList<Athlete>();
	
	@ManyToMany(mappedBy = "equipes")
	public List<JeuOlympique> jeuxOlympiques = new ArrayList<JeuOlympique>();

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
	 * Getter pour l'attribut team
	 * @return the team
	 */
	public String getTeam() {
		return team;
	}

	/**
	 * Setter pour l'attribut team
	 * @param team the team to set
	 */
	public void setTeam(String team) {
		this.team = team;
	}

	/**
	 * Getter pour l'attribut noc
	 * @return the noc
	 */
	public String getNoc() {
		return noc;
	}

	/**
	 * Setter pour l'attribut noc
	 * @param noc the noc to set
	 */
	public void setNoc(String noc) {
		this.noc = noc;
	}

	/**
	 * Getter pour l'attribut pays
	 * @return the pays
	 */
	public Pays getPays() {
		return pays;
	}

	/**
	 * Setter pour l'attribut pays
	 * @param pays the pays to set
	 */
	public void setPays(Pays pays) {
		this.pays = pays;
	}

	/**
	 * Getter pour l'attribut athletes
	 * @return the athletes
	 */
	public List<Athlete> getAthletes() {
		return athletes;
	}

	/**
	 * Setter pour l'attribut athletes
	 * @param athletes the athletes to set
	 */
	public void setAthletes(List<Athlete> athletes) {
		this.athletes = athletes;
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
