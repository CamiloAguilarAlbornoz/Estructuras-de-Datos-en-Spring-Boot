package com.camilo.tarea.springboot.estructuras.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.camilo.tarea.springboot.estructuras.models.ManagerUser;
import com.camilo.tarea.springboot.estructuras.models.entity.User;
import com.camilo.tarea.springboot.estructuras.recursiveDataStructure.AvlTree;
import com.camilo.tarea.springboot.estructuras.recursiveDataStructure.NodeTree;

@RestController
@RequestMapping("/api/avl")
public class AvlTreeRestController {

	private ManagerUser managerUser;
	
	public AvlTreeRestController() {
		managerUser = new ManagerUser();
	}

	@GetMapping("/showTree")
	public NodeTree<User> tree() {
		AvlTree<User> userTree = managerUser.getTree();
		return userTree.getRoot();
	}
}
