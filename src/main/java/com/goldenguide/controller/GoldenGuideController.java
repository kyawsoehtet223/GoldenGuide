package com.goldenguide.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.goldenguide.service.GoldenGuideService;

@Controller
public class GoldenGuideController {
@Autowired
private GoldenGuideService goldenGuideService;
@RequestMapping(value="/state_list.htm")
public String showCategory(Model model) {
	model.addAttribute("categoryList", goldenGuideService.getStateList());
	return "state_list";
}

}
