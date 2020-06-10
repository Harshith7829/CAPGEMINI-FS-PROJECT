package com.capgemini.movieticketbooking.bean;

import java.sql.Time;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class ShowBean {

	@Id
	@Column
	private int showId;
	@Column
	private Time showStartTime;
	@Column
	private Time showEndTime;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "seaters")
	private List<SeatBean> seats;
	@Column
	private String showName;
	@OneToOne(cascade = CascadeType.ALL) 
	@JoinColumn(name ="movies")
	private MovieBean movieName;
	@Column
	private int screenId;
	@Column
	private int theaterId;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="sId")
	private ShowBean show;
	
	
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public Time getShowStartTime() {
		return showStartTime;
	}
	public void setShowStartTime(Time showStartTime) {
		this.showStartTime = showStartTime;
	}
	public Time getShowEndTime() {
		return showEndTime;
	}
	public void setShowEndTime(Time showEndTime) {
		this.showEndTime = showEndTime;
	}
	public List<SeatBean> getSeats() {
		return seats;
	}
	public void setSeats(List<SeatBean> seats) {
		this.seats = seats;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	
	public MovieBean getMovieName() {
		return movieName;
	}
	public void setMovieName(MovieBean movieName) {
		this.movieName = movieName;
	}
	public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
	public int getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}
	public ShowBean getShow() {
		return show;
	}
	public void setShow(ShowBean show) {
		this.show = show;
	}
	@Override
	public String toString() {
		return "ShowBean [showId=" + showId + ", showStartTime=" + showStartTime + ", showEndTime=" + showEndTime
				+ ", seats=" + seats + ", showName=" + showName + ", movieName=" + movieName + ", screenId=" + screenId
				+ ", theaterId=" + theaterId + ", show=" + show + "]";
	}
	
	
	
	
	
}
