package com.yunus.carfactory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarsController {

	@GetMapping("/cars/{name}")
	public String getAllBooks(@PathVariable("name") String name) {
		return name;
	}
}
