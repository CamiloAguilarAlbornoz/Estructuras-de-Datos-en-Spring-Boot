package com.camilo.tarea.springboot.estructuras.models;

import java.util.Comparator;

import com.camilo.tarea.springboot.estructuras.linearDataStructure.DoblyLinkedList;
import com.camilo.tarea.springboot.estructuras.linearDataStructure.SimplyLinkedList;
import com.camilo.tarea.springboot.estructuras.models.entity.User;
import com.camilo.tarea.springboot.estructuras.recursiveDataStructure.AvlTree;

public class ManagerUser implements Comparator<User> {

	private SimplyLinkedList<User> usersOnSimpleList;
	private DoblyLinkedList<User> usersOnDoblyList;
	private AvlTree<User> userTree;
	
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
		userTree = new AvlTree<>(this);
		userTree.put(new User("Uno", "Uno", 1));
		userTree.put(new User("Dos", "Dos", 2));
		userTree.put(new User("Tres", "Tres", 3));
		userTree.put(new User("Cuatro", "Cuatro", 4));
		userTree.put(new User("Cinco", "Cinco", 5));
		userTree.put(new User("Seis", "Seis", 6));
		userTree.put(new User("Siete", "Siete", 7));
		userTree.put(new User("Ocho", "Ocho", 8));
		userTree.put(new User("Nueve", "Nueve", 9));
		userTree.put(new User("Diez", "Diez", 10));
		userTree.put(new User("Once", "Once", 11));
		userTree.put(new User("Doce", "Doce", 12));
		userTree.put(new User("Trece", "Trece", 13));
		userTree.put(new User("Catorce", "Catorce", 14));
		userTree.put(new User("Quince", "Quince", 15));
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
	
	// ==================================================
	public AvlTree<User> getTree() {
		return userTree;
	}

	public void addUserOnDoblyList(User user) {
		this.usersOnDoblyList.add(user);
	}

	@Override
	public int compare(User u1, User u2) {
		return (int) (u2.getIdUser() - u1.getIdUser());
	}
}
