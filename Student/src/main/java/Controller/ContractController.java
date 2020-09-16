
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
import Model.Contract;
import Service.Contract_Service;
@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")
public class ContractController {
	@Autowired
	private Contract_Service countryservice;

	@PostMapping("save-contract")
	public boolean saveContract(@RequestBody Contract country) {
		 return countryservice.saveContract(country);
	
	}
	
	@GetMapping("contracts-list")
	public List<Contract> allcontracts() {
		 return countryservice.getContracts();
	}
	
	
	@DeleteMapping("delete-contract/{idContract}")
	public boolean deleteContract(@PathVariable("idContract")int id,Contract country) {
		country.setIdContract(id);
		return countryservice.deleteContract(country);
	}
	@GetMapping("contract/{idContract}")
	public List<Contract> allcontractByID(@PathVariable("idContract") int idCountry,Contract country) {
		 country.setIdContract(idCountry);
		 return countryservice.getContractByID(country);
	
	}
	
	@PostMapping("update-contract/{idContract}")
	public boolean updateContract(@RequestBody Contract country,@PathVariable("idContract") int idCountry) {
		country.setIdContract(idCountry);
		return countryservice.updateContract(country);
	}


}
