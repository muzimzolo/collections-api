package com.debugger.collections.api.hotel;
import java.util.*;

import com.debugger.collections.loops.Room;

public class Application {
	
	public static void main(String[] args) {
		Room flamingo = new Room("Flamingo","Premiere Room", 4, 1750.00);
		Room grayElephant = new Room("Gray Elephant","Suite", 5, 2500.00);
		Room amur = new Room("Amur","Guest Room", 3, 1250.00);
		Room pineapple = new Room("Pineapple","Suite", 6, 2250.00);
		
		Collection <Room> rooms = List.of(flamingo, grayElephant, amur, pineapple);
		double total = getPotentialReturn(rooms);
		System.out.println("total potential revenue: R" + total);
	}
	
	private static double getPotentialReturn(Collection<Room> rooms) {
		return rooms.stream()
				.mapToDouble(r -> r.getRate()).sum();
		
	}
}
