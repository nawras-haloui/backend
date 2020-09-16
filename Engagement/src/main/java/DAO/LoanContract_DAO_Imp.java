
package DAO;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.LoanContract;
@Repository
public class LoanContract_DAO_Imp implements LoanContract_DAO {
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public boolean saveLoanContract(LoanContract country) {
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
	public List<LoanContract> getLoanContracts() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<LoanContract> query=currentSession.createQuery("from LoanContract", LoanContract.class);
		List<LoanContract> list=query.getResultList();
		return list;
	}
	
	@Override
	public boolean deleteLoanContract(LoanContract country) {
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
	public List<LoanContract> getLoanContractByID(LoanContract country) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<LoanContract> query=currentSession.createQuery("from LoanContract where idContract=:idContract", LoanContract.class);
		query.setParameter("idContract", country.getIdContract());
		List<LoanContract> list=query.getResultList();
		return list;
	}
	@Override
	public boolean updateLoanContract(LoanContract country) {
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
