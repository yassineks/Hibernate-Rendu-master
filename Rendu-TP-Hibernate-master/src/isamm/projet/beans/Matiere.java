package isamm.projet.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "matiere")
public class Matiere {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "libelle")
	private String libelle;		
	
	@ManyToMany
	@JoinTable(name = "ligneMatiereFiliere", joinColumns =	{ @JoinColumn(name = "id") }, inverseJoinColumns = { @JoinColumn(name = "idf") })
	private Set<Filiere> filiere = new HashSet<Filiere>(0);	
	
	@ManyToOne(targetEntity = isamm.projet.beans.Formateur.class)
	@JoinColumn(name = "idFormateur", nullable = false)
	private Formateur formateur ;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
	
	
	public Formateur getFormateur() {
		return formateur;
	}
	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}
	public Matiere(String code, String libelle) {
		super();
		this.code = code;
		this.libelle = libelle;
	}
	
	public Matiere() {

	}	
	
	
}
