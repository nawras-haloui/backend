package Model;

import java.sql.Date;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;




@Entity
public class Bank  {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	   private int idTier;
	   
	   private Boolean resident;
	   
	   private String firstName;
	   
	   private String lastName;
	   
	   private String gender;
	   
	   private Date birthday;
	   
	   private String libcou;
	   
	   private String liblon;
	   
	   private String identifierT;
	private String codbct;
	   private Boolean agcent;
	   private Boolean bqloc;
	public int getIdTier() {
		return idTier;
	}
	public void setIdTier(int idTier) {
		this.idTier = idTier;
	}
	public Boolean getResident() {
		return resident;
	}
	public void setResident(Boolean resident) {
		this.resident = resident;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getLibcou() {
		return libcou;
	}
	public void setLibcou(String libcou) {
		this.libcou = libcou;
	}
	public String getLiblon() {
		return liblon;
	}
	public void setLiblon(String liblon) {
		this.liblon = liblon;
	}
	public String getIdentifierT() {
		return identifierT;
	}
	public void setIdentifierT(String identifierT) {
		this.identifierT = identifierT;
	}
	public String getCodbct() {
		return codbct;
	}
	public void setCodbct(String codbct) {
		this.codbct = codbct;
	}
	public Boolean getAgcent() {
		return agcent;
	}
	public void setAgcent(Boolean agcent) {
		this.agcent = agcent;
	}
	public Boolean getBqloc() {
		return bqloc;
	}
	public void setBqloc(Boolean bqloc) {
		this.bqloc = bqloc;
	}
	   
	@OneToMany(fetch = FetchType.LAZY,mappedBy="bank", cascade = CascadeType.ALL)
	   @JsonIgnore
	     private Collection<Account> acounts ;
	
}
