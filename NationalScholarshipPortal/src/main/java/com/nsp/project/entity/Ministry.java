package com.nsp.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Ministry")
public class Ministry {
	
	@Id
	@Column(name ="State Name")
	private String stateName;
	
	@Column(name = "Password")
	private String password;
	
	@Column(name ="Officer Name")
	private String officerName;
	
	@Column(name ="Mobile Number")
	private Long mobileNumber;
	
	
	@Column (name ="Email")
	private String email;


	public String getStateName() {
		return stateName;
	}


	public void setStateName(String stateName) {
		this.stateName = stateName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getOfficerName() {
		return officerName;
	}


	public void setOfficerName(String officerName) {
		this.officerName = officerName;
	}


	public Long getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
