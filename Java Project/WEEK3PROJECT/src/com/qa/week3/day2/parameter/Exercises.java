package com.qa.week3.day2.parameter;

public class Exercises {
	public static int blackJack(int x, int y) {
		if (x <= 21 && y <= 21) {
			if (x > y) {
				return x;
			} else {
				return y;
			}
		} else {
			return 0;
		}
	}

	public static int uniqueSum(int x, int y, int z) {
		if (x != y && x != z && y != z) {
			return x + y + z;

		} else if (x == y) {
			return z;
		} else if (z == y) {
			return x;
		} else if (x == z) {
			return y;
		} else {
			return 0;
		}
	}

	public static String fizzBuzz(int x) {
		if (x % 5 == 0 || x % 3 == 0) {
			if (x % 5 == 0) {
				return "BUZZ";
			} else if (x % 3 == 0) {
				return "FIZZ";

			} else {
				return "FIZZBUZZ";
			}
		} else {
			return x + " is neither";
		}
	}

}
