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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "filiere")
public class Filiere {	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idf;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "libelle")
	private String libelle;	
	
	@OneToMany(mappedBy = "filiere")
	private Set<Etudiant> etudiant = new HashSet<Etudiant>(0);	
	
	@ManyToMany	
	@JoinTable(name = "ligneMatiereFiliere", joinColumns =	{ @JoinColumn(name = "idf") }, inverseJoinColumns = { @JoinColumn(name = "id") })
	private Set<Matiere> matiere = new HashSet<Matiere>(0);
	
	
	public int getId() {
		return idf;
	}
	public void setId(int id) {
		this.idf = id;
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

	
	
	
	
	public Filiere(String code, String libelle) {
		super();
		this.code = code;
		this.libelle = libelle;
	}
	

	
	
	
	
	
	

}
