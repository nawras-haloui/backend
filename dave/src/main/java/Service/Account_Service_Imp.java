

package Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import DAO.Account_DAO;
import Model.Account;
@Service
@Transactional

public class Account_Service_Imp implements Account_Service{
	@Autowired
	private Account_DAO persondao;
	
	@Override
	public boolean saveAccount(Account person) {
		return persondao.saveAccount(person);
	}

	@Override
	public List<Account> getAccounts() {
		return persondao.getAccounts();
	}

	@Override
	public boolean deleteAccount(Account person) {
		return persondao.deleteAccount(person);
	}

	@Override
	public List<Account> getAccountByID(Account person) {
		return persondao.getAccountByID(person);
	}

	@Override
	public boolean updateAccount(Account person) {
		return persondao.updateAccount(person);
	}



}


 
	