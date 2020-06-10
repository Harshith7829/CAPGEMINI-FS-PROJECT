package com.capgemini.movieticketbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.movieticketbooking.bean.AdminResponse;
import com.capgemini.movieticketbooking.bean.MovieBean;
import com.capgemini.movieticketbooking.bean.MovieResponse;
import com.capgemini.movieticketbooking.bean.ShowBean;
import com.capgemini.movieticketbooking.bean.ShowResponse;
import com.capgemini.movieticketbooking.bean.TheaterBean;
import com.capgemini.movieticketbooking.bean.TheaterResponse;
import com.capgemini.movieticketbooking.service.AdminService;
@CrossOrigin(origins = "*", allowedHeaders = "*" , allowCredentials = "true")
@RestController
public class AdminController {

	@Autowired 
	private AdminService adminService;
	
	@PostMapping(path="/add-newmovie",produces=MediaType.APPLICATION_JSON_VALUE,
			consumes= MediaType.APPLICATION_JSON_VALUE)
	public AdminResponse  addNewMovie(@RequestBody MovieBean movieBean) {
		AdminResponse response= new AdminResponse();
		MovieBean bean=adminService.addMovie(movieBean);
		if(bean!=null) {
			response.setStatusCode(201);
			response.setMessesge("success");
			response.setDiscription("Successfully Added Movie");
		}else {
			response.setStatusCode(401);
			response.setMessesge("failure");
			response.setDiscription("Movie Already Given to this ID");	
		}
		return response;
	}
	
	@GetMapping(path="/get-allmovies",produces = MediaType.APPLICATION_JSON_VALUE )
	public MovieResponse getAllMovies() {
		MovieResponse movieResponse = new MovieResponse();
		List<MovieBean> beans= adminService.getAllMovies();
		if(beans.isEmpty()) {
			movieResponse.setStatusCode(401);
			movieResponse.setDiscription("Currently no movies are available");
			movieResponse.setMessesge("Failure");
		}else {
			movieResponse.setStatusCode(201);
			movieResponse.setMessesge("success");
			movieResponse.setDiscription("Movies list found successfully");
			movieResponse.setBeans(beans);
		}
		return movieResponse;
	}
	
	@DeleteMapping(path= "/delete-movie/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public MovieResponse deleteMovie(@PathVariable("id") int id) {
		MovieResponse movieResponse= new MovieResponse();
		if(adminService.deleteMovie(id)) 
		movieResponse.setStatusCode(401);
		movieResponse.setMessesge("success");
		movieResponse.setDiscription("Successfully Deleted movie");
		return movieResponse;
		
	}
	
	@PutMapping(path="/modify-movie",produces=MediaType.APPLICATION_JSON_VALUE,
			consumes=MediaType.APPLICATION_JSON_VALUE)
	public MovieResponse updateNewMovie(@RequestBody MovieBean movieBean ) {
		MovieResponse response= new MovieResponse();
		if(adminService.updateMovie(movieBean)) {
			response.setStatusCode(201);
			response.setMessesge("success");
			response.setDiscription(" Successfully Modified Movie");
		}else {
			response.setStatusCode(401);
			response.setMessesge("failure");
			response.setDiscription("Failed to modify Movie");	
		}
		return response;
	}
	
	@PostMapping(path="/add-newtheater",produces=MediaType.APPLICATION_JSON_VALUE,
			consumes= MediaType.APPLICATION_JSON_VALUE)
	public TheaterResponse  addNewTheater(@RequestBody TheaterBean theaterBean ) {
		TheaterResponse response= new TheaterResponse();
		TheaterBean bean=adminService.addTheater(theaterBean);
		if(bean!=null) {
			response.setStatusCode(201);
			response.setMessesge("success");
			response.setDiscription("Successfully Added Theater");
		}else {
			response.setStatusCode(401);
			response.setMessesge("failure");
			response.setDiscription("Theater Already Given to this ID");	
		}
		return response;
	}
	
	
	@DeleteMapping(path= "/delete-theater/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public TheaterResponse deleteTheater(@PathVariable("id") int id) {
		TheaterResponse movieResponse= new TheaterResponse();
		if(adminService.deleteTheater(id)) 
		movieResponse.setStatusCode(401);
		movieResponse.setMessesge("success");
		movieResponse.setDiscription("Successfully Deleted Theater");
		return movieResponse;
		
	}
	
	@PostMapping(path="/add-newshow",produces=MediaType.APPLICATION_JSON_VALUE,
			consumes= MediaType.APPLICATION_JSON_VALUE)
	public ShowResponse  addNewShow(@RequestBody ShowBean showBean  ) {
		ShowResponse response= new ShowResponse();
		ShowBean bean=adminService.addShow(showBean);
		if(bean!=null) {
			response.setStatusCode(201);
			response.setMessesge("success");
			response.setDiscription("Successfully Added Show");
		}else {
			response.setStatusCode(401);
			response.setMessesge("failure");
			response.setDiscription("Show Already Given to this ID");	
		}
		return response;
	}
}
