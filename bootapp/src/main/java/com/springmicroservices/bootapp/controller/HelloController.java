package com.springmicroservices.bootapp.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/web")
public class HelloController {
	
	@GetMapping("/hi")
	public @ResponseBody String loadPage() {
		return "Hello World!";
	}

	@GetMapping("/{name}")
	public String loadPage(Map<String, Object> model, @PathVariable String name) {
		//mapping to templates/index.html
		model.put("name", name);
		return "index";
	}
}
