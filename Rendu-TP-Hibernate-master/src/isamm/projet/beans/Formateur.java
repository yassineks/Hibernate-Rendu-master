package isamm.projet.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "formateur")
@PrimaryKeyJoinColumn(name = "idFormateur")
public class Formateur extends Personne {

	@Column(name = "matricule")
	private String matricule;
	
	
	@OneToMany(mappedBy = "formateur")
	private Set<Matiere> matiere = new HashSet<Matiere>(0);	
	

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public Formateur() {
		super();
	}

	public Formateur(String matricule, Set<Matiere> matiere) {
		super();
		this.matricule = matricule;
		this.matiere = matiere;
	}
	
	


	
	
}
