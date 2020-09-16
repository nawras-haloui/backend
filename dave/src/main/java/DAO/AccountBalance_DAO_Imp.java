

package DAO;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.AccountBalance;
@Repository
public class AccountBalance_DAO_Imp implements AccountBalance_DAO {
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public boolean saveAccountBalance(AccountBalance country) {
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
	public List<AccountBalance> getAccountBalances() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<AccountBalance> query=currentSession.createQuery("from AccountBalance", AccountBalance.class);
		List<AccountBalance> list=query.getResultList();
		return list;
	}
	
	@Override
	public boolean deleteAccountBalance(AccountBalance country) {
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
	public List<AccountBalance> getAccountBalanceByID(AccountBalance country) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<AccountBalance> query=currentSession.createQuery("from AccountBalance where idAccountBalance=:idAccountBalance", AccountBalance.class);
		query.setParameter("idAccountBalance", country.getIdAccountBalance());
		List<AccountBalance> list=query.getResultList();
		return list;
	}
	@Override
	public boolean updateAccountBalance(AccountBalance country) {
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
