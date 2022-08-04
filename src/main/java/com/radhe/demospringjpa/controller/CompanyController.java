package com.radhe.demospringjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.radhe.demospringjpa.model.Company;
import com.radhe.demospringjpa.service.CompanyService;


@RestController
public class CompanyController {
	
	@Autowired
	private CompanyService service;
	
	@GetMapping("/company-details")
	public ResponseEntity<List<Company>> getCompanDetails(){
		return new ResponseEntity<List<Company>>(service.getAllDetails(), HttpStatus.OK);
	}
	
}
