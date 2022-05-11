package com.qa.week3.day3.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayLists {
	public static void list() {
		List<String> num = new ArrayList<>();
		System.out.println("     ");
		System.out.println("--------------------------------------");
		System.out.println(num);
		for (int i = 0; i < 10; i++) {
			int a = new Random().nextInt(100);
			num.add(a+"");
			
		}
		System.out.println(num);
		System.out.println("     ");
		System.out.println("--------------------------------------");
		for (String i : num) {
			System.out.print(i+" ");
		}
		System.out.println("     ");
		System.out.println("--------------------------------------");
	}
//	public List<String> orders = new ArrayList<>();
//	public static void orderAdd()
	
	

}
