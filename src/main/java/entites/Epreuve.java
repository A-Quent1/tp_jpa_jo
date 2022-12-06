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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="EPREUVE")
public class Epreuve {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	
	@Column(name = "EVENT_EN", length = 200, nullable= false)
	public String eventEN;
	
	@Column(name = "EVENT_FR", length = 200, nullable= false)
	public String eventFR;
	
	@OneToMany(mappedBy = "epreuve")
	public List<Medaille> medailles = new ArrayList<Medaille>();
	
	@ManyToOne
	@JoinColumn(name = "ID_SPORT")
	public Sport sport;
	
	@ManyToMany(mappedBy = "epreuves")
	public List<Athlete> athletes = new ArrayList<Athlete>();
	
	@ManyToMany(mappedBy = "epreuves")
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
	 * Getter pour l'attribut eventEN
	 * @return the eventEN
	 */
	public String getEventEN() {
		return eventEN;
	}

	/**
	 * Setter pour l'attribut eventEN
	 * @param eventEN the eventEN to set
	 */
	public void setEventEN(String eventEN) {
		this.eventEN = eventEN;
	}

	/**
	 * Getter pour l'attribut eventFR
	 * @return the eventFR
	 */
	public String getEventFR() {
		return eventFR;
	}

	/**
	 * Setter pour l'attribut eventFR
	 * @param eventFR the eventFR to set
	 */
	public void setEventFR(String eventFR) {
		this.eventFR = eventFR;
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
	 * Getter pour l'attribut sport
	 * @return the sport
	 */
	public Sport getSport() {
		return sport;
	}

	/**
	 * Setter pour l'attribut sport
	 * @param sport the sport to set
	 */
	public void setSport(Sport sport) {
		this.sport = sport;
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
	
}
