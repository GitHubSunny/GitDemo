package com.sun.bean;

/**
 * Person entity. @author MyEclipse Persistence Tools
 */

public class Person implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Integer age;

	// Constructors

	/** default constructor */
	public Person() {
	}

	/** full constructor */
	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
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

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}