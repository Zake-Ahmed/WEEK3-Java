package com.qa.week3.day4.polymorphism;

public class Animal {
	public void sleep() {
        System.out.println("zzz");
    }
	private String colour;
	public Animal(String colour) {
		super();
		this.colour = colour;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
}
