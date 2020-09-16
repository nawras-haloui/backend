package Service;
import java.util.List;
import Model.Currency;
import Model.CurrencyList;
public interface Currency_Service {

	public boolean saveCurrency(Currency currency);
	public List<Currency> getCurrencys();
    public CurrencyList getCurrencyys();
	public boolean deleteCurrency(Currency currency);
	public List<Currency> getCurrencyByID(Currency currency);
	public boolean updateCurrency(Currency currency);
}
