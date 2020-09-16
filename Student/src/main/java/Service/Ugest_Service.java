
package Service;

import java.util.List;

import Model.Ugest;

public interface Ugest_Service {

//	public boolean addUgest(Ugest ugest);
	public boolean saveUgest(Ugest ugest);
	public List<Ugest> getUgests();
	public boolean deleteUgest(Ugest ugest);
	public List<Ugest> getUgestByID(Ugest ugest);
	public boolean updateUgest(Ugest ugest);
}
