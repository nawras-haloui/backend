
package DAO;

import java.util.List;
import Model.Contract;
public interface Contract_DAO {

	public boolean saveContract(Contract bank);
	public List<Contract> getContracts();
	public boolean deleteContract(Contract bank);
	public List<Contract> getContractByID(Contract bank);
	public boolean updateContract(Contract bank);
}
