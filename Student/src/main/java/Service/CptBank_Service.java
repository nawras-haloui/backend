package Service;
import java.util.List;
import Model.CptBank;
import Model.CptBankList;
public interface CptBank_Service {


	public boolean saveCptBank(CptBank cptBank);
	public CptBankList getCptBankks();
	public List<CptBank> getCptBanks();

	public boolean deleteCptBank(CptBank cptBank);
	public List<CptBank> getCptBankByID(CptBank cptBank);
	public boolean updateCptBank(CptBank cptBank);
}
