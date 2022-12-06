package utils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entites.Athlete;
import entites.Epreuve;
import entites.Equipe;
import entites.JeuOlympique;
import entites.Matiere;
import entites.Medaille;
import entites.Pays;
import entites.Saison;
import entites.Sexe;
import entites.Sport;

public class ApplicationJpa {

	public static void main(String[] args) throws IOException {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa_jo");
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = em.getTransaction();

//		// Lecture fichier liste des sports
//		Path pathSport = Paths.get("C:\\Users\\annez\\Documents\\JO_CSV\\liste_des_sports.csv");
//		List<String> lignesSport = Files.readAllLines(pathSport, StandardCharsets.UTF_8);
//
//		// supression de la première ligne avec les titres
//		lignesSport.remove(0);
//		List<Sport> listSport = new ArrayList<Sport>();
//
//		for (String lecture : lignesSport) {
//			transaction.begin();
//			String[] split = lecture.split(";");
//
//			String libelleEN = split[0];
//
//			String libelleFR = split[1];
//
//			Sport sport = new Sport();
//			sport.setLibelleEN(libelleEN);
//			sport.setLibelleFR(libelleFR);
//
//			listSport.add(sport);
//			em.persist(sport);
//			transaction.commit();
//
//		}
//
//		// Lecture fichier liste des sports
//		Path pathEpreuve = Paths.get("C:\\Users\\annez\\Documents\\JO_CSV\\liste_des_epreuves.csv");
//		List<String> lignesEpreuve = Files.readAllLines(pathEpreuve, StandardCharsets.UTF_8);
//
//		// supression de la première ligne avec les titres
//		lignesSport.remove(0);
//		List<Epreuve> listEpreuve = new ArrayList<Epreuve>();
//
//		for (String lecture : lignesEpreuve) {
//			transaction.begin();
//			String[] split = lecture.split(";");
//
//			String eventEN = split[0];
//
//			String eventFR = split[1];
//
//			Epreuve epreuve = new Epreuve();
//			epreuve.setEventEN(eventEN);
//			epreuve.setEventFR(eventFR);
//
//			listEpreuve.add(epreuve);
//			em.persist(epreuve);
//			transaction.commit();
//
//		}
//
//		// Lecture fichier liste des pays
//		Path pathPays = Paths.get("C:\\Users\\annez\\Documents\\JO_CSV\\wikipedia_iso_country_codes.csv");
//		List<String> lignesPays = Files.readAllLines(pathPays, StandardCharsets.UTF_8);
//
//		// supression de la première ligne avec les titres
//		lignesPays.remove(0);
//		List<Pays> listPays = new ArrayList<Pays>();
//
//		for (String lecture : lignesPays) {
//			transaction.begin();
//			String[] split = lecture.split(";");
//
//			String cioCode = split[0];
//
//			String nomFR = split[1];
//
//			String nomEN = split[2];
//
//			String codeIsoA3 = split[3];
//
//			String obsolete = split[4];
//
//			Pays pays = new Pays();
//			pays.setCioCode(cioCode);
//			pays.setNomFR(nomFR);
//			pays.setNomEN(nomEN);
//			pays.setCodeIsoA3(codeIsoA3);
//			pays.setObsolete(obsolete);
//
//			listPays.add(pays);
//			em.persist(pays);
//			transaction.commit();
//		}

		// Lecture fichier liste des sports
		Path pathAthlete = Paths.get("C:\\Users\\annez\\Documents\\JO_CSV\\athlete_epreuves.csv");
		List<String> lignesAthlete = Files.readAllLines(pathAthlete, StandardCharsets.UTF_8);

		// supression de la première ligne avec les titres
		lignesAthlete.remove(0);
		List<Athlete> listAthlete = new ArrayList<Athlete>();
		List<Equipe> listEquipe = new ArrayList<Equipe>();
		List<JeuOlympique> listJeuOlympique = new ArrayList<JeuOlympique>();
		List<Medaille> listMedaille = new ArrayList<Medaille>();

		for (String lecture : lignesAthlete) {
			transaction.begin();
			String[] split = lecture.split(";");
			
//			int id = Integer.parseInt(split[0]);
//
//			String name = split[1];
//
//			String sex = split[2];
//			
//			String ageString = split[3];
//			
//			String heightString = split[4];
//			
//			String weightString = split[5];
//			
//
//			Athlete athlete = new Athlete();
//			athlete.setId(id);
//			athlete.setName(name);
//			
//			if (sex.equals("F")) {
//				athlete.setSex(Sexe.F);
//			}
//			
//			else if (sex.equals("M")) {
//				athlete.setSex(Sexe.M);
//			}
//			
//			//---------------------------
//			
//			if (ageString.equals("NA")) {
//				athlete.setAge(0);
//			}
//			
//			else {
//				int age = Integer.parseInt(ageString);
//				athlete.setAge(age);
//			}
//			
//			//---------------------------
//			
//			if (heightString.equals("NA")) {
//				athlete.setHeight(0);
//			}
//			
//			else {
//				int height = Integer.parseInt(heightString);
//				athlete.setHeight(height);
//			}
//			
//			//---------------------------
//			
//			if (weightString.equals("NA")) {
//				athlete.setWeight(0);
//			}
//			
//			else {
//				int weight = Integer.parseInt(weightString);
//				athlete.setWeight(weight);
//			}
//			
//			listAthlete.add(athlete);
//			em.persist(athlete);
			
			//--------------------------------------------------
			
			String team = split[6];
			
			String NOC = split[7];
			
			Equipe equipe = new Equipe();
			equipe.setTeam(team);
			equipe.setNoc(NOC);
			
			listEquipe.add(equipe);
			em.persist(equipe);
			
			//--------------------------------------------------
			
			int year = Integer.parseInt(split[9]);
			
			String season = split[10];
			
			String city = split[11];
			
			JeuOlympique jeuOlympique = new JeuOlympique();
			jeuOlympique.setYear(year);
			
			if (season.equals("Summer")) {
				jeuOlympique.setSeason(Saison.SUMMER);
			}
			
			else if (season.equals("Winter")) {
				jeuOlympique.setSeason(Saison.WINTER);
			}
			
			jeuOlympique.setCity(city);
			
			listJeuOlympique.add(jeuOlympique);
			em.persist(jeuOlympique);
			
			//--------------------------------------------------
			
			String medal = split[14];
			
			Medaille medaille = new Medaille();

			if (medal.equals("Bronze")) {
				medaille.setMedal(Matiere.BRONZE);
			}
			
			else if (medal.equals("Silver")) {
				medaille.setMedal(Matiere.SILVER);
			}
			
			else if (medal.equals("Gold")) {
				medaille.setMedal(Matiere.GOLD);
			}
			
			else {
				medaille.setMedal(null);
			}
			
			listMedaille.add(medaille);
			em.persist(medaille);
			
			transaction.commit();

		}

	}

}
