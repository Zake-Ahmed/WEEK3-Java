package com.qa.week3.day2.parameter;

public class Calculator {
	public String type;
	public String model;
	public boolean solarPanel;

	public Calculator(String type, String model, boolean solarPanel) {
		super();
		this.type = type;
		this.model = model;
		this.solarPanel = solarPanel;
	}

	public String printModel() {
		return "(method) Calculator model is : " + this.model;
	}

	public String addThreeNum(int x, int y, int z) {
		return (x) + " + " + (y) + " + " + (z) + " = " + (x + y + z);
	}

	public String minusTwoNum(int x, int y) {
		if (x - y < 0) {
			return x + " - " + y + " is negative You can't subtract that";
		} else if ((x - y) % 5 == 0) {
			return x + " - " + y + " = " + (x - y) + " is a multiple of 5";
		} else {
			return x + " - " + y + " = " + (x - y);
		}
	}

	public String multiTwoNum(int x, int y) {
		if (x == 10 || y == 10) {

			return "thats too easy to use a calculator for";
		} else if ((x * y) % 5 == 0) {
			return (x) + " x " + (y) + " = " + (x * y) + " is a multiple of 5";
		} else {
			return (x) + " x " + (y) + " = " + (x * y);
		}
	}

	public String divTwoNum(int x, int y) {
		if (y == 0) {
			return "You can't divide by 0";
		} else if ((x / y) % 5 == 0) {
			return (x) + " / " + (y) + " = " + (x / y) + " is a multiple of 5";
		} else {
			return (x) + " / " + (y) + " = " + (x / y);
		}
	}

	public String squareNum(int x) {
		return (x) + "\u00b2" + " = " + ((int) Math.pow(x, 2));
	}

	public String evenCheck(int x) {
		if (x % 2 == 0) {
			return "x is even";
		} else {
			return "x is odd";
		}
	}

}
