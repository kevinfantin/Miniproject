package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.Serviceclass.PlayerService;

@Controller
public class PlayerControler {

	@Autowired
	private PlayerService playerservice;

	@GetMapping(value = "/index")
	public String viewHomePage(Model model) {

		model.addAttribute("listPlayers", playerservice.getAllPlayers());
		return "index";

	}

}
