package com.capgemini.movieticketbooking.bean;

import java.util.List;

public class AdminResponse {

	private int statusCode;
	private String messesge;
	private String discription;
	private List<AdminBean> beans;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessesge() {
		return messesge;
	}
	public void setMessesge(String messesge) {
		this.messesge = messesge;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public List<AdminBean> getBeans() {
		return beans;
	}
	public void setBeans(List<AdminBean> beans) {
		this.beans = beans;
	}
	@Override
	public String toString() {
		return "AdminResponse [statusCode=" + statusCode + ", messesge=" + messesge + ", discription=" + discription
				+ ", beans=" + beans + "]";
	}
	
	
	
	
	
	

}
