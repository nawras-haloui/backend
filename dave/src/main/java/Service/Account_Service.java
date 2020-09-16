
package Service;
import java.util.List;
import Model.Account;
public interface Account_Service {


	public boolean saveAccount(Account person);
	public List<Account> getAccounts();
	public boolean deleteAccount(Account person);
	public List<Account> getAccountByID(Account person);
	public boolean updateAccount(Account person);
}
