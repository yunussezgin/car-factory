package com.yunus.carfactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

	private final Map<String, Car> carMap = new HashMap<>();

	@Autowired
	public CarController(List<Car> carList) {
		for (Car car : carList) {
			carMap.put(car.getType().toLowerCase(), car);
		}
	}

	@GetMapping("/cars/{name}")
	public String getCars(@PathVariable("name") String name) {
		return carMap.get(name).getType() + " Car has produced.";
	}
}
