package DAO;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import Model.CrossParity;
@Repository
public class CrossParity_DAO_Imp implements CrossParity_DAO {
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public boolean saveCrossParity(CrossParity country) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(country);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<CrossParity> getCrossParitys() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<CrossParity> query=currentSession.createQuery("from CrossParity", CrossParity.class);
		List<CrossParity> list=query.getResultList();
		return list;
	}
	
	@Override
	public boolean deleteCrossParity(CrossParity country) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().delete(country);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	

	@Override
	public List<CrossParity> getCrossParityByID(CrossParity country) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<CrossParity> query=currentSession.createQuery("from CrossParity where idCrossParity=:idCrossParity", CrossParity.class);
		query.setParameter("idCrossParity", country.getIdCrossParity());
		List<CrossParity> list=query.getResultList();
		return list;
	}
	@Override
	public boolean updateCrossParity(CrossParity country) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().update(country);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
