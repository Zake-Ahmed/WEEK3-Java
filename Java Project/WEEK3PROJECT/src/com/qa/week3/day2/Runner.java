package com.qa.week3.day2;

import com.qa.week3.day2.parameter.*;

public class Runner {

	public static void main(String[] args) {
		Calculator cal = new Calculator("Graphical", "fx-85GT Plus", true);
		System.out.println("Calculator type is : " + cal.type);
		System.out.println("(manual) Calculator model is : " + cal.model);
		System.out.println(cal.printModel());
		System.out.println("Calculator solar panel is : " + cal.solarPanel);
//		System.out.println(BasicCalculator.name("Zake", "Tuesday"));
		System.out.println(cal.addThreeNum(4, 5, 8));
		System.out.println(cal.minusTwoNum(10, 4));
		System.out.println(cal.multiTwoNum(6, 5));
		System.out.println(cal.divTwoNum(114, 0));
		System.out.println(cal.squareNum(3));
		System.out.println(cal.evenCheck(11));
//		System.out.println(Exercises.blackJack(21,21));
//		System.out.println(Exercises.uniqueSum(4,5,9));
//		System.out.println(Exercises.fizzBuzz(114));
//		System.out.println(Taxes.percentage(20000D));
//		System.out.println(Taxes.taxedPayed(20000D));
//		System.out.println(Taxes.combine(2000000D));
//		Loop.moneySpend(300, 23.50f, 40);
//		Loop.moneySpend2(300, 35, 10, 40);
	}

}
