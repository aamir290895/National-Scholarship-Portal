package com.nsp.project.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="Institute")
public class InstituteApplication {
	
	@Id
	private int institudeCode;
	
	
	
	private String instituteName;
	
	private String city ;
	
	
	private String district;
	
	
	private String pinCode;
	
	private int  diseCode;
	
	private String universityName;
	
	private String password;
	
	
	private String principal;
	
	private Long telephone;
	
	private LocalDate applyDate;
	
	private String status;
	
	private LocalDate stateAcceptedDate;
	
	private LocalDate ministryAcceptedDate;
	
	
	
	@ManyToOne
	private StateNodalOfficer sno;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "studentId")
	List<Student> stuList ;
	
	
	


	public List<Student> getStuList() {
		return stuList;
	}

	public void setStuList(List<Student> stuList) {
		this.stuList = stuList;
	}

	public StateNodalOfficer getSno() {
		return sno;
	}

	public void setSno(StateNodalOfficer sno) {
		this.sno = sno;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public int getDiseCode() {
		return diseCode;
	}

	public void setDiseCode(int diseCode) {
		this.diseCode = diseCode;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPrincipal() {
		return principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public Long getTelephone() {
		return telephone;
	}

	public void setTelephone(Long telephone) {
		this.telephone = telephone;
	}

	public LocalDate getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(LocalDate applyDate) {
		this.applyDate = applyDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getStateAcceptedDate() {
		return stateAcceptedDate;
	}

	public void setStateAcceptedDate(LocalDate stateAcceptedDate) {
		this.stateAcceptedDate = stateAcceptedDate;
	}

	public LocalDate getMinistryAcceptedDate() {
		return ministryAcceptedDate;
	}

	public void setMinistryAcceptedDate(LocalDate ministryAcceptedDate) {
		this.ministryAcceptedDate = ministryAcceptedDate;
	}

	public int getInstitudeCode() {
		return institudeCode;
	}

	public void setInstitudeCode(int institudeCode) {
		this.institudeCode = institudeCode;
	}

	
	
	
	
	
	
	

}
