package DAO;

import java.util.List;

import Model.Account;

public interface Account_DAO {
	public boolean saveAccount(Account country);
	public List<Account> getAccounts();
	public boolean deleteAccount(Account country);
	public List<Account> getAccountByID(Account country);
	public boolean updateAccount(Account country);
}