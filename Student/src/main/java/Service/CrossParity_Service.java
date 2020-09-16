
package Service;
import java.util.List;
import Model.CrossParity;
public interface CrossParity_Service {

	public boolean saveCrossParity(CrossParity cptBank);
	public List<CrossParity> getCrossParitys();
	public boolean deleteCrossParity(CrossParity cptBank);
	public List<CrossParity> getCrossParityByID(CrossParity cptBank);
	public boolean updateCrossParity(CrossParity cptBank);
}
