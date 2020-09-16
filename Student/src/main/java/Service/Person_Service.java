package Service;
import java.util.List;
import Model.Person;
public interface Person_Service {


	public boolean savePerson(Person person);
	public List<Person> getPersons();
	public boolean deletePerson(Person person);
	public List<Person> getPersonByID(Person person);
	public boolean updatePerson(Person person);
}
