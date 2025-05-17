package com.camilo.tarea.springboot.estructuras.models;

import com.camilo.tarea.springboot.estructuras.linearDataStructure.DoblyLinkedList;
import com.camilo.tarea.springboot.estructuras.linearDataStructure.SimplyLinkedList;
import com.camilo.tarea.springboot.estructuras.models.entity.User;

public class ManagerUser {

	private SimplyLinkedList<User> usersOnSimpleList;
	private DoblyLinkedList<User> usersOnDoblyList;
	
	public ManagerUser() {
		User one = new User("Mayerly", "Avila", 123456789);
		User two = new User("Mayerly", "Rivera", 987654321);
		User three = new User("Lisseth", "Avila", 246813579);
		User four = new User("Lisseth", "Rivera", 135792468);
		usersOnSimpleList = new SimplyLinkedList<>();
		usersOnSimpleList.add(one);
		usersOnSimpleList.add(two);
		usersOnSimpleList.add(three);
		usersOnSimpleList.add(four);
		usersOnDoblyList = new DoblyLinkedList<>();
		usersOnDoblyList.add(one);
		usersOnDoblyList.add(two);
		usersOnDoblyList.add(three);
		usersOnDoblyList.add(four);
	}

	public SimplyLinkedList<User> getusersOnSimpleList() {
		return usersOnSimpleList;
	}

	public User getUserOnSimpleList(long idUser) {
		for (User user : usersOnSimpleList) {
			if (idUser == user.getIdUser()) {
				return user;
			}
		}
		return null;
	}

	public void addUserOnSimpleList(User user) {
		this.usersOnSimpleList.add(user);
	}
	
	// ==================================================
	
	public DoblyLinkedList<User> getusersOnDoblyList() {
		return usersOnDoblyList;
	}

	public User getUserOnDoblyList(long idUser) {
		for (User user : usersOnDoblyList) {
			if (idUser == user.getIdUser()) {
				return user;
			}
		}
		return null;
	}

	public void addUserOnDoblyList(User user) {
		this.usersOnDoblyList.add(user);
	}
}
