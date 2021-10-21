package com.debugger.collections.api.cars;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.*;

class CarComparisonTest {

	Collection<Car> cars;
	Car subaru, tesla, honda;

	@BeforeEach
	public void setUp(TestInfo info) throws Exception {
		System.out.format("%nPerforming %s%n", info.getTestMethod().get().getName());

		this.cars = new ArrayList<>();
		this.subaru = new Car("Subaru", "Impreza", 15700);
		this.tesla = new Car("Tesla", "Model S", 5700);
		this.honda = new Car("Honda", "Civic", 170000);
		cars.addAll(Arrays.asList(subaru, tesla, honda));
	}

	@AfterEach
	public void tearDown() throws Exception {
		System.out.format("%nResults%n");
		cars.stream().map(c -> String.format("%s %s", c.getMake(), c.getModel(), c.getMileage()))
				.forEach(System.out::println);
	}

	@Test
	public void removeTest() {
		cars.remove(honda);
		cars.remove(new Car("Subaru", "Impreza", 15700));
		assertEquals(1, cars.size());
	}

	@Test
	public void containsTest() {
		assertTrue(cars.contains(honda));
		assertTrue(cars.contains(subaru));
		assertTrue(cars.contains(new Car("Tesla", "Model S", 5700)));
	}

	@Test
	public void removeAllIdentityTest() {
		cars.removeAll(Arrays.asList(subaru, tesla, new Car("Honda", "Civic", 170000)));
	}

}
