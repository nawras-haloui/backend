package DAO;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.Country;
@Repository
public class Country_DAO_Imp implements Country_DAO {
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public boolean saveCountry(Country country) {
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
	public List<Country> getCountrys() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Country> query=currentSession.createQuery("from Country", Country.class);
		List<Country> list=query.getResultList();
		return list;
	}
	
	@Override
	public boolean deleteCountry(Country country) {
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
	public List<Country> getCountryByID(Country country) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Country> query=currentSession.createQuery("from Country where identifier=:identifier", Country.class);
		query.setParameter("identifier", country.getIdentifier());
		List<Country> list=query.getResultList();
		return list;
	}
	@Override
	public boolean updateCountry(Country country) {
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
