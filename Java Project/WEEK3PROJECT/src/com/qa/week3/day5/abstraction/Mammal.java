package com.qa.week3.day5.abstraction;

public abstract class  Mammal {
	private float mass;
	private String colour;
	private int walkNum;
	private String envi;

	public Mammal(float mass, String colour, int walkNum, String envi) {
		super();
		this.mass = mass;
		this.colour = colour;
		this.walkNum = walkNum;
		this.envi = envi;
	}

	public float getMass() {
		return mass;
	}

	public void setMass(float mass) {
		this.mass = mass;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getWalkNum() {
		return walkNum;
	}

	public void setWalkNum(int walkNum) {
		this.walkNum = walkNum;
	}

	public String getEnvi() {
		return envi;
	}

	public void setEnvi(String envi) {
		this.envi = envi;
	}

	public abstract String giveBirth();

	public abstract  String eatMeal(String diet);

}
