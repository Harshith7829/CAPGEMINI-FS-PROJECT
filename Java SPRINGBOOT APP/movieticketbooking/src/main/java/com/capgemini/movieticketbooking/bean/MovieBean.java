package com.capgemini.movieticketbooking.bean;

import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table
public class MovieBean {

	@Id
	@Column
	private int movieId;
	@Column
	private String movieName;
	@Column
	private String movieGenre;
	@Column
	private String movieDirector;
	@Column
	private int movieLength;
	@Column
	private String movieLanguages;
	@Column 
	private LocalDate movieReleaseDate;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mId")
	private MovieBean movies;

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieGenre() {
		return movieGenre;
	}

	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}

	public String getMovieDirector() {
		return movieDirector;
	}

	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}

	public int getMovieLength() {
		return movieLength;
	}

	public void setMovieLength(int movieLength) {
		this.movieLength = movieLength;
	}

	public String getMovieLanguages() {
		return movieLanguages;
	}

	public void setMovieLanguages(String movieLanguages) {
		this.movieLanguages = movieLanguages;
	}

	public LocalDate getMovieReleaseDate() {
		return movieReleaseDate;
	}

	public void setMovieReleaseDate(LocalDate movieReleaseDate) {
		this.movieReleaseDate = movieReleaseDate;
	}

	public MovieBean getMovies() {
		return movies;
	}

	public void setMovies(MovieBean movies) {
		this.movies = movies;
	}

	@Override
	public String toString() {
		return "MovieBean [movieId=" + movieId + ", movieName=" + movieName + ", movieGenre=" + movieGenre
				+ ", movieDirector=" + movieDirector + ", movieLength=" + movieLength + ", movieLanguages="
				+ movieLanguages + ", movieReleaseDate=" + movieReleaseDate + ", movies=" + movies + "]";
	}
	
	
	
	
}
