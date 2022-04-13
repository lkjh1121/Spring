package kr.co.staff.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping(value={"", "/list"})
	public String list() {
		return "/list";
	}
	
	@GetMapping("/register")
	public String register() {
		return "/register";
	}
	@GetMapping("/modify")
	public String modify() {
		return "/modify";
	}
	
}
