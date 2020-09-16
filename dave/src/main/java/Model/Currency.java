package Model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="currency")
public class Currency {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idCurrency")
	   private int idCurrency;
	   private int decimall;
	   private String decimalName;
	   private String name;
	   private String translatedName;
	   private int quotity;
	   private Boolean certain;
	   private String internalName;
	   private String codeIso;
	   private String identifierC;
	public int getIdCurrency() {
		return idCurrency;
	}
	public void setIdCurrency(int idCurrency) {
		this.idCurrency = idCurrency;
	}
	public int getDecimall() {
		return decimall;
	}
	public void setDecimall(int decimall) {
		this.decimall = decimall;
	}
	public String getDecimalName() {
		return decimalName;
	}
	public void setDecimalName(String decimalName) {
		this.decimalName = decimalName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTranslatedName() {
		return translatedName;
	}
	public void setTranslatedName(String translatedName) {
		this.translatedName = translatedName;
	}
	public int getQuotity() {
		return quotity;
	}
	public void setQuotity(int quotity) {
		this.quotity = quotity;
	}
	public Boolean getCertain() {
		return certain;
	}
	public void setCertain(Boolean certain) {
		this.certain = certain;
	}
	public String getInternalName() {
		return internalName;
	}
	public void setInternalName(String internalName) {
		this.internalName = internalName;
	}
	public String getCodeIso() {
		return codeIso;
	}
	public void setCodeIso(String codeIso) {
		this.codeIso = codeIso;
	}
	public String getIdentifierC() {
		return identifierC;
	}
	public void setIdentifierC(String identifierC) {
		this.identifierC = identifierC;
	}
	   
	 
	   @OneToMany(fetch = FetchType.LAZY,mappedBy="currency", cascade = CascadeType.ALL)
	   @JsonIgnore
	     private Collection<AccountBalance> accountBalances ;
	  

}
