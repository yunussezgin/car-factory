package com.yunus.carfactory;

import org.springframework.stereotype.Component;

@Component
public class Sedan implements Car {

	@Override
	public String getType() {
		return "Sedan";
	}

}
