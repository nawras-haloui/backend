package Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import DAO.Country_DAO;
import Model.Country;
@Service
@Transactional
public class Country_Service_Imp implements Country_Service {
	@Autowired
	private Country_DAO countrydao;

	@Override
	public boolean saveCountry(Country country) {
		return countrydao.saveCountry(country);
	}

	@Override
	public List<Country> getCountrys() {
		return countrydao.getCountrys();
	}

	
	@Override
	public boolean deleteCountry(Country country) {
		return countrydao.deleteCountry(country);
	}

	@Override
	public List<Country> getCountryByID(Country country) {
		return countrydao.getCountryByID(country);
	}

	@Override
	public boolean updateCountry(Country country) {
		return countrydao.updateCountry(country);
	}



}


 
	