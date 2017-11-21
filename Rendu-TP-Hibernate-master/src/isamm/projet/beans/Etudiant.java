package isamm.projet.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "etudiant")
@PrimaryKeyJoinColumn(name = "idEtudiant")
public class Etudiant extends Personne{
	@Column(name = "cne")
	private String cne;
	
	@ManyToOne(targetEntity = isamm.projet.beans.Filiere.class)
	@JoinColumn(name = "idf", nullable = false)
	private Filiere filiere;
	

	public String getCne() {
		return cne;
	}

	public void setCne(String cne) {
		this.cne = cne;
	}

	public Etudiant() {
		super();
	}

	public Etudiant(String cne, Filiere filiere) {
		super();
		this.cne = cne;
		this.filiere = filiere;
	}


	
	

}
