package com.qa.week3.day3.objects;

public class Runner {
	public static void main(String[] args) {
		Car newCar = new Car("Red", 2012, 5, 1500.23f, true);
		System.out.println(newCar.colour);
		newCar.colour = "Blue";
		System.out.println(newCar.colour);
		newCar.manual=false;
		System.out.println(newCar.manual);
		System.out.println(newCar);

	}

}
