package com.qa.week3.day4;

import com.qa.week3.day4.encapsulation.*;
import com.qa.week3.day4.inheritance.*;
import com.qa.week3.day4.polymorphism.*;

@SuppressWarnings("unused")
public class Runner {
	public static void main(String[] args) {
//		BankDetails user1 = new BankDetails("3928572380", "ZakeFAhmed", 10000f, "jhbfljweafb");
//		System.out.println(user1.setBalance(1000000f));
//		System.out.println(user1.setBalance(10.56f));
//		System.out.println(user1.getName("dfhfdni"));
//		System.out.println(user1.getName(user1.getPassWord()));
//	
		Man user = new Man(60f, "Brown", 2, "City", "John Doe", "Britsh");
		Lion alex = new Lion(200f, "Yellow", 4, "Savanna", true, true);
		System.out.println(alex.lionLocation());
		System.out.println(alex.roar());
		System.out.println(user.talk());
		LionSpecies alex2 = new LionSpecies(200f, "Yellow", 4, "Savanna", true, true, "Cape");
		System.out.println(alex2.lionLocation());
		System.out.println(alex2.roar());
		System.out.println(alex2.hunt());
		System.out.println("=============Cow=============");
        Cow cow = new Cow("White",true);
        cow.speak();
        cow.sleep();
        System.out.println("=============================");
        System.out.println("============Animal===========");
        Animal animal = new Cow("white", true);
        ((Cow) animal).speak();
        animal.sleep();
        System.out.println("=============================");
        System.out.println("============Object===========");
        Object object = new Cow("white", true);
        ((Cow) object).speak();
        ((Cow) object).sleep();
        System.out.println("=============================");


	}

}
