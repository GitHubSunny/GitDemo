package com.sun.service.impl;

import org.springframework.stereotype.Service;

import com.sun.bean.City;
import com.sun.bean.Person;
import com.sun.dao.CityDAO;
import com.sun.dao.PersonDAO;
import com.sun.service.BothService;

public class BothServiceImpl implements BothService {
	private CityDAO cityDAO;
	private PersonDAO personDAO;
	public CityDAO getCityDAO() {
		return cityDAO;
	}
	public void setCityDAO(CityDAO cityDAO) {
		this.cityDAO = cityDAO;
	}
	public PersonDAO getPersonDAO() {
		return personDAO;
	}
	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}
	public void save(){
		Person person=new Person("sun",27);
		personDAO.save(person);
		City city=new City("beijing");
		cityDAO.save(city);
	}
	
}
