package com.camilo.tarea.springboot.estructuras.controller;

import org.springframework.beans.factory.annotation.Value;
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
	
	@Value("${config.columnTables}")
	private String[] textTable;
	
	public SimplyLinkedListController() {
		managerUser = new ManagerUser();
	}

	@GetMapping({"/simplyList"})
	public String list(Model model, 
			@Value("${config.messageSimplyList}") String message,
			@Value("${config.btnSelect}") String selectText,
			@Value("${config.optionSelect}") String optionSelect) {
		SimplyLinkedList<User> userList = managerUser.getusersOnSimpleList();
		model.addAttribute("title", message);
		model.addAttribute("textTable", textTable);
		model.addAttribute("optionSelect", optionSelect);
		model.addAttribute("selectText", selectText);
		model.addAttribute("userList", userList);
		return "list";
	}
	
	@GetMapping("/simplyOne")
	public String userSelected(Model model, @RequestParam long idUser, 
			@Value("${config.messageUserSelected}") String message,
			@Value("${config.btnBack}") String btnBack) {
		User user = managerUser.getUserOnSimpleList(idUser);
		model.addAttribute("title", message);
		model.addAttribute("textTable", textTable);
		model.addAttribute("user", user);
		model.addAttribute("btnBack", btnBack);
		model.addAttribute("back", "/simplyList");
		return "user";
	}
}
