package com.capgemini.movieticketbooking.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class TheaterBean {

	@Id
	@Column
	private int theaterId;
	@Column
	private String theaterName;
	@Column
	private String theaterCity;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "movies")
	private List<MovieBean> movieBean;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "screens")
	private List<ScreenBean> screenBean;
	@Column
	private String managerName;
	@Column 
	private String managerContact;
	public int getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public String getTheaterCity() {
		return theaterCity;
	}
	public void setTheaterCity(String theaterCity) {
		this.theaterCity = theaterCity;
	}
	public List<MovieBean> getMovieBean() {
		return movieBean;
	}
	public void setMovieBean(List<MovieBean> movieBean) {
		this.movieBean = movieBean;
	}
	public List<ScreenBean> getScreenBean() {
		return screenBean;
	}
	public void setScreenBean(List<ScreenBean> screenBean) {
		this.screenBean = screenBean;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getManagerContact() {
		return managerContact;
	}
	public void setManagerContact(String managerContact) {
		this.managerContact = managerContact;
	}
	@Override
	public String toString() {
		return "TheaterBean [theaterId=" + theaterId + ", theaterName=" + theaterName + ", theaterCity=" + theaterCity
				+ ", movieBean=" + movieBean + ", screenBean=" + screenBean + ", managerName=" + managerName
				+ ", managerContact=" + managerContact + "]";
	}
	
	
	
	
	
	
	
	
	
}
