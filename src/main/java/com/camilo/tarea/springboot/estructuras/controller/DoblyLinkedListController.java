package com.camilo.tarea.springboot.estructuras.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.camilo.tarea.springboot.estructuras.linearDataStructure.DoblyLinkedList;
import com.camilo.tarea.springboot.estructuras.models.ManagerUser;
import com.camilo.tarea.springboot.estructuras.models.entity.User;

@Controller
public class DoblyLinkedListController {

private ManagerUser managerUser;
	
	public DoblyLinkedListController() {
		managerUser = new ManagerUser();
	}

	@GetMapping({"/doblyList"})
	public String list(Model model) {
		DoblyLinkedList<User> userList = managerUser.getusersOnDoblyList();
		model.addAttribute("title", "Usuarios de la lista doblemente enlazada");
		model.addAttribute("userList", userList);
		return "list";
	}
	
	@GetMapping("/doblyOne")
	public String userSelected(Model model, @RequestParam long idUser) {
		User user = managerUser.getUserOnDoblyList(idUser);
		model.addAttribute("title", "Usuario seleccionado");
		model.addAttribute("user", user);
		return "user";
	}
}
