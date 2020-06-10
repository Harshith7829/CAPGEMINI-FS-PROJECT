package com.capgemini.movieticketbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.movieticketbooking.bean.MovieBean;
import com.capgemini.movieticketbooking.bean.ScreenBean;
import com.capgemini.movieticketbooking.bean.ShowBean;
import com.capgemini.movieticketbooking.bean.TheaterBean;
import com.capgemini.movieticketbooking.dao.AdminDAO;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminDAO adminDAO;

	@Override
	public TheaterBean addTheater(TheaterBean theaterBean) {
		
		return adminDAO.addTheater(theaterBean);
	}

	@Override
	public boolean deleteTheater(int i) {
		
		return adminDAO.deleteTheater(i);
	}

	@Override
	public MovieBean addMovie(MovieBean movieBean) {
		// TODO Auto-generated method stub
		return adminDAO.addMovie(movieBean);
	}

	@Override
	public boolean deleteMovie(int i) {
		// TODO Auto-generated method stub
		return adminDAO.deleteMovie(i);
	}

	@Override
	public List<MovieBean> getAllMovies() {
		// TODO Auto-generated method stub
		return adminDAO.getAllMovies();
	}

	@Override
	public boolean updateMovie(MovieBean movieBean) {
		// TODO Auto-generated method stub
		return adminDAO.updateMovie(movieBean);
	}

	@Override
	public ScreenBean addScreen(ScreenBean screenBean) {
		// TODO Auto-generated method stub
		return adminDAO.addScreen(screenBean);
	}

	@Override
	public boolean deleteScreen(int i) {
		// TODO Auto-generated method stub
		return adminDAO.deleteScreen(i);
	}

	@Override
	public ShowBean addShow(ShowBean showBean) {
		// TODO Auto-generated method stub
		return adminDAO.addShow(showBean);
	}

	@Override
	public boolean deleteShow(int i) {
		// TODO Auto-generated method stub
		return adminDAO.deleteShow(i);
	}

	
}
