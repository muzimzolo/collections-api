package com.debugger.collections.hotel;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;


public class HotelRoom {

		// 1. Declare a collection to store Room inventory

		private Collection<Room> inventory;

		public HotelRoom() {
			// 2. Initialize Collection and assign it to the Room Inventory
			this.inventory = new LinkedHashSet<>();
		}

		public Collection<Room> getInventory() {
			// 3. Return the room inventory
			return new HashSet<>(this.inventory);
		}

		public void createRoom(String name, String type, int capacity, double rate) {
			// 4. Add a new room to the room inventory using the provided parameters
			this.inventory.add(new Room(name, type, capacity, rate));
		}

		public void createRoom(Room[] rooms) {
			// 5. Add the rooms provided in the array to the room inventory
			this.inventory.addAll(Arrays.asList(rooms));

		}
		
		public void removeRoom(Room room) {
			// 6. Remove the provided Room from the Room inventory
			this.inventory.remove(room);
		}
		
		// 7. Create a method hasRoom that returns a boolean and indicates if the Room Inventory contains a Room
		
		public boolean hasRoom(Room room) {
			return this.inventory.contains(room);
		}
		
		// 8. Create an array method that returns all rooms in the order they were added 
		public Room[] asArray() {
			return this.inventory.toArray(new Room[0]);
			
		}
		
		/*
		 * 9. Return a new Collection of rooms where RoomType matches the provided String
		 *    The original Room Inventory collection MUST NOT BE MODIFIED
		 */
		
		public Collection<Room> getByType(String type) {
			Collection<Room> copy = new HashSet<>(this.inventory);
			copy.removeIf(r -> !r.getType().equals(type));
			return copy;
		}

	}
