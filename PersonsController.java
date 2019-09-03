package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.PersonsDao;
import com.example.demo.model.Persons;

@RestController
@RequestMapping("/application")
public class PersonsController 
{
	@Autowired
	PersonsDao dao;
	
	@GetMapping("/users")
	public String getPersons()
	{
		return "Usernames are :" +dao.findAll();
	}
	
	@PostMapping("/save")
	public void savePerson(Persons p)
	{
		dao.save(p);
	}
}
