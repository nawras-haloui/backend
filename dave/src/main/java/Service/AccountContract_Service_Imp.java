

package Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import DAO.AccountContract_DAO;
import Model.AccountContract;
@Service
@Transactional
public class AccountContract_Service_Imp implements AccountContract_Service{
	@Autowired
	private AccountContract_DAO persondao;
	
	@Override
	public boolean saveAccountContract(AccountContract person) {
		return persondao.saveAccountContract(person);
	}

	@Override
	public List<AccountContract> getAccountContracts() {
		return persondao.getAccountContracts();
	}

	@Override
	public boolean deleteAccountContract(AccountContract person) {
		return persondao.deleteAccountContract(person);
	}

	@Override
	public List<AccountContract> getAccountContractByID(AccountContract person) {
		return persondao.getAccountContractByID(person);
	}

	@Override
	public boolean updateAccountContract(AccountContract person) {
		return persondao.updateAccountContract(person);
	}



}


 
	