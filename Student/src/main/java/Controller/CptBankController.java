
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

import Model.Country;
import Model.CptBank;
import Model.CptBankList;
import Service.CptBank_Service;
@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")
public class CptBankController {
	@Autowired
	private CptBank_Service personservice;
	
	@PostMapping("save-cptBank")
	public boolean saveCptBank(@RequestBody CptBank person) {
		 return personservice.saveCptBank(person);
	
	}
	
	/*@GetMapping("cptBanks-list")
	public List<CptBank> allcptBanks() {
		 return personservice.getCptBanks();
	}*/
	
	@GetMapping("cptBankks-list")
	public CptBankList  allcptBankks() {
		
		
		 return personservice.getCptBankks();
	}

	@GetMapping("cptBanks-list")
	public List<CptBank> allcptBanks() {
		 return personservice.getCptBanks();
	}
	
	@DeleteMapping("delete-cptBank/{idCptBank}")
	public boolean deleteCptBank(@PathVariable("idCptBank") int idTier,CptBank person) {
		person.setIdCptBank(idTier);
		return personservice.deleteCptBank(person);
	}

	@GetMapping("cptBank/{idCptBank}")
	public List<CptBank> allcptBankByID(@PathVariable("idCptBank") int idTier,CptBank tier) {
		 tier.setIdCptBank(idTier);
		 return personservice.getCptBankByID(tier);
		
	}
	
	@PostMapping("update-cptBank/{idCptBank}")
	public boolean updateCptBank(@RequestBody CptBank person,@PathVariable("idCptBank") int idTier) {
		person.setIdCptBank(idTier);
		return personservice.updateCptBank(person);
	}

}
