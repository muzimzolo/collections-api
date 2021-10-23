package com.debugger.collections.loops.menu;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class MenuSet {

	public static void main(String[] args) {

		Menu burger = new Menu("Burger", 54.99);
		Menu soda = new Menu("Soda", 18.99);
		Menu coffee = new Menu("Coffee", 24.99);
		Menu muffin = new Menu("Muffin", 14.99);

		Set<Menu> food = new HashSet<>();
		food.add(coffee);
		food.add(burger);
		food.add(muffin);
		food.add(soda);

		food.stream().map(f -> f.getItem()).forEach(System.out::println);

		double total = getOrderTotal(food);
		System.out.println("Order total: R" + total);
	}

	private static double getOrderTotal(Collection<Menu> items) {
		return items.stream().mapToDouble(r -> r.getPrice()).sum();

	}

}
