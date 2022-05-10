package com.qa.week3.day2.parameter;

import java.util.Random;

public class Loop {
	public static void moneySpend(int starting, float expences, int limit ) {
		while (starting>limit) {
			
			starting -= expences;
			System.out.println("New Balence " + starting);
		}
		System.out.println("STOP SPENDING MONEY!!");
	}
	public static void moneySpend2(int starting, int maxExpences, int minExpences, int limit ) {
		while (starting>limit) {
			int e=  new Random().nextInt(1+maxExpences-minExpences) + minExpences;
		
			starting -= e;
			System.out.println("New Balence " + starting);
			
		}
		System.out.println("STOP SPENDING MONEY!!");
	}

}
