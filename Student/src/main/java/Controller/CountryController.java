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
import Service.Country_Service;
@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")
public class CountryController {
	@Autowired
	private Country_Service countryservice;

	@PostMapping("save-country")
	public boolean saveCountry(@RequestBody Country country) {
		 return countryservice.saveCountry(country);
	
	}
	
	@GetMapping("countrys-list")
	public List<Country> allcountrys() {
		 return countryservice.getCountrys();
	}
	
	
	@DeleteMapping("delete-country/{identifier}")
	public boolean deleteCountry(@PathVariable("identifier")int id,Country country) {
		country.setIdentifier(id);
		return countryservice.deleteCountry(country);
	}
	@GetMapping("country/{identifier}")
	public List<Country> allcountryByID(@PathVariable("identifier") int idCountry,Country country) {
		 country.setIdentifier(idCountry);
		 return countryservice.getCountryByID(country);
	
	}
	
	@PostMapping("update-country/{identifier}")
	public boolean updateCountry(@RequestBody Country country,@PathVariable("identifier") int idCountry) {
		country.setIdentifier(idCountry);
		return countryservice.updateCountry(country);
	}


}
