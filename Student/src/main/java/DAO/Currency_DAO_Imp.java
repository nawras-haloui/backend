package DAO;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import Model.Currency;
import Model.CurrencyList;
@Repository
public class Currency_DAO_Imp implements Currency_DAO {
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public boolean saveCurrency(Currency country) {
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
	public CurrencyList allcurrencyys() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Currency> query=currentSession.createQuery("from Currency", Currency.class);
		List<Currency> list=query.getResultList();
		CurrencyList BankList=new CurrencyList();
		BankList.setCurrencys(list);
     	return BankList;
	}
	@Override
	public List<Currency> getCurrencys() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Currency> query=currentSession.createQuery("from Currency", Currency.class);
		List<Currency> list=query.getResultList();
		return list;
	}
	
	@Override
	public boolean deleteCurrency(Currency country) {
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
	public List<Currency> getCurrencyByID(Currency country) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Currency> query=currentSession.createQuery("from Currency where idCurrency=:idCurrency", Currency.class);
		query.setParameter("idCptBank", country.getIdCurrency());
		List<Currency> list=query.getResultList();
		return list;
	}
	@Override
	public boolean updateCurrency(Currency country) {
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
