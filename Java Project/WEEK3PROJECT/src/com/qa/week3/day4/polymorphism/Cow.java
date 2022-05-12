package com.qa.week3.day4.polymorphism;

public class Cow extends Animal{

    public void speak() {
        System.out.println("moo");
    }
    private boolean spots;
	public Cow(String colour, boolean spots) {
		super(colour);
		this.spots = spots;
	}
	public boolean isSpots() {
		return spots;
	}
	public void setSpots(boolean spots) {
		this.spots = spots;
	}
    

}
