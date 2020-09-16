

package DAO;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.Account;
@Repository
public class Account_DAO_Imp implements Account_DAO {
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public boolean saveAccount(Account country) {
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
	public List<Account> getAccounts() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Account> query=currentSession.createQuery("from Account", Account.class);
		List<Account> list=query.getResultList();
		return list;
	}
	
	@Override
	public boolean deleteAccount(Account country) {
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
	public List<Account> getAccountByID(Account country) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Account> query=currentSession.createQuery("from Account where idAccount=:idAccount", Account.class);
		query.setParameter("idAccount", country.getIdAccount());
		List<Account> list=query.getResultList();
		return list;
	}
	@Override
	public boolean updateAccount(Account country) {
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
