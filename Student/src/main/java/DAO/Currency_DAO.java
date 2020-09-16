
package DAO;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import Model.Currency;
import Model.CurrencyList;
public interface Currency_DAO {
	public boolean saveCurrency(Currency currency);
	public List<Currency> getCurrencys();
	public CurrencyList allcurrencyys();
		
	public boolean deleteCurrency(Currency currency);
	public List<Currency> getCurrencyByID(Currency currency);
	public boolean updateCurrency(Currency currency);
}
