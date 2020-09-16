package DAO;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.Ugest;
@Repository
public class Ugest_DAO_Imp implements Ugest_DAO {
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public boolean saveUgest(Ugest person) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(person);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
//	@Override
//	public Ugest save(Ugest person) {
//		
//		try {
//			sessionFactory.getCurrentSession().save(person);
//			return person;
//		} catch (Exception e) {
//			e.printStackTrace();
//			return null;
//		}
//	}
	
	

	@Override
	public List<Ugest> getUgests() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Ugest> query=currentSession.createQuery("from Ugest", Ugest.class);
		List<Ugest> list=query.getResultList();
		return list;
	}
	@Override
	public boolean deleteUgest(Ugest person) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().delete(person);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	

	@Override
	public List<Ugest> getUgestByID(Ugest person) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Ugest> query=currentSession.createQuery("from Ugest where idUgest=:idUgest", Ugest.class);
		query.setParameter("idUgest", person.getIdUgest());
		List<Ugest> list=query.getResultList();
		return list;
	}
	@Override
	public boolean updateUgest(Ugest person) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().update(person);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	@Override
	  public Ugest findById(Integer id) {
	        Session session = this.sessionFactory.getCurrentSession();
	        return session.get(Ugest.class, id);
	    }
}
