
package Service;
import java.util.List;
import Model.AccountContract;
public interface AccountContract_Service {


	public boolean saveAccountContract(AccountContract person);
	public List<AccountContract> getAccountContracts();
	public boolean deleteAccountContract(AccountContract person);
	public List<AccountContract> getAccountContractByID(AccountContract person);
	public boolean updateAccountContract(AccountContract person);
}
