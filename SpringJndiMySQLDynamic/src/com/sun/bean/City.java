package com.sun.bean;

/**
 * City entity. @author MyEclipse Persistence Tools
 */

public class City implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;

	// Constructors

	/** default constructor */
	public City() {
	}

	/** full constructor */
	public City(String name) {
		this.name = name;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}