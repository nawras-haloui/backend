
package DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.Ugest;

public interface Ugest_DAO  {
	public Ugest findById(Integer id);
	public boolean saveUgest(Ugest ugest);
	public List<Ugest> getUgests();
	public boolean deleteUgest(Ugest ugest);
	public List<Ugest> getUgestByID(Ugest ugest);
	public boolean updateUgest(Ugest ugest);
}
