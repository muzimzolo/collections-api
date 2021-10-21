package com.debugger.collections.loops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {

		Room flower = new Room("Flower", "VIP Room", 1, 4000.0);
		Room greenwood = new Room("Greenwood", "Suite", 2, 3500.0);
		Room redRose = new Room("Red Rose", "Suite", 3, 3000.0);
		Room amurTiger = new Room("Amur Tiger", "Guest Room", 4, 2000.0);
		
		Collection<Room> rooms = new ArrayList<>(Arrays.asList(flower, greenwood, redRose, amurTiger));
		amurTiger.setPetFriendly(true);
		redRose.setPetFriendly(true);
		
		Collection<Room> petFriendlyRooms = rooms.stream()
			.filter(Room::isPetFriendly)
			.collect(Collectors.toList());
		
		double total = petFriendlyRooms.stream()
			.mapToDouble(Room::getRate)
			.sum();
		System.out.println("Total potential revenue for pet friendly rooms: R"+ total);
		
		rooms.stream().collect(Collectors.toList());
		
		
		
		
	}
}