package com.qa.week3.day2.parameter;

public class Calculator {
	public static String addThreeNum(int x, int y, int z) {
		return (x) + " + " + (y) + " + " + (z) + " = " + (x + y + z);
	}

	public static String minusTwoNum(int x, int y) {
		if (x - y < 0) {
			return x + " - " + y + " is negative You can't subtract that";
		} else if ((x - y) % 5 == 0) {
			return x + " - " + y + " = " + (x - y) + " is a multiple of 5";
		} else {
			return x + " - " + y + " = " + (x - y);
		}
	}

	public static String multiTwoNum(int x, int y) {
		if (x == 10 || y == 10) {

			return "thats too easy to use a calculator for";
		} else if ((x * y) % 5 == 0) {
			return (x) + " x " + (y) + " = " + (x * y) + " is a multiple of 5";
		} else {
			return (x) + " x " + (y) + " = " + (x * y);
		}
	}

	public static String divTwoNum(int x, int y) {
		if (y == 0) {
			return "You can't divide by 0";
		} else if ((x / y) % 5 == 0) {
			return (x) + " / " + (y) + " = " + (x / y) + " is a multiple of 5";
		} else {
			return (x) + " / " + (y) + " = " + (x / y);
		}
	}

	public static String squareNum(int x) {
		return (x) + "\u00b2" + " = " + ((int) Math.pow(x, 2));
	}

	public static String evenCheck(int x) {
		if (x % 2 == 0) {
			return "x is even";
		} else {
			return "x is odd";
		}
	}

}