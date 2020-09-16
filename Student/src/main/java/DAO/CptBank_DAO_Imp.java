package DAO;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.Country;
import Model.CptBank;
import Model.CptBankList;
@Repository
public class CptBank_DAO_Imp implements CptBank_DAO {
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public boolean saveCptBank(CptBank country) {
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
	public CptBankList getCptBankks() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<CptBank> query=currentSession.createQuery("from CptBank", CptBank.class);
		List<CptBank> list=query.getResultList();
		CptBankList cptBankList=new CptBankList();
		cptBankList.setCptBanks(list);
		return cptBankList;
	}
	@Override
	public List<CptBank> getCptBanks() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<CptBank> query=currentSession.createQuery("from CptBank", CptBank.class);
		List<CptBank> list=query.getResultList();
		return list;
	}
	@Override
	public boolean deleteCptBank(CptBank country) {
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
	public List<CptBank> getCptBankByID(CptBank country) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<CptBank> query=currentSession.createQuery("from CptBank where idCptBank=:idCptBank", CptBank.class);
		query.setParameter("idCptBank", country.getIdCptBank());
		List<CptBank> list=query.getResultList();
		return list;
	}
	@Override
	public boolean updateCptBank(CptBank country) {
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
