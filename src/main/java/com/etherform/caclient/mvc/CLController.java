package com.etherform.caclient.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CLController {

	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/hello")
	public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
		model.addAttribute("name", name);
		return "hello";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
}
