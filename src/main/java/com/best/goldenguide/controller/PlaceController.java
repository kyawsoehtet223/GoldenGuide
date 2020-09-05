package com.best.goldenguide.controller;

import java.io.BufferedOutputStream;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.best.goldenguide.dto.CityDTO;
import com.best.goldenguide.dto.PlaceDto;
import com.best.goldenguide.service.GoldenGuideServices;
import com.best.goldenguide.service.PlaceService;


@Controller
public class PlaceController {
	private static final String UPLOAD_DIRECTORY ="/images";  
	 @Autowired
	 PlaceService placeService;
	 @Autowired
	private GoldenGuideServices service;
	 @RequestMapping(value="/add_place.htm")
		public String addPlace(Model model) {
			model.addAttribute("places", new PlaceDto());
			model.addAttribute("cityList", service.getCityList());
			return "add_place";
		}
		@RequestMapping(value="/add_place.htm",method = RequestMethod.POST)
		public String savePlace(@ModelAttribute(value="places") PlaceDto pd) {
			placeService.savePlace(pd);;
			return "redirect:/place_list.htm";
		}
		@RequestMapping(value="/place_list.htm")
		public String showPlace(Model model) {
			model.addAttribute("places", placeService.getPlaceList());
			return "place_list";
		}
}
