package DAO;

import java.util.List;

import Model.Country;
public interface Country_DAO {
	public boolean saveCountry(Country country);
	public List<Country> getCountrys();
	public boolean deleteCountry(Country country);
	public List<Country> getCountryByID(Country country);
	public boolean updateCountry(Country country);
}
