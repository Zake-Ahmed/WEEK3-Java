package com.qa.week3.day3.objects;

public class Car {
	public String colour;
	public int year;
	public int seats;
	public float weight;
	public boolean manual;
	
	public Car(String colorC, int yearC, int seatsC, float weightC , boolean manualC) {
		this.colour=colorC;
		this.year=yearC;
		this.seats=seatsC;
		this.weight=weightC;
		this.manual=manualC;
		
		
	}

	@Override
	public String toString() {
		return "Car [colour=" + colour + ", year=" + year + ", seats=" + seats + ", weight=" + weight + ", manual="
				+ manual + "]";
	}
	

}
