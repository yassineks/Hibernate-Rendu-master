package isamm.projet.service;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import isamm.projet.beans.Formateur;
import isamm.projet.beans.Matiere;
import isamm.projet.inter.IDao;

public class FormateurService implements IDao {

	@Override
	public boolean create(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean update(int id, Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getById(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	public void getFormateur(){
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory SF = con.buildSessionFactory();
		Session session = SF.openSession();
		Transaction TR = session.beginTransaction();
		try {		
			Query q = session.createQuery(" select  from Formateur ");			
			
			List l = q.getResultList();
			Iterator i = l.iterator();
			while (i.hasNext()) {
			System.out.println(((Formateur) i.next()).getMatricule());
			
			System.out.println("success");
			}		
		} finally {
			session.close();
		}
		SF.close();
		}
	

}
