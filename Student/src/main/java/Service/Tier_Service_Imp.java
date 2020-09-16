package Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import DAO.Tier_DAO;
import Model.Tier;

@Service
@Transactional
public class Tier_Service_Imp implements Tier_Service {
	@Autowired
	private Tier_DAO persondao;
	
	@Override
	public boolean saveTier(Tier person) {
//		Tier tiernew=new Tier();
//		tiernew.setLastName(person.getLastName());
//		tiernew.setLibcou(person.getLibcou());
//		tiernew.setLiblon(person.getLiblon());
//		tiernew.setUgests(person.getUgests());
//        Tier savedTier = persondao.save(tiernew);
//        if ((persondao.findById(savedTier.getIdTier()).equals(null))) {
//        	return true;
//        	
//        }
        return false;


	}

	@Override
	public List<Tier> getTiers() {
		return persondao.getTiers();
	}

	@Override
	public boolean deleteTier(Tier person) {
		return persondao.deleteTier(person);
	}

	@Override
	public List<Tier> getTierByID(Tier person) {
		return persondao.getTierByID(person);
	}

	@Override
	public boolean updateTier(Tier person) {
		return persondao.updateTier(person);
	}

	

}


 
	