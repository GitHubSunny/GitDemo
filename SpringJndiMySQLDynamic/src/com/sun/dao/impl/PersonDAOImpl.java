package com.sun.dao.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import com.sun.bean.Person;
import com.sun.dao.PersonDAO;
@Repository("personDAO")
public class PersonDAOImpl implements PersonDAO{
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void save(Person transientInstance) {
		
		jdbcTemplate.update("insert into person(name,age) values(?,?)",
				transientInstance.getName(),transientInstance.getAge());
		//int i=1/0;
	}
}
