package com.camilo.tarea.springboot.estructuras.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.camilo.tarea.springboot.estructuras.models.ManagerUser;
import com.camilo.tarea.springboot.estructuras.models.entity.User;

@RestController
@RequestMapping("/api/simplyList")
public class SimplyLinkedListRestController {
	
	private ManagerUser managerUser;
	
	public SimplyLinkedListRestController() {
		managerUser = new ManagerUser();
	}
	
	@GetMapping("/list")
	public List<User> list(Model model) {
		List<User> userList = new ArrayList<>();
		for (User user : managerUser.getusersOnSimpleList()) {
			userList.add(user);
		}
		return userList;
	}
	
	@GetMapping("/getOne")
	public User userSelected(Model model, @RequestParam long idUser) {
		User user = managerUser.getUserOnSimpleList(idUser);
		return user;
	}
	
	@PostMapping("/create")
	public User create(@RequestBody User user) {
		managerUser.addUserOnSimpleList(user);
		return user;
	}
}
