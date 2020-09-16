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

public class AccountBalance{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idAccountBalance")
	private int idAccountBalance;
	private Date positionDate;
	private Date endDate;
	//ceci a changer par la suite par un type enum
	private String balanceType;
	private Long creditMvt;
	private Long debitMvt;
	private Long lockAmount;
	private Long overDraftAmount;
	private Long moratoireAmount;
	public Date getPositionDate() {
		return positionDate;
	}
	
	public int getIdAccountBalance() {
		return idAccountBalance;
	}

	public void setIdAccountBalance(int idAccountBalance) {
		this.idAccountBalance = idAccountBalance;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public AccountContract getAccountContractt() {
		return accountContractt;
	}

	public void setAccountContractt(AccountContract accountContractt) {
		this.accountContractt = accountContractt;
	}

	public void setPositionDate(Date positionDate) {
		this.positionDate = positionDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getBalanceType() {
		return balanceType;
	}
	public void setBalanceType(String balanceType) {
		this.balanceType = balanceType;
	}
	public Long getCreditMvt() {
		return creditMvt;
	}
	public void setCreditMvt(Long creditMvt) {
		this.creditMvt = creditMvt;
	}
	public Long getDebitMvt() {
		return debitMvt;
	}
	public void setDebitMvt(Long debitMvt) {
		this.debitMvt = debitMvt;
	}
	public Long getLockAmount() {
		return lockAmount;
	}
	public void setLockAmount(Long lockAmount) {
		this.lockAmount = lockAmount;
	}
	public Long getOverDraftAmount() {
		return overDraftAmount;
	}
	public void setOverDraftAmount(Long overDraftAmount) {
		this.overDraftAmount = overDraftAmount;
	}
	public Long getMoratoireAmount() {
		return moratoireAmount;
	}
	public void setMoratoireAmount(Long moratoireAmount) {
		this.moratoireAmount = moratoireAmount;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idCurrency")
	@JsonIgnore
	   private Currency currency;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idAccountContract")
	@JsonIgnore
	   private AccountContract accountContractt;
	
}
