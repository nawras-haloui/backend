package Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import DAO.Person_DAO;
import Model.Person;
import Model.Tier;

@Service
@Transactional
public class Person_Service_Imp implements Person_Service {
	@Autowired
	private Person_DAO persondao;
	
	@Override
	public boolean savePerson(Person person) {
//		Person tiernew=new Person();
//		tiernew.setLastName(person.getLastName());
//		tiernew.setLibcou(person.getLibcou());
//		tiernew.setLiblon(person.getLiblon());
//		tiernew.setUgests(person.getUgests());
//        Tier savedTier = persondao.savePerson(tiernew);
//        if ((persondao.findById(savedTier.getIdTier()).equals(null))) {
//        	return false;
//        	
//        }
        return true;	}

	@Override
	public List<Person> getPersons() {
		return persondao.getPersons();
	}

	@Override
	public boolean deletePerson(Person person) {
		return persondao.deletePerson(person);
	}

	@Override
	public List<Person> getPersonByID(Person person) {
		return persondao.getPersonByID(person);
	}

	@Override
	public boolean updatePerson(Person person) {
		return persondao.updatePerson(person);
	}

	

}


 
	