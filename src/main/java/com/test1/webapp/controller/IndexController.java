package com.test1.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping(value = "index")
	public String getWelcome(Model model) {
		model.addAttribute("intestazione", "Benvenuti nel sito AlphaShop");
		model.addAttribute("saluti", "Seleziona i prodotti da acquistare");
		return "index";
	}

}
