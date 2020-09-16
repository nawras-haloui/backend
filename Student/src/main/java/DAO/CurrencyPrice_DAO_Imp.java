package DAO;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.CurrencyPrice;
@Repository
public class CurrencyPrice_DAO_Imp implements CurrencyPrice_DAO {
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public boolean saveCurrencyPrice(CurrencyPrice country) {
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
	public List<CurrencyPrice> getCurrencyPrices() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<CurrencyPrice> query=currentSession.createQuery("from CurrencyPrice", CurrencyPrice.class);
		List<CurrencyPrice> list=query.getResultList();
		return list;
	}
	
	@Override
	public boolean deleteCurrencyPrice(CurrencyPrice country) {
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
	public List<CurrencyPrice> getCurrencyPriceByID(CurrencyPrice country) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<CurrencyPrice> query=currentSession.createQuery("from CurrencyPrice where idCurrencyPrice=:idCurrencyPrice", CurrencyPrice.class);
		query.setParameter("idCptBank", country.getIdCurrencyPrice());
		List<CurrencyPrice> list=query.getResultList();
		return list;
	}
	@Override
	public boolean updateCurrencyPrice(CurrencyPrice country) {
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
