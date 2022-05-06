package kr.co.kmarket1.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminMainController {

	@GetMapping(value = {"/admin", "/admin/index"})
	public String index() {
		return "/admin/index";
	}
	
}