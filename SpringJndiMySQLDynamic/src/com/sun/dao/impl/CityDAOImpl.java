package com.sun.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sun.bean.City;
import com.sun.dao.CityDAO;
@Repository("cityDAO")
public class CityDAOImpl implements CityDAO{
	private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void save(City transientInstance) {
		jdbcTemplate.update("insert into city(name) values(?)",
				transientInstance.getName());
		//int i=1/0;
	}
}
