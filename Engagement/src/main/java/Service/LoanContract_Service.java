
package Service;
import java.util.List;
import Model.LoanContract;
public interface LoanContract_Service {


	public boolean saveLoanContract(LoanContract person);
	public List<LoanContract> getLoanContracts();
	public boolean deleteLoanContract(LoanContract person);
	public List<LoanContract> getLoanContractByID(LoanContract person);
	public boolean updateLoanContract(LoanContract person);
}
