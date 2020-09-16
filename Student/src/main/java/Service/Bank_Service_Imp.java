package Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import DAO.Bank_DAO;
import Model.Bank;
import Model.BankList;
@Service
@Transactional
public class Bank_Service_Imp implements Bank_Service {
	@Autowired
	private Bank_DAO bankdao;
	
	@Override
	public boolean saveBank(Bank bank) {
		return bankdao.saveBank(bank);
	}

//	@Override
//	public BankList getBanks() {
//		return bankdao.getBanks();
//	}
	
	
	@Override
	public List<Bank> getBanks(){
		return bankdao.getBanks(); 
	}
	
	@Override
	public boolean deleteBank(Bank bank) {
		return bankdao.deleteBank(bank);
	}

	@Override
	public List<Bank> getBankByID(Bank bank) {
		return bankdao.getBankByID(bank);
	}

	@Override
	public boolean updateBank(Bank bank) {
		return bankdao.updateBank(bank);
	}



}


 
	