package Model;

import java.sql.Date;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="currencyPrice")
public class CurrencyPrice {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idCurrencyPrice")
	 private int idCurrencyPrice;
	   private Long buyPrice;
	   private Long sellPrice;
	   private Long price;
	   private Boolean statut;
	   private Long fourchette;
	   private String commen;
	   private Long envoi;
	   private Date priceDate;
	   
	   @OneToMany(fetch = FetchType.LAZY,mappedBy="deviceAchat", cascade = CascadeType.ALL)
	   @JsonIgnore
	     private Collection<Currency> deviceAchats ;
	   
	   @OneToMany(fetch = FetchType.LAZY,mappedBy="deviceVente", cascade = CascadeType.ALL)
	   @JsonIgnore
	     private Collection<Currency> deviceVentes ;
	   
	  
	public int getIdCurrencyPrice() {
		return idCurrencyPrice;
	}
	public void setIdCurrencyPrice(int idCurrencyPrice) {
		this.idCurrencyPrice = idCurrencyPrice;
	}
	public Long getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(Long buyPrice) {
		this.buyPrice = buyPrice;
	}
	public Long getSellPrice() {
		return sellPrice;
	}
	public void setSellPrice(Long sellPrice) {
		this.sellPrice = sellPrice;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public Boolean getStatut() {
		return statut;
	}
	public void setStatut(Boolean statut) {
		this.statut = statut;
	}
	public Long getFourchette() {
		return fourchette;
	}
	public void setFourchette(Long fourchette) {
		this.fourchette = fourchette;
	}
	public String getCommen() {
		return commen;
	}
	public void setCommen(String commen) {
		this.commen = commen;
	}
	public Long getEnvoi() {
		return envoi;
	}
	public void setEnvoi(Long envoi) {
		this.envoi = envoi;
	}
	public Date getPriceDate() {
		return priceDate;
	}
	public void setPriceDate(Date priceDate) {
		this.priceDate = priceDate;
	}
	public Collection<Currency> getDeviceAchats() {
		return deviceAchats;
	}
	public void setDeviceAchats(Collection<Currency> deviceAchats) {
		this.deviceAchats = deviceAchats;
	}
	
	   
}
