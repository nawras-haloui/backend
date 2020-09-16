
package Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Model.Ugest;
import Service.Ugest_Service;
@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")
public class UgestController {
	@Autowired
	private Ugest_Service ugestservice;
	
	
	@PostMapping("save-ugest")
	public boolean saveUgest(@RequestBody Ugest person) {
		 return ugestservice.saveUgest(person);
	
	}
	
//	@PostMapping("add-ugest")
//	public boolean addUgest(@RequestBody Ugest ugest) {		
//		return ugestservice.addUgest(ugest);
//		
//
//	}
//	
//	
	
	
	@GetMapping("ugests-list")
	public List<Ugest> allugests() {
		 return ugestservice.getUgests();
	}
	
	@DeleteMapping("delete-ugest/{idUgest}")
	public boolean deleteUgest(@PathVariable("idUgest") int idUgest,Ugest person) {
		person.setIdUgest(idUgest);
		return ugestservice.deleteUgest(person);
	}

	@GetMapping("ugest/{idUgest}")
	public List<Ugest> allugestByID(@PathVariable("idUgest") int idUgest,Ugest tier) {
		 tier.setIdUgest(idUgest);
		 return ugestservice.getUgestByID(tier);
		
	}
	
	@PostMapping("update-ugest/{idUgest}")
	public boolean updateUgest(@RequestBody Ugest person,@PathVariable("idUgest") int idTier) {
		person.setIdUgest(idTier);
		return ugestservice.updateUgest(person);
	}

}
