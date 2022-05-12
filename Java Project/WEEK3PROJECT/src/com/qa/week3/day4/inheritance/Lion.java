package com.qa.week3.day4.inheritance;

public class Lion extends Mammal{
	
	private boolean claws;
	private boolean fangs;
	public String roar() {
		return "Lion ROARS!!!!!!!!!!";
	}
	public String lionLocation() {
		return this.getEnvi()+" is the environment of this Lion";
	}
	
	public Lion(float mass, String colour, int walkNum, String envi, boolean claws, boolean fangs) {
		super(mass, colour, walkNum, envi);
		this.claws = claws;
		this.fangs = fangs;
	}

	public boolean isClaws() {
		return claws;
	}
	public void setClaws(boolean claws) {
		this.claws = claws;
	}
	public boolean getFangs() {
		return fangs;
	}
	public void setFngs(boolean fangs) {
		this.fangs = fangs;
	}
	

}
