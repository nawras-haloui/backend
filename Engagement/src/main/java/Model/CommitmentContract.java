
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
@Table(name= "commitmentContract")

public abstract class CommitmentContract extends Contract{



	   private String durationUnit;

	   private Double incurredInternelRisk;
	   private Double incurredLegalRisk;
	   private Double supportedRisk;
	   private String ribAccount;
	   private Double affectedAmount;
	   private Double accountingAvailableAmount;
	   private Boolean possibleClassChange;
	   private Date dateSituation;
	   private  Boolean manuelReclassement;
	
	
	

	
	public String getDurationUnit() {
		return durationUnit;
	}
	public void setDurationUnit(String durationUnit) {
		this.durationUnit = durationUnit;
	}
	public Double getIncurredInternelRisk() {
		return incurredInternelRisk;
	}
	public void setIncurredInternelRisk(Double incurredInternelRisk) {
		this.incurredInternelRisk = incurredInternelRisk;
	}
	public Double getIncurredLegalRisk() {
		return incurredLegalRisk;
	}
	public void setIncurredLegalRisk(Double incurredLegalRisk) {
		this.incurredLegalRisk = incurredLegalRisk;
	}
	public Double getSupportedRisk() {
		return supportedRisk;
	}
	public void setSupportedRisk(Double supportedRisk) {
		this.supportedRisk = supportedRisk;
	}
	public String getRibAccount() {
		return ribAccount;
	}
	public void setRibAccount(String ribAccount) {
		this.ribAccount = ribAccount;
	}
	public Double getAffectedAmount() {
		return affectedAmount;
	}
	public void setAffectedAmount(Double affectedAmount) {
		this.affectedAmount = affectedAmount;
	}
	public Double getAccountingAvailableAmount() {
		return accountingAvailableAmount;
	}
	public void setAccountingAvailableAmount(Double accountingAvailableAmount) {
		this.accountingAvailableAmount = accountingAvailableAmount;
	}
	public Boolean getPossibleClassChange() {
		return possibleClassChange;
	}
	public void setPossibleClassChange(Boolean possibleClassChange) {
		this.possibleClassChange = possibleClassChange;
	}
	public Date getDateSituation() {
		return dateSituation;
	}
	public void setDateSituation(Date dateSituation) {
		this.dateSituation = dateSituation;
	}
	public Boolean getManuelReclassement() {
		return manuelReclassement;
	}
	public void setManuelReclassement(Boolean manuelReclassement) {
		this.manuelReclassement = manuelReclassement;
	}
	   
	   

}
