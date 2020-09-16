

package Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import DAO.RevolvingContract_DAO_Imp;
import Model.RevolvingContract;

@Service
@Transactional
public class RevolvingContract_Service_Imp implements RevolvingContract_Service{
	@Autowired
	private RevolvingContract_DAO_Imp persondao;
	
	@Override
	public boolean saveRevolvingContract(RevolvingContract person) {
		return persondao.saveRevolvingContract(person);
	}

	@Override
	public List<RevolvingContract> getRevolvingContracts() {
		return persondao.getRevolvingContracts();
	}

	@Override
	public boolean deleteRevolvingContract(RevolvingContract person) {
		return persondao.deleteRevolvingContract(person);
	}

	@Override
	public List<RevolvingContract> getRevolvingContractByID(RevolvingContract person) {
		return persondao.getRevolvingContractByID(person);
	}

	@Override
	public boolean updateRevolvingContract(RevolvingContract person) {
		return persondao.updateRevolvingContract(person);
	}



}


 
	