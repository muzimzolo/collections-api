package com.debugger.collections.hotel;

import java.util.Objects;

public class Room {

	private String name;
	private String type;
	private int capacity;
	private double rate;

	public Room(String name, String type, int capacity, double rate) {
		super();
		this.name = name;
		this.type = type;
		this.capacity = capacity;
		this.rate = rate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, rate, type);
	}

	@Override
	public boolean equals(Object obj) {

		Room r = (Room) obj;
		System.out.format("Comparing %s %s with %s %s %n", this.name, this.type, this.rate, r.name, r.type, r.rate);
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		return Objects.equals(name, other.name) && Double.doubleToLongBits(rate) == Double.doubleToLongBits(other.rate)
				&& Objects.equals(type, other.type);
	}

}
