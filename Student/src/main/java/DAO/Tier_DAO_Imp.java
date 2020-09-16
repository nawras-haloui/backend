package DAO;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import Model.Tier;
@Repository
public class Tier_DAO_Imp implements Tier_DAO {
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public boolean saveTier(Tier person) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(person);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	@Override
	public Tier save(Tier person) {
		
		try {
			sessionFactory.getCurrentSession().save(person);
			return person;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	

	@Override
	public List<Tier> getTiers() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Tier> query=currentSession.createQuery("from Tier", Tier.class);
		List<Tier> list=query.getResultList();
		return list;
	}
	@Override
	public boolean deleteTier(Tier person) {
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
	public List<Tier> getTierByID(Tier person) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Tier> query=currentSession.createQuery("from Tier where idTier=:idTier", Tier.class);
		query.setParameter("idTier", person.getIdTier());
		List<Tier> list=query.getResultList();
		return list;
	}
	@Override
	public boolean updateTier(Tier person) {
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
	  public Tier findById(Integer id) {
	        Session session = this.sessionFactory.getCurrentSession();
	        return session.get(Tier.class, id);
	    }
}
