package Model;

import java.sql.Date;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="tier")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="tier_type", 
  discriminatorType = DiscriminatorType.INTEGER)
public  class  Tier {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idTier")
	   private int idTier;
	   
	   private Boolean resident;
	   
	   private String firstName;
	   
	   private String lastName;
	   
	   private String gender;
	   
	   private Date birthday;
	   
	   private String libcou;
	   
	   private String liblon;
	   
	   private String identifierT;
	   
	 
	   
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

	public void setIdentifierT(String identifier) {
		this.identifierT = identifier;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
//
//	
//	public Contact getContact() {
//		return contact;
//	}
//
//	public void setContact(Contact contact) {
//		this.contact = contact;
//	}
//
//	public Collection<Ugest> getUgests() {
//		return ugests;
//	}
//
//	public void setUgests(Collection<Ugest> ugests) {
//		this.ugests = ugests;
//	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="identifier")
	@JsonIgnore
	   private Country country;
	   
//	@OneToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "idContaaaaaaaaaaaact",referencedColumnName="idContact")
//	@JsonIgnore
//    private Contact contact;
//	@OneToMany(targetEntity = Ugest.class)
//	@JsonIgnore
//	private Collection<Ugest> ugests ;
////	   
//	   @OneToMany(fetch = FetchType.LAZY,mappedBy="tier", cascade = CascadeType.ALL)
//	   @JsonIgnore
//	     private Collection<Contract> contracts ;
	   
	 
}
