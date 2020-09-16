
package Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import DAO.CptBank_DAO;
import Model.CptBank;
import Model.CptBankList;
@Service
@Transactional
public class CptBank_Service_Imp implements CptBank_Service {
	@Autowired
	private CptBank_DAO countrydao;

	@Override
	public boolean saveCptBank(CptBank country) {
		return countrydao.saveCptBank(country);
	}

	@Override
	public CptBankList getCptBankks() {
		return countrydao.getCptBankks();
	}
	@Override
	public List<CptBank> getCptBanks() {
		return countrydao.getCptBanks();
	}
	
	@Override
	public boolean deleteCptBank(CptBank country) {
		return countrydao.deleteCptBank(country);
	}

	@Override
	public List<CptBank> getCptBankByID(CptBank country) {
		return countrydao.getCptBankByID(country);
	}

	@Override
	public boolean updateCptBank(CptBank country) {
		return countrydao.updateCptBank(country);
	}



}


 
	