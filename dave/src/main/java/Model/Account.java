
package Model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity

public class Account   {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idAccount")
	private int idAccount;
	private String rib;
	private Boolean active;
	private Boolean isInternalRib;
    private Date activationDate;
    private String productCode;
    private String productCategoryCode;
	public String getRib() {
		return rib;
	}
	
	public int getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(int idAccount) {
		this.idAccount = idAccount;
	}

	public AccountContract getAccountContract() {
		return accountContract;
	}

	public void setAccountContract(AccountContract accountContract) {
		this.accountContract = accountContract;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public void setRib(String rib) {
		this.rib = rib;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public Boolean getIsInternalRib() {
		return isInternalRib;
	}
	public void setIsInternalRib(Boolean isInternalRib) {
		this.isInternalRib = isInternalRib;
	}
	public Date getActivationDate() {
		return activationDate;
	}
	public void setActivationDate(Date activationDate) {
		this.activationDate = activationDate;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCategoryCode() {
		return productCategoryCode;
	}
	public void setProductCategoryCode(String productCategoryCode) {
		this.productCategoryCode = productCategoryCode;
	}
    

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idAccountContract")
	@JsonIgnore
	   private AccountContract accountContract;
	
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idTier")
	@JsonIgnore
	   private Bank bank;
	
	   

	
}