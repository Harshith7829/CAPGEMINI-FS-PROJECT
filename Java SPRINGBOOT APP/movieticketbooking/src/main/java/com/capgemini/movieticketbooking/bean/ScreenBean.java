package com.capgemini.movieticketbooking.bean;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table
public class ScreenBean {

	@Id
	@Column
	private int screenId ;
	@Column
	private int theaterId;
	@Column
	private String screenName;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "show" )
	private List<ShowBean> showList;
	@Column
	private LocalDate movieEndDate;
	@Column
	private int rowss;
	@Column
	private int columnss;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sId")
	private ScreenBean screens;

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

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public List<ShowBean> getShowList() {
		return showList;
	}

	public void setShowList(List<ShowBean> showList) {
		this.showList = showList;
	}

	public LocalDate getMovieEndDate() {
		return movieEndDate;
	}

	public void setMovieEndDate(LocalDate movieEndDate) {
		this.movieEndDate = movieEndDate;
	}

	public int getRows() {
		return rowss;
	}

	public void setRows(int rows) {
		this.rowss = rows;
	}

	public int getColumns() {
		return columnss;
	}

	public void setColumns(int columns) {
		this.columnss = columns;
	}

	public ScreenBean getScreens() {
		return screens;
	}

	public void setScreens(ScreenBean screens) {
		this.screens = screens;
	}

	@Override
	public String toString() {
		return "ScreenBean [screenId=" + screenId + ", theaterId=" + theaterId + ", screenName=" + screenName
				+ ", showList=" + showList + ", movieEndDate=" + movieEndDate + ", rows=" + rowss + ", columns="
				+ columnss + ", screens=" + screens + "]";
	}
	
	
	
	
	
}
