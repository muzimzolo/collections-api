package com.debugger.collections.api.hotel;
import java.util.*;

public class Application {
	
	public static void main(String[] args) {
		Rooms flamingo = new Rooms("Flamingo","Premiere Room", 4, 1750.00);
		Rooms grayElephant = new Rooms("Gray Elephant","Suite", 5, 2500.00);
		Rooms amur = new Rooms("Amur","Guest Room", 3, 1250.00);
		Rooms pineapple = new Rooms("Pineapple","Suite", 6, 2250.00);
		
		Collection <Rooms> rooms = List.of(flamingo, grayElephant, amur, pineapple);
		double total = getPotentialReturn(rooms);
		System.out.println("total potential revenue: R" + total);
	}
	
	private static double getPotentialReturn(Collection<Rooms> rooms) {
		return rooms.stream()
				.mapToDouble(r -> r.getRate()).sum();
		
	}
}
