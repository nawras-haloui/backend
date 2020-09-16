package DAO;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.Bank;
import Model.BankList;
import Model.CptBank;
import Model.CptBankList;
import Model.Person;
@Repository
public class Bank_DAO_Imp implements Bank_DAO {
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public boolean saveBank(Bank bank) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(bank);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

//	@Override
//	public BankList getBanks() {
//		Session currentSession = sessionFactory.getCurrentSession();
//		Query<Bank> query=currentSession.createQuery("from Bank", Bank.class);
//		List<Bank> list=query.getResultList();
//		BankList BankList=new BankList();
//		BankList.setBanks(list);
//		return BankList;
//	}
//	
	@Override
	public List<Bank> getBanks() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Bank> query=currentSession.createQuery("from Bank", Bank.class);
		List<Bank> list=query.getResultList();
		return list;
	}
	@Override
	public boolean deleteBank(Bank bank) {
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
	public List<Bank> getBankByID(Bank bank) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Bank> query=currentSession.createQuery("from Tier where idTier=:idTier", Bank.class);
		query.setParameter("idTier", bank.getIdTier());
		List<Bank> list=query.getResultList();
		return list;
	}
	@Override
	public boolean updateBank(Bank bank) {
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
