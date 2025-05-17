package com.camilo.tarea.springboot.estructuras.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.camilo.tarea.springboot.estructuras.linearDataStructure.SimplyLinkedList;
import com.camilo.tarea.springboot.estructuras.models.ManagerUser;
import com.camilo.tarea.springboot.estructuras.models.entity.User;

@Controller
public class SimplyLinkedListController {

	private ManagerUser managerUser;
	
	public SimplyLinkedListController() {
		managerUser = new ManagerUser();
	}

	@GetMapping({"/simplyList"})
	public String list(Model model) {
		SimplyLinkedList<User> userList = managerUser.getusersOnSimpleList();
		model.addAttribute("title", "Usuarios de la lista simplemente enlazada");
		model.addAttribute("userList", userList);
		return "list";
	}
	
	@GetMapping("/simplyOne")
	public String userSelected(Model model, @RequestParam long idUser) {
		User user = managerUser.getUserOnSimpleList(idUser);
		model.addAttribute("title", "Usuario seleccionado");
		model.addAttribute("user", user);
		return "user";
	}
}
