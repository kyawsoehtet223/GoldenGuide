package com.best.goldenguide.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.best.goldenguide.model.City;
import com.best.goldenguide.model.State;
import com.best.goldenguide.repository.CityRepository;

@Controller
public class CityController {
	private CityRepository cityRepositroy;
	@PostMapping(path="/save_city") // Map ONLY POST Requests
	  public @ResponseBody String addCityInfo (@RequestParam String name) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request
		City city = new City();
		State state = new State();
		city.setName(name);
		city.setState(state);
		cityRepositroy.save(city);
	    return "Saved";
	  } 
}
