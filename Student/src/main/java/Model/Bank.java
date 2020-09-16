package Model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@DiscriminatorValue("2")
public class Bank extends Tier {
	private String codbct;
	   private Boolean agcent;
	   private Boolean bqloc;
	
	
	public Boolean getAgcent() {
		return agcent;
	}
	public void setAgcent(Boolean agcent) {
		this.agcent = agcent;
	}
	public String getCodbct() {
		return codbct;
	}
	public void setCodbct(String codbct) {
		this.codbct = codbct;
	}
	public Boolean getBqloc() {
		return bqloc;
	}
	public void setBqloc(Boolean bqloc) {
		this.bqloc = bqloc;
	}
	@Override
	public String toString() {
		return "Bank [ codbct=" + codbct + ", agcent=" + agcent + ", bqloc=" + bqloc + "]";
	}
	
}
