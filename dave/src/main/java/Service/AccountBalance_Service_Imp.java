

package Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import DAO.AccountBalance_DAO_Imp;
import Model.AccountBalance;

@Service
@Transactional
public class AccountBalance_Service_Imp implements AccountBalance_Service{
	@Autowired
	private AccountBalance_DAO_Imp persondao;
	
	@Override
	public boolean saveAccountBalance(AccountBalance person) {
		return persondao.saveAccountBalance(person);
	}

	@Override
	public List<AccountBalance> getAccountBalances() {
		return persondao.getAccountBalances();
	}

	@Override
	public boolean deleteAccountBalance(AccountBalance person) {
		return persondao.deleteAccountBalance(person);
	}

	@Override
	public List<AccountBalance> getAccountBalanceByID(AccountBalance person) {
		return persondao.getAccountBalanceByID(person);
	}

	@Override
	public boolean updateAccountBalance(AccountBalance person) {
		return persondao.updateAccountBalance(person);
	}



}


 
	