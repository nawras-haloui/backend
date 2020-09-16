

package DAO;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.RevolvingContract;
@Repository
public class RevolvingContract_DAO_Imp implements RevolvingContract_DAO {
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public boolean saveRevolvingContract(RevolvingContract country) {
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
	public List<RevolvingContract> getRevolvingContracts() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<RevolvingContract> query=currentSession.createQuery("from RevolvingContract", RevolvingContract.class);
		List<RevolvingContract> list=query.getResultList();
		return list;
	}
	
	@Override
	public boolean deleteRevolvingContract(RevolvingContract country) {
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
	public List<RevolvingContract> getRevolvingContractByID(RevolvingContract country) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<RevolvingContract> query=currentSession.createQuery("from RevolvingContract where idContract=:idContract", RevolvingContract.class);
		query.setParameter("idContract", country.getIdContract());
		List<RevolvingContract> list=query.getResultList();
		return list;
	}
	@Override
	public boolean updateRevolvingContract(RevolvingContract country) {
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
