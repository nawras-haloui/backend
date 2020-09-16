
package Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import DAO.Contract_DAO;
import Model.Contract;
@Service
@Transactional
public class Contract_Service_Imp implements Contract_Service {
	@Autowired
	private Contract_DAO countrydao;

	@Override
	public boolean saveContract(Contract country) {
		return countrydao.saveContract(country);
	}

	@Override
	public List<Contract> getContracts() {
		return countrydao.getContracts();
	}

	
	@Override
	public boolean deleteContract(Contract country) {
		return countrydao.deleteContract(country);
	}

	@Override
	public List<Contract> getContractByID(Contract country) {
		return countrydao.getContractByID(country);
	}

	@Override
	public boolean updateContract(Contract country) {
		return countrydao.updateContract(country);
	}



}


 
	