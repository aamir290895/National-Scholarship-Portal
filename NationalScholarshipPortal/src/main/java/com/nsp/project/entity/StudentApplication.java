package com.nsp.project.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name ="Student Application")
public class StudentApplication {
	
	@Id
	@Column(name = "Student Id")
	private int studentId;
	
	@Column(name = "Scheme Id")
	private int schemeId;
	
	@Column(name = "Religion")
	private String religion;
	
	
	
	@Column(name = "Community")
	private String Community;
	
	@Column(name = "Father's Name")
	private String fathersName;
	
	
	@Column(name = "Mother's Name")
	private String mothersName;
	
	@Column (name = "Income")
	private Long income;
	
	@Column (name = "Course")
	private String course;
	
	@Column(name = "10th percentage")
	private String intermediatePercentage;
	
	
	@Column(name = "12th Percentage")
	private String postIntermediatePercentage;
	
	@Column(name ="Disability")
	private boolean disability;
	
	@Column(name ="Applied Date")
	private LocalDate appliedDate;
	
	@Column(name = "Status")
	private String status;
	
	@Column(name = "Institute Accepted Date")
	private LocalDate instituteAcceptedDate;
	
	
	
	@Column(name = "State Accepted Date")
	private LocalDate stateAcceptedDate;
	
	@Column(name = "Ministry Accepted Date")
	private LocalDate ministryAcceptedDate;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getSchemeId() {
		return schemeId;
	}

	public void setSchemeId(int schemeId) {
		this.schemeId = schemeId;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getCommunity() {
		return Community;
	}

	public void setCommunity(String community) {
		Community = community;
	}

	public String getFathersName() {
		return fathersName;
	}

	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}

	public String getMothersName() {
		return mothersName;
	}

	public void setMothersName(String mothersName) {
		this.mothersName = mothersName;
	}

	public Long getIncome() {
		return income;
	}

	public void setIncome(Long income) {
		this.income = income;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getIntermediatePercentage() {
		return intermediatePercentage;
	}

	public void setIntermediatePercentage(String intermediatePercentage) {
		this.intermediatePercentage = intermediatePercentage;
	}

	public String getPostIntermediatePercentage() {
		return postIntermediatePercentage;
	}

	public void setPostIntermediatePercentage(String postIntermediatePercentage) {
		this.postIntermediatePercentage = postIntermediatePercentage;
	}

	public boolean isDisability() {
		return disability;
	}

	public void setDisability(boolean disability) {
		this.disability = disability;
	}

	public LocalDate getAppliedDate() {
		return appliedDate;
	}

	public void setAppliedDate(LocalDate appliedDate) {
		this.appliedDate = appliedDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getInstituteAcceptedDate() {
		return instituteAcceptedDate;
	}

	public void setInstituteAcceptedDate(LocalDate instituteAcceptedDate) {
		this.instituteAcceptedDate = instituteAcceptedDate;
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
	
	

}
