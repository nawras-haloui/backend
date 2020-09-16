
package Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import DAO.CrossParity_DAO;
import Model.CrossParity;
@Service
@Transactional
public class CrossParity_Service_Imp implements CrossParity_Service {
	@Autowired
	private CrossParity_DAO countrydao;

	@Override
	public boolean saveCrossParity(CrossParity country) {
		return countrydao.saveCrossParity(country);
	}

	@Override
	public List<CrossParity> getCrossParitys() {
		return countrydao.getCrossParitys();
	}

	
	@Override
	public boolean deleteCrossParity(CrossParity country) {
		return countrydao.deleteCrossParity(country);
	}

	@Override
	public List<CrossParity> getCrossParityByID(CrossParity country) {
		return countrydao.getCrossParityByID(country);
	}

	@Override
	public boolean updateCrossParity(CrossParity country) {
		return countrydao.updateCrossParity(country);
	}



}


 
	