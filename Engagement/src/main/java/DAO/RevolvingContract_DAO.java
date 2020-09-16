package DAO;

import java.util.List;

import Model.RevolvingContract;

public interface RevolvingContract_DAO {
	public boolean saveRevolvingContract(RevolvingContract country);
	public List<RevolvingContract> getRevolvingContracts();
	public boolean deleteRevolvingContract(RevolvingContract country);
	public List<RevolvingContract> getRevolvingContractByID(RevolvingContract country);
	public boolean updateRevolvingContract(RevolvingContract country);
}
