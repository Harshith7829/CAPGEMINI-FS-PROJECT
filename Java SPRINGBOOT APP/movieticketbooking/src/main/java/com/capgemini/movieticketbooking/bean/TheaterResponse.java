package com.capgemini.movieticketbooking.bean;

import java.util.List;

public class TheaterResponse {

	private int statusCode;
	private String messesge;
	private String discription;
	private List<TheaterBean> beans;
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
	public List<TheaterBean> getBeans() {
		return beans;
	}
	public void setBeans(List<TheaterBean> beans) {
		this.beans = beans;
	}
	@Override
	public String toString() {
		return "TheaterResponse [statusCode=" + statusCode + ", messesge=" + messesge + ", discription=" + discription
				+ ", beans=" + beans + "]";
	}
	
	
}
