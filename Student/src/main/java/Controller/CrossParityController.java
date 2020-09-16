

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
import Model.CrossParity;

import Service.CrossParity_Service;
@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")
public class CrossParityController {
	@Autowired
	private CrossParity_Service personservice;
	
	@PostMapping("save-crossParity")
	public boolean saveCrossParity(@RequestBody CrossParity person) {
		 return personservice.saveCrossParity(person);
	
	}
	
	@GetMapping("crossParitys-list")
	public List<CrossParity> allcrossParitys() {
		 return personservice.getCrossParitys();
	}
	
	@DeleteMapping("delete-crossParity/{idCrossParity}")
	public boolean deleteCrossParity(@PathVariable("idCrossParity") int idTier,CrossParity person) {
		person.setIdCrossParity(idTier);
		return personservice.deleteCrossParity(person);
	}

	@GetMapping("crossParity/{idCrossParity}")
	public List<CrossParity> allcrossParityByID(@PathVariable("idCrossParity") int idTier,CrossParity tier) {
		 tier.setIdCrossParity(idTier);
		 return personservice.getCrossParityByID(tier);
		
	}
	
	@PostMapping("update-crossParity/{idCrossParity}")
	public boolean updateCrossParity(@RequestBody CrossParity person,@PathVariable("idCrossParity") int idTier) {
		person.setIdCrossParity(idTier);
		return personservice.updateCrossParity(person);
	}

}
