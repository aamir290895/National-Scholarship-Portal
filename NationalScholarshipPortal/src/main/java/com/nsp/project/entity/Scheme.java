package com.nsp.project.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Scheme")
public class Scheme {
	
	@Id
	@Column(name ="Scheme Id")
	private Long schemeId;
	
	@Column(name ="Scheme Name")
	private String schemeName;
	
	@Column(name ="Last Date To Apply")  
	private LocalDate lastDateToApply;
	
	
	@Column(name ="Amount")
	private int amount ;


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
