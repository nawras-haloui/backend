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
@Table(name="country")
public class Country {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="identifier")
	   private int identifier;
	  
	   private String areaPhoneCode;
	 
	   private String name;
	 
	   private String numericCode;
	  
	   private String tanslatedName;
	 
	   private String nationality;
	   
	   private boolean taxConvention;
	   
	   private Boolean embargo;
	   
	   @OneToMany(mappedBy="country", cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	   @JsonIgnore
	   private Collection<Tier> tiers ;

	   
	   
	   
	   
	   
	
	public int getIdentifier() {
		return identifier;
	}

	public void setIdentifier(int identifier) {
		this.identifier = identifier;
	}

	public String getAreaPhoneCode() {
		return areaPhoneCode;
	}

	public void setAreaPhoneCode(String areaPhoneCode) {
		this.areaPhoneCode = areaPhoneCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumericCode() {
		return numericCode;
	}

	public void setNumericCode(String numericCode) {
		this.numericCode = numericCode;
	}

	public String getTanslatedName() {
		return tanslatedName;
	}

	public void setTanslatedName(String tanslatedName) {
		this.tanslatedName = tanslatedName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public boolean isTaxConvention() {
		return taxConvention;
	}

	
	public void setTaxConvention(boolean taxConvention) {
		this.taxConvention = taxConvention;
	}

	public Boolean getEmbargo() {
		return embargo;
	}

	public void setEmbargo(Boolean embargo) {
		this.embargo = embargo;
	}

	public Collection<Tier> getTiers() {
		return tiers;
	}

	public void setTiers(Collection<Tier> tiers) {
		this.tiers = tiers;
	}
	   
}
