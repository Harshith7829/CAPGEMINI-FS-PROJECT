package com.capgemini.movieticketbooking.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class SeatBean {

	@Id
	@Column
	private int seatId;
	
	private enum seatStatus {
		Booked , Book
	};
	@Column
	private Double seatPrice;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "seaterId")
	private SeatBean seaters;

	public int getSeatId() {
		return seatId;
	}

	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}

	public Double getSeatPrice() {
		return seatPrice;
	}

	public void setSeatPrice(Double seatPrice) {
		this.seatPrice = seatPrice;
	}

	public SeatBean getSeaters() {
		return seaters;
	}

	public void setSeaters(SeatBean seaters) {
		this.seaters = seaters;
	}

	@Override
	public String toString() {
		return "SeatBean [seatId=" + seatId + ", seatPrice=" + seatPrice + ", seaters=" + seaters + "]";
	}
	
	
	
}
