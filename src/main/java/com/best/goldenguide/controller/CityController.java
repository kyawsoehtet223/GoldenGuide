package com.best.goldenguide.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.best.goldenguide.dto.CityDTO;
import com.best.goldenguide.model.City;
import com.best.goldenguide.model.State;
import com.best.goldenguide.repository.CityRepository;
import com.best.goldenguide.service.CityServices;

@Controller
public class CityController {
	private CityServices city_service;
	
	@RequestMapping(value="/addCity.htm",method=RequestMethod.GET)
	public String add_city(@ModelAttribute("city")City city,Model m) {
		//cityRepository.save(city);
		m.addAttribute("city",new CityDTO());
		m.addAttribute("cityList",city_service.getCityList());
		
		return "city_list";
	}
	
}
