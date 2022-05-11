package com.qa.week3.day3.functions;

import java.util.Random;

public class Array {
	public static void exersise1() {
		String[] colour = { "Red", "Blue", "Green", "Yellow", "Black" };
		for (String i : colour) {
			System.out.print(i + " ");
		}
		System.out.println("     ");
		for (int i = 0; i < colour.length; i++) {
			if (colour[i] == "Green") {
				System.out.println("Favorite clolur is  " + colour[i]);
			}
		}
		colour[1] = "White";
		colour[3] = "Brown";
		for (int i = 0; i < colour.length; i++) {
			System.out.print(colour[i] + " ");

		}
		System.out.println("     ");

	}

	public static void excersise2() {
		System.out.println("--------------------------------------");
		int[] newArray = new int[10];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = new Random().nextInt(100);
			System.out.print(newArray[i] + ",");
		}
		System.out.println("     ");
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = 10;
			System.out.print(newArray[i] + ",");
		}

	}
}