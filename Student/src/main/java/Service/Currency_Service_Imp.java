
package Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import DAO.Currency_DAO;
import Model.Currency;
import Model.CurrencyList;
@Service
@Transactional
public class Currency_Service_Imp implements Currency_Service {
	@Autowired
	private Currency_DAO countrydao;

	@Override
	public boolean saveCurrency(Currency country) {
		return countrydao.saveCurrency(country);
	}

	@Override
	public List<Currency> getCurrencys() {
		return countrydao.getCurrencys();
	}
	@Override
public CurrencyList getCurrencyys() {
	return countrydao.allcurrencyys();
	}

	
	@Override
	public boolean deleteCurrency(Currency country) {
		return countrydao.deleteCurrency(country);
	}

	@Override
	public List<Currency> getCurrencyByID(Currency country) {
		return countrydao.getCurrencyByID(country);
	}

	@Override
	public boolean updateCurrency(Currency country) {
		return countrydao.updateCurrency(country);
	}



}


 
	