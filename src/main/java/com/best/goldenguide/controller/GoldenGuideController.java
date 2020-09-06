package com.best.goldenguide.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.best.goldenguide.dto.CityDTO;
import com.best.goldenguide.model.Hotel;
import com.best.goldenguide.model.Restaurant;
import com.best.goldenguide.model.State;
import com.best.goldenguide.service.GoldenGuideServices;

@Controller
public class GoldenGuideController {

	@Autowired
	private GoldenGuideServices service;
	
	@RequestMapping(value="/addCity.htm",method=RequestMethod.GET)
	public String add_city(Model m) {
		m.addAttribute("city",new CityDTO());
		m.addAttribute("cityList",service.getCityList());
		return "new_city";
	}
	
	@RequestMapping(value = "/addCity.htm",method = RequestMethod.POST)
	public String save_city(@ModelAttribute(value = "city") CityDTO city) {
		service.saveCity(city);
		return "redirect:/listCity.htm";
	}
	
	@RequestMapping(value = "/listCity.htm")
	public String show_city(Model m) {
		m.addAttribute("cities",service.getCityList());
		return "city_list";
	}
	
	@RequestMapping(value = "/addState.htm", method = RequestMethod.GET)
	public String add_state(Model m) {
		m.addAttribute("state",new State());
		return "new_state";
	}
	
	@RequestMapping(value = "/addState.htm", method = RequestMethod.POST)
	public String save_state(@ModelAttribute(value = "state") State state) {
		service.saveState(state);
		return "redirect:/listState.htm";
	}
	
	@RequestMapping(value = "/listState.htm")
	public String show_state(Model m) {
		m.addAttribute("states",service.getStateList());
		return "state_list";
	}
	
	@RequestMapping(value = "/addHotel.htm", method = RequestMethod.GET)
	public String add_hotel(Model m) {
		m.addAttribute("hotel",new Hotel());
		return "new_hotel";
	}
	
	@RequestMapping(value = "/addHotel.htm", method = RequestMethod.POST)
	public String save_hotel(@ModelAttribute(value = "hotel") Hotel hotel) {
		service.saveHotel(hotel);
		return "redirect:/listHotel.htm";
	}
	
	@RequestMapping(value = "/listHotel.htm")
	public String show_hotel(Model m) {
		m.addAttribute("hotels",service.getHotelList());
		return "hotel_list";
	}
	
	@RequestMapping(value = "/addRestaurant.htm", method = RequestMethod.GET)
	public String add_restaurant(Model m) {
		m.addAttribute("restaurant",new Restaurant());
		return "new_restaurant";
	}
	
	@RequestMapping(value = "/addRestaurant.htm", method = RequestMethod.POST)
	public String save_restaurant(@ModelAttribute(value = "restaurant") Restaurant restaurant) {
		service.saveRestaurant(restaurant);
		return "redirect:/listRestaurant.htm";
	}
	
	@RequestMapping(value = "/listRestaurant.htm")
	public String show_restaurant(Model m) {
		m.addAttribute("restaurants",service.getRestaurantList());
		return "restaurant_list";
	}
}
