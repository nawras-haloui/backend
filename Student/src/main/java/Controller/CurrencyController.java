
package Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Model.Currency;
import Model.CurrencyList;
import Service.Currency_Service;
@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")
public class CurrencyController {
	@Autowired
	private Currency_Service personservice;

	@PostMapping("save-currency")
	public boolean saveCurrency(@RequestBody Currency person) {
		 return personservice.saveCurrency(person);
	
	}

	@GetMapping("currencyys-list")
	public CurrencyList allcurrencyys() {
	 return personservice.getCurrencyys();
	}
	
	@GetMapping("currencys-list")
	public List<Currency> allcurrencys() {
		 return personservice.getCurrencys();
	}
	
	@DeleteMapping("delete-currency/{idCurrency}")
	public boolean deleteCurrency(@PathVariable("idCurrency") int idTier,Currency person) {
		person.setIdCurrency(idTier);
		return personservice.deleteCurrency(person);
	}

	@GetMapping("currency/{idCurrency}")
	public List<Currency> allcurrencyByID(@PathVariable("idCurrency") int idTier,Currency tier) {
		 tier.setIdCurrency(idTier);
		 return personservice.getCurrencyByID(tier);
		
	}
	
	@PostMapping("update-currency/{idCurrency}")
	public boolean updateCurrency(@RequestBody Currency person,@PathVariable("idCurrency") int idTier) {
		person.setIdCurrency(idTier);
		return personservice.updateCurrency(person);
	}

}
