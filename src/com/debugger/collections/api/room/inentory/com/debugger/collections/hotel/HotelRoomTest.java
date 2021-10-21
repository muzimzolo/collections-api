package com.debugger.collections.hotel;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class HotelRoomTest {
	HotelRoom service;

	Room flamingo = new Room("Flamingo", "Premiere Room", 4, 1750.00);
	Room grayElephant = new Room("Gray Elephant", "Suite", 5, 2500.00);
	Room amur = new Room("Amur", "Guest Room", 3, 1250.00);
	Room pineapple = new Room("Pineapple", "Suite", 6, 2250.00);

	@BeforeEach
	void setUp() throws Exception {
		this.service = new HotelRoom();
		this.service.createRoom("Gray Elephant", "Suite", 5, 2500.00);
		this.service.createRoom("Amur", "Guest Room", 3, 1250.00);
		this.service.createRoom("Pineapple", "Suite", 6, 2250.00);
		new Room("White Tiger", "Premiere Room", 4, 1750.00);
	}

	@Test
	void testCreateRoom() {

		this.service.createRoom("Westminister", "Premiere Room", 7, 2000.00);
		assertEquals(4, this.service.getInventory().size());
	}

	@Test
	void testCreateRooms() {
		Room[] newRooms = { this.flamingo, this.grayElephant, this.amur, this.pineapple };
		this.service.createRoom(newRooms);

		assertEquals(4, this.service.getInventory().size());
	}

	@Test
	void testRemoveRoom() {

		this.service.removeRoom(new Room("Victoria", "Suite", 5, 225.00));

		assertEquals(2, this.service.getInventory().size());
		assertFalse(this.service.getInventory().contains(flamingo));
	}

	@Test
	void testGetInventory() {
		assertNotNull(this.service.getInventory());
	}
	
	@Test
	void testHasRoom() {
		assertTrue(service.hasRoom(this.amur));
		assertTrue(service.hasRoom(this.flamingo));
	}
	
	@Test
	void testAsArray() {
		
		Room[] rooms = this.service.asArray();
		
		assertEquals(3, rooms.length);
		assertEquals(amur, rooms[0]);
		assertEquals(flamingo, rooms[1]);
		assertEquals(grayElephant, rooms[2]);
		assertEquals(pineapple, rooms[3]);
		
	}
	
	@Test
	void testGetByType() {
		Collection<Room> guestRooms = this.service.getByType("amur");
		assertEquals(1, guestRooms.size());
		
	}

}
