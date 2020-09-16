

package Service;
import java.util.List;
import Model.Contract;
public interface Contract_Service {


	public boolean saveContract(Contract country);
	public List<Contract> getContracts();
	public boolean deleteContract(Contract country);
	public List<Contract> getContractByID(Contract country);
	public boolean updateContract(Contract country);
}
