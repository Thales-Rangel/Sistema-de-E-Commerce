package com.thales_dev.e_commerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class indexController {
	
	@GetMapping
	public String paginaInicial() {
		return "index";
	}

}
