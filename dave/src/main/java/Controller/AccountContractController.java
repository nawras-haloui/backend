
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
import Model.AccountContract;
import Service.AccountContract_Service;
@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")
public class AccountContractController {
	@Autowired
	private AccountContract_Service countryservice;

	@PostMapping("save-accountContract")
	public boolean saveAccountContract(@RequestBody AccountContract country) {
		 return countryservice.saveAccountContract(country);
	
	}
	
	@GetMapping("accountContracts-list")
	public List<AccountContract> allaccountContracts() {
		 return countryservice.getAccountContracts();
	}
	
	
	@DeleteMapping("delete-accountContract/{idContract}")
	public boolean deleteAccountContract(@PathVariable("idContract")int id,AccountContract country) {
		country.setIdContract(id);
		return countryservice.deleteAccountContract(country);
	}
	@GetMapping("accountContract/{idContract}")
	public List<AccountContract> allaccountContractByID(@PathVariable("idContract") int idCountry,AccountContract country) {
		 country.setIdContract(idCountry);
		 return countryservice.getAccountContractByID(country);
	
	}
	
	@PostMapping("update-accountContract/{idContract}")
	public boolean updateAccountContract(@RequestBody AccountContract country,@PathVariable("idContract") int idCountry) {
		country.setIdContract(idCountry);
		return countryservice.updateAccountContract(country);
	}


}
