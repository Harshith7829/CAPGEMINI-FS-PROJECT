package com.capgemini.movieticketbooking.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.movieticketbooking.bean.AdminResponse;
import com.capgemini.movieticketbooking.exceptions.AdminException;

@RestControllerAdvice
public class MovieTicketCotrollerAdvice {

	@ExceptionHandler(AdminException.class)
	public AdminResponse handleAdminException(AdminException adminException) {
	AdminResponse adminResponse = new AdminResponse();
	adminResponse.setStatusCode(501);
	adminResponse.setDiscription(adminException.getMessage());
	adminResponse.setMessesge("Exception");
	return adminResponse;
	}
	
}
