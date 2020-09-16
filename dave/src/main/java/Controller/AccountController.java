
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

import Model.Account;
import Model.Bank;
import Model.BankList;
import Model.CptBank;
import Model.CptBankList;
import Service.Account_Service;
@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")
public class AccountController {
	@Autowired
	private Account_Service countryservice;
	
	@Autowired
	@LoadBalanced
	private RestTemplate restTemplate;
	

	@GetMapping("bankks-list")
	public BankList allbanks() {
		BankList BankList=restTemplate.getForObject("http://referentiel-service/api/banks-list", BankList.class);
		return BankList;
	}
	
	
	
	@GetMapping("cpts-list")
	public CptBankList getCptBanks() {
		CptBankList cptBankList=restTemplate.getForObject("http://referentiel-service/api/cptBankks-list", CptBankList.class);
		return cptBankList;
	}
	@PostMapping("save-cptBank")
	public boolean saveCptBank(@RequestBody CptBank person) {
		Boolean cptBank=restTemplate.getForObject("http://referentiel-service/api/save-cptBank", Boolean.class);
		return cptBank;
	
	}
	@PostMapping("save-account")
	public boolean saveAccount(@RequestBody Account country) {
		 return countryservice.saveAccount(country);
	
	}
	
	@GetMapping("accounts-list")
	public List<Account> allaccounts() {
		 return countryservice.getAccounts();
	}
	
	
	@DeleteMapping("delete-account/{idAccount}")
	public boolean deleteAccount(@PathVariable("idAccount")int id,Account country) {
		country.setIdAccount(id);
		return countryservice.deleteAccount(country);
	}
	@GetMapping("account/{idAccount}")
	public List<Account> allaccountByID(@PathVariable("idAccount") int idCountry,Account country) {
		 country.setIdAccount(idCountry);
		 return countryservice.getAccountByID(country);
	
	}
	
	@PostMapping("update-account/{idAccount}")
	public boolean updateAccount(@RequestBody Account country,@PathVariable("idAccount") int idCountry) {
		country.setIdAccount(idCountry);
		return countryservice.updateAccount(country);
	}


}

