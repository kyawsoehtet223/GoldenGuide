package com.best.goldenguide.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.best.goldenguide.dto.CityImagesDto;
import com.best.goldenguide.dto.PlaceDto;
import com.best.goldenguide.service.CityImagesService;
import com.best.goldenguide.service.GoldenGuideServices;
import com.best.goldenguide.service.PlaceService;

@Controller
public class CityImagesController {
	private static final String UPLOAD_DIRECTORY ="/images";  
	 @Autowired
	 CityImagesService cityImagesService;
	 @Autowired
	 private GoldenGuideServices service;
	 @RequestMapping(value="/add_city_images.htm")
		public String addCityImages(Model model) {
			model.addAttribute("cityimages", new CityImagesDto());
			model.addAttribute("cityList", service.getCityList());
			return "add_city_images";
		}
		@RequestMapping(value="/add_city_images.htm",method = RequestMethod.POST)
		public String saveCityImages(@ModelAttribute(value="cityimages") CityImagesDto cid) {
			cityImagesService.saveCityImages(cid);;
			return "redirect:/city_images_list.htm";
		}
		@RequestMapping(value="/city_images_list.htm")
		public String showCityImages(Model model) {
			model.addAttribute("cityimagesList", cityImagesService.getCityImagesList());
			return "city_images_list";
		}
}
