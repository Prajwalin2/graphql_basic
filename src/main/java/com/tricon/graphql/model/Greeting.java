package com.tricon.graphql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Greeting {

	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private int id;

	  private String message;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Greeting() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Greeting(int id, String message) {
		super();
		this.id = id;
		this.message = message;
	}

	  
	}