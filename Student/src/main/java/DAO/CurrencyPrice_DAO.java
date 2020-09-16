
package DAO;

import java.util.List;
import Model.CurrencyPrice;
public interface CurrencyPrice_DAO {
	public boolean saveCurrencyPrice(CurrencyPrice currency);
	public List<CurrencyPrice> getCurrencyPrices();
	public boolean deleteCurrencyPrice(CurrencyPrice currency);
	public List<CurrencyPrice> getCurrencyPriceByID(CurrencyPrice currency);
	public boolean updateCurrencyPrice(CurrencyPrice currency);
}
