package DAO;

import java.util.List;

import Model.Tier;
public interface Tier_DAO  {
	public boolean saveTier(Tier person);
	public List<Tier> getTiers();
	public boolean deleteTier(Tier person);
	public List<Tier> getTierByID(Tier person);
	public boolean updateTier(Tier person);
    public Tier findById(Integer id);
	public Tier save(Tier person);


}
