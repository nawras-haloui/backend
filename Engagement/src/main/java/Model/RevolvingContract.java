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
@DiscriminatorValue("RevolvingContract")

public class RevolvingContract extends CommitmentContract {
	private Date startDate;
	   private String contractStatus;

	private Date endDate;
    private long lastLoanPK;
    private long lastEventPk;
    private double apport;
    private long soldeDave;
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	
	public long getLastLoanPK() {
		return lastLoanPK;
	}
	public void setLastLoanPK(long lastLoanPK) {
		this.lastLoanPK = lastLoanPK;
	}
	public long getLastEventPk() {
		return lastEventPk;
	}
	public void setLastEventPk(long lastEventPk) {
		this.lastEventPk = lastEventPk;
	}
	public double getApport() {
		return apport;
	}
	public void setApport(double apport) {
		this.apport = apport;
	}
	public long getSoldeDave() {
		return soldeDave;
	}
	public void setSoldeDave(long soldeDave) {
		this.soldeDave = soldeDave;
	}
	public String getContractStatus() {
		return contractStatus;
	}
	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}
    
    

}
