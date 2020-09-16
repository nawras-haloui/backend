package Model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="crossParity")
public class CrossParity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idCrossParity")
	   private int idCrossParity;
	   private long decimall;
	   private long quotityy;
	   
	   @OneToMany(mappedBy="crossParity", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	   @JsonIgnore
	     private Collection<Currency> currencys ;

	public int getIdCrossParity() {
		return idCrossParity;
	}

	public void setIdCrossParity(int idCrossParity) {
		this.idCrossParity = idCrossParity;
	}

	public long getDecimall() {
		return decimall;
	}

	public void setDecimall(long decimall) {
		this.decimall = decimall;
	}

	public long getQuotityy() {
		return quotityy;
	}

	public void setQuotityy(long quotityy) {
		this.quotityy = quotityy;
	}

	public Collection<Currency> getCurrencys() {
		return currencys;
	}

	public void setCurrencys(Collection<Currency> currencys) {
		this.currencys = currencys;
	}
	   
}
