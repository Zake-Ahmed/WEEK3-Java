package com.qa.week3.day3.functions;

public class ForLoops {
	public static void flowChart1() {
		for (int A = 100; A <= 200; A++) {
			System.out.println(A);
		}
	}

	public static void flowChart2() {
		for (int A = 100; A <= 200; A++) {
			if (A % 2 == 0) {
				System.out.println('-');
			} else {
				System.out.println('*');
			}
		}
	}

	public static void exercise3() {
		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i);
			}
		}
	}

	public static void exercise4() {
		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.println(i);
			}
		}
	}

	public static void coin(float pay, float cost) {
		float change = pay - cost;
		// change=Math.round(change*100)/100;
		//int coinNum=0;
		while (change >= 0) {
			for (float i = change; i >= 50; i -= 50) {
				System.out.println("£50");
				change -= 50;
				//coinNum ++;
				
			} //System.out.println(coinNum + " £50");
			for (float i = change; i >= 20; i -= 20) {
				System.out.println("£20");
				change -= 20;
			}

			for (float i = change; i >= 10; i -= 10) {
				System.out.println("£10");
				change -= 10;
			}
			for (float j = change; j >= 5; j -= 5) {
				System.out.println("£5");
				change -= 5;
			}
			for (float j = change; j >= 2; j -= 2) {
				System.out.println("£2");
				change -= 2;
			}
			for (float k = change; k >= 1; k -= 1) {
				System.out.println("£1");
				change -= 1;
			}
			for (float l = change; l >= 0.5; l -= 0.5) {
				System.out.println("50p");
				change -= 0.5;
			}

			for (float l = change; l >= 0.2; l -= 0.2) {
				System.out.println("20p");
				change -= 0.2;
			}
			for (float l = change; l >= 0.1; l -= 0.1) {
				System.out.println("10p");
				change -= 0.1;
			}
			for (float m = change; m >= 0.019; m -= 0.02) {
				System.out.println("2p");
				change -= 0.02;
			}

			for (float n = change; n > 0.009; n -= 0.01) {
				System.out.println("1p");
				change -= 0.01;
			}
			if (change < 0.01) {
				break;
			}
		}
		System.out.println("------END OF PROGRAM------");

	}

}
