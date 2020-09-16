
package DAO;

import java.util.List;

import Model.AccountContract;
public interface AccountContract_DAO {
	public boolean saveAccountContract(AccountContract country);
	public List<AccountContract> getAccountContracts();
	public boolean deleteAccountContract(AccountContract country);
	public List<AccountContract> getAccountContractByID(AccountContract country);
	public boolean updateAccountContract(AccountContract country);
}
