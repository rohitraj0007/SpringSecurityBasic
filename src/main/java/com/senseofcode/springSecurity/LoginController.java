package com.senseofcode.springSecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@GetMapping(path = "/")
	public String login() {
		return "you have logged in successfully";
	}

	@GetMapping(path = "/home")
	public String home() {
		return "Welocome to the home page";
	}

	@GetMapping(path = "/admin")
	public String admin() {
		return "Welocome to the admin page";
	}

}
