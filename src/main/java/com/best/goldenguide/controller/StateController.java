package com.best.goldenguide.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.best.goldenguide.dto.CityDTO;
import com.best.goldenguide.service.CityServices;

@Controller
public class StateController {

	@Autowired
	private CityServices city_service;
	
	@RequestMapping(value="/addCity.htm",method=RequestMethod.GET)
	public String add_city(Model m) {
		m.addAttribute("city",new CityDTO());
		m.addAttribute("state_list",city_service.getCityList());
		return "";
	}
	
	@RequestMapping(value = "/addCity.htm",method = RequestMethod.POST)
	public String save_city(@ModelAttribute(value = "city") CityDTO city) {
		city_service.saveCity(city);
		return "redirect:/";
	}
	
	@RequestMapping(value = "/listCity.htm")
	public String show_city(Model m) {
		m.addAttribute("cities",city_service.getCityList());
		return "";
	}
}
