package DAO;

import java.util.List;

import Model.AccountBalance;

public interface AccountBalance_DAO {
	public boolean saveAccountBalance(AccountBalance country);
	public List<AccountBalance> getAccountBalances();
	public boolean deleteAccountBalance(AccountBalance country);
	public List<AccountBalance> getAccountBalanceByID(AccountBalance country);
	public boolean updateAccountBalance(AccountBalance country);
}
