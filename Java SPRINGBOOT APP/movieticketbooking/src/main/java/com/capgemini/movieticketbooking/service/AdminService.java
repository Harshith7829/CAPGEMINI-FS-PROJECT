package com.capgemini.movieticketbooking.service;

import java.util.List;

import com.capgemini.movieticketbooking.bean.MovieBean;
import com.capgemini.movieticketbooking.bean.ScreenBean;
import com.capgemini.movieticketbooking.bean.ShowBean;
import com.capgemini.movieticketbooking.bean.TheaterBean;

public interface AdminService {

	public TheaterBean addTheater(TheaterBean theaterBean);
	public boolean deleteTheater(int i);
	public MovieBean addMovie(MovieBean movieBean);
	public boolean deleteMovie(int i);
	public List<MovieBean> getAllMovies();
	public boolean updateMovie(MovieBean movieBean);
	public ScreenBean addScreen(ScreenBean screenBean);
	public boolean deleteScreen(int i);
	public ShowBean addShow(ShowBean showBean);
	public boolean deleteShow(int i);
}
