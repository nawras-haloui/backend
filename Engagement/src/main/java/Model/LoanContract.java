
package Model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@DiscriminatorValue("LoanContract")

public class LoanContract  extends CommitmentContract {

	
	   private double progressionRate;
	   private Date dateFirstAllotment;
	   private Boolean isRescheduled;
	   private Boolean isRevolving;
	   private Boolean isConsoResult;
	   private Boolean AgreementDate;
	   private Date offerEmissionDate;
	   private Date offerExpiryDate;
	   private Boolean computeInsurance;
	   private String contractStatus;

	public Double getProgressionRate() {
		return progressionRate;
	}
	public void setProgressionRate(Double progressionRate) {
		this.progressionRate = progressionRate;
	}
	
	public Date getDateFirstAllotment() {
		return dateFirstAllotment;
	}
	public void setDateFirstAllotment(Date dateFirstAllotment) {
		this.dateFirstAllotment = dateFirstAllotment;
	}
	public Boolean getIsRescheduled() {
		return isRescheduled;
	}
	public void setIsRescheduled(Boolean isRescheduled) {
		this.isRescheduled = isRescheduled;
	}
	public Boolean getIsRevolving() {
		return isRevolving;
	}
	public void setIsRevolving(Boolean isRevolving) {
		this.isRevolving = isRevolving;
	}
	public Boolean getIsConsoResult() {
		return isConsoResult;
	}
	public void setIsConsoResult(Boolean isConsoResult) {
		this.isConsoResult = isConsoResult;
	}
	public Boolean getAgreementDate() {
		return AgreementDate;
	}
	public void setAgreementDate(Boolean agreementDate) {
		AgreementDate = agreementDate;
	}
	public Date getOfferEmissionDate() {
		return offerEmissionDate;
	}
	public void setOfferEmissionDate(Date offerEmissionDate) {
		this.offerEmissionDate = offerEmissionDate;
	}
	public Date getOfferExpiryDate() {
		return offerExpiryDate;
	}
	public void setOfferExpiryDate(Date offerExpiryDate) {
		this.offerExpiryDate = offerExpiryDate;
	}
	public Boolean getComputeInsurance() {
		return computeInsurance;
	}
	public void setComputeInsurance(Boolean computeInsurance) {
		this.computeInsurance = computeInsurance;
	}
	   


	
}