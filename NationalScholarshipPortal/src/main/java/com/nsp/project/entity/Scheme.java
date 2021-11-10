package com.nsp.project.entity;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Scheme")
public class Scheme {
	
	@Id
	private Long schemeId;
	
	private String schemeName;
	
	private LocalDate lastDateToApply;
	
	private int amount ;
	
	
	
	@ManyToMany(fetch = FetchType.EAGER , cascade =CascadeType.ALL)
	@JoinTable(name ="Student",	joinColumns={@JoinColumn(name="studentId")},
			inverseJoinColumns={@JoinColumn(name="schemeId")})
	Set<Scheme> scheme;


	public Set<Scheme> getScheme() {
		return scheme;
	}


	public void setScheme(Set<Scheme> scheme) {
		this.scheme = scheme;
	}


	public Long getSchemeId() {
		return schemeId;
	}


	public void setSchemeId(Long schemeId) {
		this.schemeId = schemeId;
	}


	public String getSchemeName() {
		return schemeName;
	}


	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}


	public LocalDate getLastDateToApply() {
		return lastDateToApply;
	}


	public void setLastDateToApply(LocalDate lastDateToApply) {
		this.lastDateToApply = lastDateToApply;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}

	
	
}
