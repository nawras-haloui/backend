


package Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import Model.AccountBalance;
import Model.BankList;
import Model.CurrencyList;
import Service.AccountBalance_Service;
@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")
public class AccountBalanceController {
	@Autowired
	private AccountBalance_Service countryservice;

	@Autowired
	@LoadBalanced
	private RestTemplate restTemplate;
	
	@PostMapping("save-accountBalance")
	public boolean saveAccountBalance(@RequestBody AccountBalance country) {
		 return countryservice.saveAccountBalance(country);
	
	}
	@GetMapping("currencyys-list")
	public CurrencyList allcurrencyys() {
		CurrencyList BankList=restTemplate.getForObject("http://referentiel-service/api/currencyys-list", CurrencyList.class);
		return BankList;
	}
	
	@GetMapping("accountBalances-list")
	public List<AccountBalance> allaccountBalances() {
		 return countryservice.getAccountBalances();
	}
	
	
	
	
	@DeleteMapping("delete-accountBalance/{idAccountBalance}")
	public boolean deleteAccountBalance(@PathVariable("idAccountBalance")int id,AccountBalance country) {
		country.setIdAccountBalance(id);
		return countryservice.deleteAccountBalance(country);
	}
	@GetMapping("accountBalance/{idAccountBalance}")
	public List<AccountBalance> allaccountBalanceByID(@PathVariable("idAccountBalance") int idCountry,AccountBalance country) {
		 country.setIdAccountBalance(idCountry);
		 return countryservice.getAccountBalanceByID(country);
	
	}
	
	@PostMapping("update-accountBalance/{idAccountBalance}")
	public boolean updateAccountBalance(@RequestBody AccountBalance country,@PathVariable("idAccountBalance") int idCountry) {
		country.setIdAccountBalance(idCountry);
		return countryservice.updateAccountBalance(country);
	}


}
