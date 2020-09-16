package Model;

import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="ugest")
public class Ugest {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idUgest")
	 private int idUgest;
	   private String libcou;
	   private String liblon;
	   private String identifier;
	   private String codBct;
	   private String codInternee;
	   private String fKKPerson;
//	   
//	   @ManyToOne
//	   @JoinColumn(name="id_Tier")
//		@JsonIgnore
//	   private Tier tier;
//	   
	

	public String getFKKPerson() {
		return fKKPerson;
	}

	public void setFKKPerson(String fKKPerson) {
		fKKPerson = fKKPerson;
	}

	public int getIdUgest() {
		return idUgest;
	}

	public void setIdUgest(int idUgest) {
		this.idUgest = idUgest;
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

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getCodBct() {
		return codBct;
	}

	public void setCodBct(String codBct) {
		this.codBct = codBct;
	}

	public String getCodInternee() {
		return codInternee;
	}

	public void setCodInternee(String codInternee) {
		this.codInternee = codInternee;
	}
//
//	public Tier getTier() {
//		return tier;
//	}
//
//	public void setTier(Tier tier) {
//		this.tier = tier;
//	}
  

}
