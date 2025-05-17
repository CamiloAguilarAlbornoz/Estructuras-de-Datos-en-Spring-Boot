package com.camilo.tarea.springboot.estructuras.models.entity;

public class User {

	private String name;
	private String lastName;
	private long idUser;

	public User(String name, String lastName, long idUser) {
		this.name = name;
		this.lastName = lastName;
		this.idUser = idUser;
	}

	public User() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getIdUser() {
		return idUser;
	}

	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}
}
