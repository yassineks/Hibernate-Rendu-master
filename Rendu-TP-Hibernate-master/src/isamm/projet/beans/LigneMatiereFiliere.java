package isamm.projet.beans;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Query;
import javax.persistence.Table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@Entity
@Table(name = "ligneMatiereFiliere")
public class LigneMatiereFiliere {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "masseHoraire")
	private int masseHoraire;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMasseHoraire() {
		return masseHoraire;
	}
	public void setMasseHoraire(int masseHoraire) {
		this.masseHoraire = masseHoraire;
	}
	public LigneMatiereFiliere(int masseHoraire) {
		super();
		this.masseHoraire = masseHoraire;
	}
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
