package com.yunus.carfactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CarfactoryApplicationTests {

	@Autowired
	private List<Car> carList;

	@Test
	public void testCabrioCar() {
		CarController carController = new CarController(carList);
		String carMessage = carController.getCars("cabrio");
		assertEquals(carMessage, "Cabrio Car has produced.");
	}

	@Test
	public void testHatchbackCar() {
		CarController carController = new CarController(carList);
		String carMessage = carController.getCars("hatchback");
		assertEquals(carMessage, "Hatchback Car has produced.");
	}

	@Test
	public void testSedanCar() {
		CarController carController = new CarController(carList);
		String carMessage = carController.getCars("sedan");
		assertEquals(carMessage, "Sedan Car has produced.");
	}

}
