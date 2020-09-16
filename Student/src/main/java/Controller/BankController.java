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
import Model.Bank;
import Model.BankList;
import Service.Bank_Service;
@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")
public class BankController {
	@Autowired
	private Bank_Service bankservice;

	@PostMapping("save-bank")
	public boolean saveBank(@RequestBody Bank bank) {
		 return bankservice.saveBank(bank);
	
	}
	
//	@GetMapping("banks-list")
//	public BankList allbanks() {
//		 return bankservice.getBanks();
//	}
	
	@GetMapping("banks-list")
	public List<Bank> allbanks(){
		return bankservice.getBanks();
	}
	@DeleteMapping("delete-bank/{idTier}")
	public boolean deleteBank(@PathVariable("idTier") int idTier,Bank bank) {
		bank.setIdTier(idTier);
		return bankservice.deleteBank(bank);
	}

	@GetMapping("bank/{idTier}")
	public List<Bank> allbankByID(@PathVariable("idTier") int idTier,Bank tier) {
		 tier.setIdTier(idTier);
		 return bankservice.getBankByID(tier);
		
	}
	
	@PostMapping("update-bank/{idTier}")
	public boolean updateBank(@RequestBody Bank bank,@PathVariable("idTier") int idTier) {
		bank.setIdTier(idTier);
		return bankservice.updateBank(bank);
	}


}
