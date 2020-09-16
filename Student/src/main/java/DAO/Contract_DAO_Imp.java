
package DAO;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.Contract;
@Repository
public class Contract_DAO_Imp implements Contract_DAO {
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public boolean saveContract(Contract bank) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(bank);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Contract> getContracts() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Contract> query=currentSession.createQuery("from Contract", Contract.class);
		List<Contract> list=query.getResultList();
		return list;
	}
	
	@Override
	public boolean deleteContract(Contract bank) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().delete(bank);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	

	@Override
	public List<Contract> getContractByID(Contract bank) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Contract> query=currentSession.createQuery("from Contract where idContract=:idContract", Contract.class);
		query.setParameter("idContract", bank.getIdContract());
		List<Contract> list=query.getResultList();
		return list;
	}
	@Override
	public boolean updateContract(Contract bank) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().update(bank);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
