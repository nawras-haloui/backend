
package Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import DAO.CurrencyPrice_DAO;

import Model.CurrencyPrice;
@Service
@Transactional
public class CurrencyPrice_Service_Imp implements CurrencyPrice_Service {
	@Autowired
	private CurrencyPrice_DAO countrydao;

	@Override
	public boolean saveCurrencyPrice(CurrencyPrice country) {
		return countrydao.saveCurrencyPrice(country);
	}

	@Override
	public List<CurrencyPrice> getCurrencyPrices() {
		return countrydao.getCurrencyPrices();
	}

	
	@Override
	public boolean deleteCurrencyPrice(CurrencyPrice country) {
		return countrydao.deleteCurrencyPrice(country);
	}

	@Override
	public List<CurrencyPrice> getCurrencyPriceByID(CurrencyPrice country) {
		return countrydao.getCurrencyPriceByID(country);
	}

	@Override
	public boolean updateCurrencyPrice(CurrencyPrice country) {
		return countrydao.updateCurrencyPrice(country);
	}



}


 
	