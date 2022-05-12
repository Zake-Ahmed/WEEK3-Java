package com.qa.week3.day4.inheritance;

public class LionSpecies extends Lion {
	private String species;

	public LionSpecies(float mass, String colour, int walkNum, String envi, boolean claws, boolean fangs,
			String species) {
		super(mass, colour, walkNum, envi, claws, fangs);
		this.species = species;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String hunt() {
		return "Kill this lion";
	}
}
