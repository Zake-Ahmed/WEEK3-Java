package com.qa.week3.day2;

import com.qa.week3.day2.parameter.*;

public class Runner {

	public static void main(String[] args) {
		System.out.println(BasicCalculator.name("Zake", "Tuesday"));
		System.out.println(Calculator.addThreeNum(4, 5, 8));
		System.out.println(Calculator.minusTwoNum(10, 4));
		System.out.println(Calculator.multiTwoNum(6, 5));
		System.out.println(Calculator.divTwoNum(114, 0));
		System.out.println(Calculator.squareNum(3));
		System.out.println(Calculator.evenCheck(11));
	}

}