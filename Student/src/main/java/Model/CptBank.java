package Model;

import java.sql.Date;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="cptBank")
public class CptBank {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idCptBank")
	   private int idCptBank;
	   private Boolean cloture;
	   private Date dateCloture;
	   private String rib;
	   private String description;
	   private Long realBalance;
	   private String numCpt;
	   
	   
	   @OneToMany( targetEntity = Ugest.class, cascade=CascadeType.ALL)
	   @JoinColumn(name="cp_fk", referencedColumnName ="idCptBank" )
	   @JsonIgnore
	     private List<Ugest> ugests ;
	   
	   
	 @OneToMany(mappedBy="cptBankk")
	   @JsonIgnore
	     private Collection<Currency> currencys ;
	 

	public int getIdCptBank() {
		return idCptBank;
	}

	public void setIdCptBank(int idCptBank) {
		this.idCptBank = idCptBank;
	}

	public Boolean getCloture() {
		return cloture;
	}

	public void setCloture(Boolean cloture) {
		this.cloture = cloture;
	}

	public Date getDateCloture() {
		return dateCloture;
	}

	public void setDateCloture(Date dateCloture) {
		this.dateCloture = dateCloture;
	}

	public String getRib() {
		return rib;
	}

	public void setRib(String rib) {
		this.rib = rib;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getRealBalance() {
		return realBalance;
	}

	public void setRealBalance(Long realBalance) {
		this.realBalance = realBalance;
	}

	public String getNumCpt() {
		return numCpt;
	}

	public void setNumCpt(String numCpt) {
		this.numCpt = numCpt;
	}

	public List<Ugest> getUgests() {
		return ugests;
	}

	public void setUgests(List<Ugest> ugests) {
		this.ugests = ugests;
	}

	public Collection<Currency> getCurrencys() {
		return currencys;
	}

	public void setCurrencys(Collection<Currency> currencys) {
		this.currencys = currencys;
	}



	
}
