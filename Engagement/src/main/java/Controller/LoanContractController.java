
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
import Model.LoanContract;
import Service.LoanContract_Service;
@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")
public class LoanContractController {
	@Autowired
	private LoanContract_Service countryservice;

	@PostMapping("save-loanContract")
	public boolean saveLoanContract(@RequestBody LoanContract country) {
		 return countryservice.saveLoanContract(country);
	
	}
	
	@GetMapping("loanContracts-list")
	public List<LoanContract> allloanContracts() {
		 return countryservice.getLoanContracts();
	}
	
	
	@DeleteMapping("delete-loanContract/{idContract}")
	public boolean deleteLoanContract(@PathVariable("idContract")int id,LoanContract country) {
		country.setIdContract(id);
		return countryservice.deleteLoanContract(country);
	}
	@GetMapping("loanContract/{idContract}")
	public List<LoanContract> allloanContractByID(@PathVariable("idContract") int idCountry,LoanContract country) {
		 country.setIdContract(idCountry);
		 return countryservice.getLoanContractByID(country);
	
	}
	
	@PostMapping("update-loanContract/{idContract}")
	public boolean updateLoanContract(@RequestBody LoanContract country,@PathVariable("idContract") int idCountry) {
		country.setIdContract(idCountry);
		return countryservice.updateLoanContract(country);
	}


}
