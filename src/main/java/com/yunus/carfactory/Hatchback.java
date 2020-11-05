package com.yunus.carfactory;

import org.springframework.stereotype.Component;

@Component
public class Hatchback implements Car {

	@Override
	public String getType() {
		return "Hatchback";
	}

}
