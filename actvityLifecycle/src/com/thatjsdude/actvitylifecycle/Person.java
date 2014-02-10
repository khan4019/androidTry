package com.thatjsdude.actvitylifecycle;

import java.io.Serializable;

public class Person implements Serializable {
	private String name;
	private String email;
	private String phone;
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", phone=" + phone
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Person(String name, String email, String phone) {
		
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
	
}
