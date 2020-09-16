package Service;
import java.util.List;
import Model.Bank;
import Model.BankList;
public interface Bank_Service {
	public boolean saveBank(Bank bank);
//	public BankList getBanks();
	public List<Bank> getBanks();
	public boolean deleteBank(Bank bank);
	public List<Bank> getBankByID(Bank bank);
	public boolean updateBank(Bank bank);
}
