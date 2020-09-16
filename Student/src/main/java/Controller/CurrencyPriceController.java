
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
import Model.CurrencyPrice;

import Service.CurrencyPrice_Service;
@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")
public class CurrencyPriceController {
	@Autowired
	private CurrencyPrice_Service personservice;

	@PostMapping("save-currencyPrice")
	public boolean saveCurrencyPrice(@RequestBody CurrencyPrice person) {
		 return personservice.saveCurrencyPrice(person);
	
	}
	
	@GetMapping("currencyPrices-list")
	public List<CurrencyPrice> allcurrencyPrices() {
		 return personservice.getCurrencyPrices();
	}
	
	@DeleteMapping("delete-currencyPrice/{idCurrencyPrice}")
	public boolean deleteCurrencyPrice(@PathVariable("idCurrency") int idTier,CurrencyPrice person) {
		person.setIdCurrencyPrice(idTier);
		return personservice.deleteCurrencyPrice(person);
	}

	@GetMapping("currencyPrice/{idCurrencyPrice}")
	public List<CurrencyPrice> allcurrencyPriceByID(@PathVariable("idCurrencyPrice") int idTier,CurrencyPrice tier) {
		 tier.setIdCurrencyPrice(idTier);
		 return personservice.getCurrencyPriceByID(tier);
		
	}
	
	@PostMapping("update-currencyPrice/{idCurrencyPrice}")
	public boolean updateCurrencyPrice(@RequestBody CurrencyPrice person,@PathVariable("idCurrencyPrice") int idTier) {
		person.setIdCurrencyPrice(idTier);
		return personservice.updateCurrencyPrice(person);
	}

}
