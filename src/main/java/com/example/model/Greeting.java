package com.example.model;

import java.io.Serializable;

public class Greeting implements Serializable {

	private static final long serialVersionUID = -5071155029274177638L;

	private String message;

	public Greeting(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
