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
import Model.Tier;

import Service.Tier_Service;
@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")
public class TierController {
	@Autowired
	private Tier_Service personservice;
	
	@PostMapping("save-tier")
	public boolean saveTier(@RequestBody Tier person) {
		 return personservice.saveTier(person);
	
	}
	
	@GetMapping("tiers-list")
	public List<Tier> alltiers() {
		 return personservice.getTiers();
	}
	
	@DeleteMapping("delete-tier/{idTier}")
	public boolean deleteTier(@PathVariable("idTier") int idTier,Tier person) {
		person.setIdTier(idTier);
		return personservice.deleteTier(person);
	}

	@GetMapping("tier/{idTier}")
	public List<Tier> alltierByID(@PathVariable("idTier") int idTier,Tier tier) {
		 tier.setIdTier(idTier);
		 return personservice.getTierByID(tier);
		
	}
	
	@PostMapping("update-Tier/{idTier}")
	public boolean updateTier(@RequestBody Tier person,@PathVariable("idTier") int idTier) {
		person.setIdTier(idTier);
		return personservice.updateTier(person);
	}

}
