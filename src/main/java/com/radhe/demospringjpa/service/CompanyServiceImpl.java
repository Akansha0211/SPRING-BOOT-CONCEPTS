package com.radhe.demospringjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.radhe.demospringjpa.model.Company;
import com.radhe.demospringjpa.repository.CompanyRepository;

@Service
public class CompanyServiceImpl implements CompanyService {
	
	@Autowired
	private CompanyRepository repo;
	public List<Company> getAllDetails(){
		return repo.findAll();
	}
}
