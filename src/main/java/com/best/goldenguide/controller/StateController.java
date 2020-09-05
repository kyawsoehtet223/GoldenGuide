package com.best.goldenguide.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.best.goldenguide.dto.CityDTO;
import com.best.goldenguide.model.State;
import com.best.goldenguide.service.CityServices;

@Controller
public class StateController {

	@Autowired
	private CityServices city_service;

	@RequestMapping(value="/addCity.htm",method=RequestMethod.GET)
	public String add_city(Model m) {
		m.addAttribute("city",new CityDTO());
		m.addAttribute("cityList",city_service.getCityList());
		return "new_city";
	}
	@RequestMapping(value = "/addCity.htm",method = RequestMethod.POST)
	public String save_city(@ModelAttribute(value = "city") CityDTO city) {
		city_service.saveCity(city);
		return "redirect:/listCity.htm";
	}
	
	@RequestMapping(value = "/listCity.htm")
	public String show_city(Model m) {
		m.addAttribute("cities",city_service.getCityList());
		return "city_list";
	}
	
	@RequestMapping(value = "/addState.htm", method = RequestMethod.GET)
	public String add_state(Model m) {
		m.addAttribute("state",new State());
		return "new_state";
	}
	
	@RequestMapping(value = "/addState.htm", method = RequestMethod.POST)
	public String save_state(@ModelAttribute(value = "state") State state) {
		city_service.saveState(state);
		return "redirect:/listState.htm";
	}
	
	@RequestMapping(value = "/listState.htm")
	public String show_state(Model m) {
		m.addAttribute("states",city_service.getStateList());
		return "state_list";
	}
}
