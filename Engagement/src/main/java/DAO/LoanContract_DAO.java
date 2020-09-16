
package DAO;

import java.util.List;

import Model.LoanContract;
public interface LoanContract_DAO {
	public boolean saveLoanContract(LoanContract country);
	public List<LoanContract> getLoanContracts();
	public boolean deleteLoanContract(LoanContract country);
	public List<LoanContract> getLoanContractByID(LoanContract country);
	public boolean updateLoanContract(LoanContract country);
}
