
package Model;

import java.sql.Date;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
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
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name= "accountContract")
@DiscriminatorValue("AccountContract")
public abstract class AccountContract extends Contract{

	
	   private Date closingDate;
	   private String accountNumber;
	   private String signatureType;
	   private Date activationDate;
	   private Date startDate;
	   private Boolean renewable;
	   private Boolean accountMig;
	   private Boolean isConfirmed;
	public Date getClosingDate() {
		return closingDate;
	}
	public void setClosingDate(Date closingDate) {
		this.closingDate = closingDate;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getSignatureType() {
		return signatureType;
	}
	public void setSignatureType(String signatureType) {
		this.signatureType = signatureType;
	}
	public Date getActivationDate() {
		return activationDate;
	}
	public void setActivationDate(Date activationDate) {
		this.activationDate = activationDate;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Boolean getRenewable() {
		return renewable;
	}
	public void setRenewable(Boolean renewable) {
		this.renewable = renewable;
	}
	public Boolean getAccountMig() {
		return accountMig;
	}
	public void setAccountMig(Boolean accountMig) {
		this.accountMig = accountMig;
	}
	public Boolean getIsConfirmed() {
		return isConfirmed;
	}
	public void setIsConfirmed(Boolean isConfirmed) {
		this.isConfirmed = isConfirmed;
	}
	 @OneToMany(fetch = FetchType.LAZY,mappedBy="accountContract", cascade = CascadeType.ALL)
	   @JsonIgnore
	     private Collection<Account> acounts ;
	 @OneToMany(fetch = FetchType.LAZY,mappedBy="accountContractt", cascade = CascadeType.ALL)
	   @JsonIgnore
	     private Collection<AccountBalance> acountBalances ;



}
