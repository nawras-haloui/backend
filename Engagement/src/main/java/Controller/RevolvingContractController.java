


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
import Model.RevolvingContract;

import Service.RevolvingContract_Service;
@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")
public class RevolvingContractController {
	@Autowired
	private RevolvingContract_Service countryservice;

	@PostMapping("save-revolvingContract")
	public boolean saveRevolvingContract(@RequestBody RevolvingContract country) {
		 return countryservice.saveRevolvingContract(country);
	
	}
	
	@GetMapping("revolvingContracts-list")
	public List<RevolvingContract> allrevolvingContracts() {
		 return countryservice.getRevolvingContracts();
	}
	
	
	@DeleteMapping("delete-revolvingContract/{idContract}")
	public boolean deleteLoanContract(@PathVariable("idContract")int id,RevolvingContract country) {
		country.setIdContract(id);
		return countryservice.deleteRevolvingContract(country);
	}
	@GetMapping("revolvingContract/{idContract}")
	public List<RevolvingContract> allrevolvingContractByID(@PathVariable("idContract") int idCountry,RevolvingContract country) {
		 country.setIdContract(idCountry);
		 return countryservice.getRevolvingContractByID(country);
	
	}
	
	@PostMapping("update-revolvingContract/{idContract}")
	public boolean updateLoanContract(@RequestBody RevolvingContract country,@PathVariable("idContract") int idCountry) {
		country.setIdContract(idCountry);
		return countryservice.updateRevolvingContract(country);
	}


}
