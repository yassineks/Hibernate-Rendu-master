package isamm.projet.service;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import isamm.projet.beans.Etudiant;
import isamm.projet.beans.Filiere;
import isamm.projet.beans.Formateur;
import isamm.projet.beans.LigneMatiereFiliere;
import isamm.projet.beans.Matiere;


public class TestHibernate {
	public static void main(String[] args) {
	new TestHibernate().insertInfo();
	
	new FormateurService().getFormateur();

	
	}
	
	public void insertInfo(){
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory SF = con.buildSessionFactory();
		Session session = SF.openSession();
		Transaction TR = null;		
		
		Filiere f1 = new Filiere("IAII","Ingénierie des automatismes");
		Filiere f2 = new Filiere("IRT","Ingénierie des réseaux");
		Filiere f3 = new Filiere("IIR","Ingénierie informatique");		
		
		Matiere m1 = new Matiere("TPC","Techniques de programmation structurée");
		Matiere m2 = new Matiere("JB","Java de Base");
		Matiere m3 = new Matiere("AU","Administration Unix");
		Matiere m4 = new Matiere("Hibernate","Framework de persistance");
		Matiere m5 = new Matiere("POO","Programmation orientée objet");		

		HashSet ht = new HashSet();
		ht.add(m1);
		ht.add(m2);		
		Formateur fo1 = new Formateur("SELIMANI Yahiya", ht);		
		
		HashSet ht2 = new HashSet();
		ht2.add(m3);
		ht2.add(m4);		
		Formateur fo2 = new Formateur("SAFI Ilham", ht2);			
		
		Etudiant e1 = new Etudiant("22845676", f3);
		Etudiant e2 = new Etudiant("23845976", f3);
		Etudiant e3 = new Etudiant("22345476", f1);
		
		LigneMatiereFiliere l1 = new LigneMatiereFiliere(15);
		LigneMatiereFiliere l2 = new LigneMatiereFiliere(30);
		
		
		try{
			TR = session.beginTransaction();	
			
			session.save(m1);
			session.save(m2);
			session.save(m3);
			session.save(m4);
			session.save(m5);
			

			System.out.println("success");
			TR.commit();
			SF.close();
			session.close();
		}
		catch(Exception e){
			if(TR != null){
				TR.rollback();
			}
		}		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



