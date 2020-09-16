

package Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import DAO.LoanContract_DAO;
import Model.LoanContract;

@Service
@Transactional
public class LoanContract_Service_Imp implements LoanContract_Service{
	@Autowired
	private LoanContract_DAO persondao;
	
	@Override
	public boolean saveLoanContract(LoanContract person) {
		return persondao.saveLoanContract(person);
	}

	@Override
	public List<LoanContract> getLoanContracts() {
		return persondao.getLoanContracts();
	}

	@Override
	public boolean deleteLoanContract(LoanContract person) {
		return persondao.deleteLoanContract(person);
	}

	@Override
	public List<LoanContract> getLoanContractByID(LoanContract person) {
		return persondao.getLoanContractByID(person);
	}

	@Override
	public boolean updateLoanContract(LoanContract person) {
		return persondao.updateLoanContract(person);
	}



}


 
	