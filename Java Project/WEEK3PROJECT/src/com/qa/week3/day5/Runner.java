package com.qa.week3.day5;

import java.util.Scanner;

import com.qa.week3.day5.abstraction.*;


public class Runner {

	public static void main(String[] args) {
		Man user = new Man(60f, "Brown", 2, "City", "John Doe", "Britsh");
		Lion alex = new Lion(200f, "Yellow", 4, "Savanna", true, true);
		System.out.println(alex.lionLocation());
		System.out.println(alex.roar());
		System.out.println(user.talk());
		System.out.println(user.getName());
 
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the mans meal ");

			String meal = scan.nextLine();
			System.out.println(user.eatMeal(meal));
		}
        System.out.println(alex.eatMeal("zebra"));


	}

}
