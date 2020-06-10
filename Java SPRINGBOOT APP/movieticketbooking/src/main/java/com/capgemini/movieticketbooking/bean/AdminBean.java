package com.capgemini.movieticketbooking.bean;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class AdminBean {

	@Id
	@Column
	private String adminId;
	@Column
	private String adminName;
	@Column
	private String adminPassword;
	@Column
	private LocalDate dateOfBirth;
	@Column
	private String adminContact;
	
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	
	public String getAdminContact() {
		return adminContact;
	}
	public void setAdminContact(String adminContact) {
		this.adminContact = adminContact;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "AdminBean [adminId=" + adminId + ", adminName=" + adminName + ", adminPassword=" + adminPassword
				+ ", dateOfBirth=" + dateOfBirth + ", adminContact=" + adminContact + "]";
	}
	
	
	
	
	
}
