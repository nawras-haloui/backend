

package Service;
import java.util.List;
import Model.AccountBalance;
public interface AccountBalance_Service {

	public boolean saveAccountBalance(AccountBalance person);
	public List<AccountBalance> getAccountBalances();
	public boolean deleteAccountBalance(AccountBalance person);
	public List<AccountBalance> getAccountBalanceByID(AccountBalance person);
	public boolean updateAccountBalance(AccountBalance person);
}
