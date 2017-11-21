package isamm.projet.inter;

import java.util.List;

public interface IDao <T>{
	public boolean create (T obj);
	public List getAll();
	public int delete(int id);
	public boolean update(int id,T obj );
	public boolean getById(int id);
}
