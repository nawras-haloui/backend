package Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;




@Entity
@Table(name="contact")
public class Contact {
	@Id
	@SequenceGenerator(initialValue=1, name="address_seq", sequenceName="address_sequence")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="address_seq")
	@Column(name="idContact")
	private int idContact;
	   private String phone;
	   private String mobile;
	   private String fax;
	   private String email;
	   private String zipCode;
	   private String country;
	   private String freeText;
	   private String contactFunction;
	   private String contactName;
	   private Langue langage;
	   private String formulePolitesse;
	   private String translatedAddress;
//	   
//	   @OneToOne(mappedBy = "contact", cascade = CascadeType.ALL,
//	              fetch = FetchType.LAZY, optional = false)
//	    private Tier tier;
//	   
	   
	public int getIdContact() {
		return idContact;
	}
	public void setIdContact(int idContact) {
		this.idContact = idContact;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFreeText() {
		return freeText;
	}
	public void setFreeText(String freeText) {
		this.freeText = freeText;
	}
	public String getContactFunction() {
		return contactFunction;
	}
	public void setContactFunction(String contactFunction) {
		this.contactFunction = contactFunction;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public Langue getLangage() {
		return langage;
	}
	public void setLangage(Langue langage) {
		this.langage = langage;
	}
	public String getFormulePolitesse() {
		return formulePolitesse;
	}
	public void setFormulePolitesse(String formulePolitesse) {
		this.formulePolitesse = formulePolitesse;
	}
	public String getTranslatedAddress() {
		return translatedAddress;
	}
	public void setTranslatedAddress(String translatedAddress) {
		this.translatedAddress = translatedAddress;
	}
//	public Tier getTier() {
//		return tier;
//	}
//	public void setTier(Tier tier) {
//		this.tier = tier;
//	}
	   

}
