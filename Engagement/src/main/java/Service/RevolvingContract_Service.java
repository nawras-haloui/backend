

package Service;
import java.util.List;
import Model.RevolvingContract;
public interface RevolvingContract_Service {

	public boolean saveRevolvingContract(RevolvingContract person);
	public List<RevolvingContract> getRevolvingContracts();
	public boolean deleteRevolvingContract(RevolvingContract person);
	public List<RevolvingContract> getRevolvingContractByID(RevolvingContract person);
	public boolean updateRevolvingContract(RevolvingContract person);
}
