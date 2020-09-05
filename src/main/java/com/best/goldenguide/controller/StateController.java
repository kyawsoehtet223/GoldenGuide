package com.best.goldenguide.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value ="/")
public class StateController {

	public String index(Model model) {
		return "index";
	}
	
	
}
