
package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import DAO.Person_DAO;
import DAO.Tier_DAO;
import DAO.Ugest_DAO;
import Model.Ugest;
import Model.Person;
import Model.Tier;


@Service
@Transactional
public class Ugest_Service_Imp implements Ugest_Service {
 
	@Autowired
	private Ugest_DAO ugestdao;
	@Autowired
	private Tier_DAO persondao;
//	@Autowired
//	private TierRepository tierRepository;;
//	private UgestRepository ugestRepository;;

//	
//	@Override
//	public Ugest addUgest(Ugest ugest) {
////		Tier dept = tierRepository.findById(ugest.getTier().getIdTier()).orElse(null);
////        if (null == dept) {
////            dept = new Tier();
////        }
////        dept.setBirthday(ugest.getTier().getBirthday());
////        dept.setContact(ugest.getTier().getContact());
////        dept.setCountry(ugest.getTier().getCountry());
////        dept.set
////        ugest.setTier(dept);
//        return ugestdao.save(ugest);
//		
//		
//	}
	@Override
	public boolean saveUgest(Ugest ugest) {
//     Tier dept = persondao.findById(ugest.getTier().getIdTier());
		return ugestdao.saveUgest(ugest);
	}

	@Override
	public List<Ugest> getUgests() {
		return ugestdao.getUgests();
	}

	@Override
	public boolean deleteUgest(Ugest student) {
		return ugestdao.deleteUgest(student);
	}

	@Override
	public List<Ugest> getUgestByID(Ugest student) {
		return ugestdao.getUgestByID(student);
	}

	@Override
	public boolean updateUgest(Ugest student) {
		return ugestdao.updateUgest(student);
	}

}
