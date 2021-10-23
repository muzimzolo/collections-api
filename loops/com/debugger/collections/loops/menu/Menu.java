package com.debugger.collections.loops.menu;

import java.util.*;


public class Menu {
	private String item;
	private double price;

	public Menu(String item, double price) {
		this.item = item;
		this.price = price;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Menu [item: " + item + ", price R:" + price + "]";
	}

	public static void main(String[] args) {
		Menu burger = new Menu("Burger", 54.99);
		Menu soda = new Menu("Soda", 18.99);
		Menu coffee = new Menu("Coffee", 24.95);
		Menu muffin = new Menu("Muffin", 14.99);

		Collection<Menu> items = new ArrayList<>(Arrays.asList(burger, soda, coffee, muffin));
		for (Menu menu : items) {
			System.out.println(menu);

		}
	}

}
