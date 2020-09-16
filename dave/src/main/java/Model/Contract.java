package Model;
import java.sql.Date;

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
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="contract")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="contract_type")
public  abstract class Contract{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idContract")
	private int idContract;
	   private ContractStatus contractStatus;
	   private String reference;
	   private Boolean renevable;
	   private Date startDate ;
	   private Date endDate ;

	   private Boolean active;
	   private Boolean close;
	   private Boolean lastMomentDate;
	   private String conventionInformation;
	   private String migState;
	   private String strc;
	
	   
	 



	public int getIdContract() {
		return idContract;
	}



	public void setIdContract(int idContract) {
		this.idContract = idContract;
	}



	public String getReference() {
		return reference;
	}



	public void setReference(String reference) {
		this.reference = reference;
	}



	public Boolean getRenevable() {
		return renevable;
	}



	public void setRenevable(Boolean renevable) {
		this.renevable = renevable;
	}



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



	public Boolean getActive() {
		return active;
	}



	public void setActive(Boolean active) {
		this.active = active;
	}



	public Boolean getClose() {
		return close;
	}



	public void setClose(Boolean close) {
		this.close = close;
	}



	public Boolean getLastMomentDate() {
		return lastMomentDate;
	}



	public void setLastMomentDate(Boolean lastMomentDate) {
		this.lastMomentDate = lastMomentDate;
	}



	public String getConventionInformation() {
		return conventionInformation;
	}



	public void setConventionInformation(String conventionInformation) {
		this.conventionInformation = conventionInformation;
	}



	public String getMigState() {
		return migState;
	}



	public void setMigState(String migState) {
		this.migState = migState;
	}



	public String getStrc() {
		return strc;
	}



	public void setStrc(String strc) {
		this.strc = strc;
	}

 
	   

	   

}
