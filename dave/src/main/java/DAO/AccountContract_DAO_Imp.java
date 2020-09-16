
package DAO;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.AccountContract;
@Repository
public class AccountContract_DAO_Imp implements AccountContract_DAO {
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public boolean saveAccountContract(AccountContract country) {
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
	public List<AccountContract> getAccountContracts() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<AccountContract> query=currentSession.createQuery("from AccountContract", AccountContract.class);
		List<AccountContract> list=query.getResultList();
		return list;
	}
	
	@Override
	public boolean deleteAccountContract(AccountContract country) {
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
	public List<AccountContract> getAccountContractByID(AccountContract country) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<AccountContract> query=currentSession.createQuery("from AccountContract where idContract=:idContract", AccountContract.class);
		query.setParameter("idContract", country.getIdContract());
		List<AccountContract> list=query.getResultList();
		return list;
	}
	@Override
	public boolean updateAccountContract(AccountContract country) {
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
