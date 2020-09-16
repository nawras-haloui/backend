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
import Model.Person;
import Service.Person_Service;
@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")
public class PersonController {
	@Autowired
	private Person_Service personservice;
	
	@PostMapping("save-person")
	public boolean savePerson(@RequestBody Person person) {
		 return personservice.savePerson(person);
	
	}
	
	@GetMapping("persons-list")
	public List<Person> allpersons() {
		 return personservice.getPersons();
	}
	
	@DeleteMapping("delete-person/{idTier}")
	public boolean deletePerson(@PathVariable("idTier") int idTier,Person person) {
		person.setIdTier(idTier);
		return personservice.deletePerson(person);
	}

	@GetMapping("person/{idTier}")
	public List<Person> allpersonByID(@PathVariable("idTier") int idTier,Person tier) {
		 tier.setIdTier(idTier);
		 return personservice.getPersonByID(tier);
		
	}
	
	@PostMapping("update-person/{idTier}")
	public boolean updatePerson(@RequestBody Person person,@PathVariable("idTier") int idTier) {
		person.setIdTier(idTier);
		return personservice.updatePerson(person);
	}

}
