package com.capgemini.movieticketbooking.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capgemini.movieticketbooking.bean.MovieBean;
import com.capgemini.movieticketbooking.bean.ScreenBean;
import com.capgemini.movieticketbooking.bean.ShowBean;
import com.capgemini.movieticketbooking.bean.TheaterBean;
import com.capgemini.movieticketbooking.exceptions.AdminException;

@Repository
public class AdminDAOImpl implements AdminDAO{
	
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;

	@Override
	public TheaterBean addTheater(TheaterBean theaterBean) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		try {
		entityTransaction.begin();
		entityManager.persist(theaterBean);
		entityTransaction.commit();
		return theaterBean;
		}catch (Exception e) {

		}
		throw new AdminException("Theater already present in given ID..Please provide different ID");
		
	}

	@Override
	public boolean deleteTheater(int i) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		TheaterBean theaterBean=entityManager.find(TheaterBean.class, i);
		if(theaterBean!=null) {
			entityManager.remove(theaterBean);
			return true;
		}
		throw new AdminException("Oops cannot delete selected theater");
	}

	@Override
	public MovieBean addMovie(MovieBean movieBean) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		try {
		entityTransaction.begin();
		entityManager.persist(movieBean);
		entityTransaction.commit();
		return movieBean;
			}catch (Exception e) {
		// TODO: handle exception
		}
		throw new AdminException("Movie already present in given ID..Please provide different ID" );
	}

	@Override
	public boolean deleteMovie(int i) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		MovieBean movieBean=entityManager.find(MovieBean.class, i);
		if(movieBean!=null) {
			entityManager.remove(movieBean);
			entityTransaction.commit();	
			return true;
		}
		
		throw new AdminException("Oops cannot delete selected movie");
	}

	@Override
	public ScreenBean addScreen(ScreenBean screenBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteScreen(int i) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ShowBean addShow(ShowBean showBean) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		try {
		entityTransaction.begin();
		entityManager.persist(showBean);
		entityTransaction.commit();
		return showBean;
		}catch (Exception e) {

		}
		throw new AdminException("Please provide different ID");
	}

	@Override
	public boolean deleteShow(int i) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<MovieBean> getAllMovies() {
		String jpql="from MovieBean";
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery(jpql);
		List<MovieBean> list=query.getResultList();
		if(list!=null) {
			
			return list;
		}
		throw new AdminException("Currently no movies are available");
	}

	@Override
	public boolean updateMovie(MovieBean movieBean) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		MovieBean movieBean2=entityManager.find(MovieBean.class, movieBean.getMovieId());
		if(movieBean2!=null) {
			entityTransaction.begin();
			movieBean2.setMovieDirector(movieBean.getMovieDirector());
			movieBean2.setMovieName(movieBean.getMovieName());
			movieBean2.setMovieLanguages(movieBean.getMovieLanguages());
			movieBean2.setMovieLength(movieBean.getMovieLength());
			movieBean2.setMovieReleaseDate(movieBean.getMovieReleaseDate());
//			movieBean2.setMovieGenre(movieBean.getMovieGenre());
			entityTransaction.commit();
			return true;
		}
		throw new AdminException("Cannot update movie due to wrong ID");
	}

	
	
}
