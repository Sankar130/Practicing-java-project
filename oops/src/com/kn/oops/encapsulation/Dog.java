package com.kn.oops.encapsulation;

public class Dog {
	private String name;
	private String color;
	private String breed;
	private boolean isVaccinated;
	public Dog(String name, String color, String breed, boolean isVaccinated) {
		this.name = name;
		this.color = color;
		this.breed = breed;
		this.isVaccinated = isVaccinated;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public boolean isVaccinated() {
		return isVaccinated;
	}
	public void setVaccinated(boolean isVaccinated) {
		this.isVaccinated = isVaccinated;
	}
	public Dog(String name, String color) {
		this.name = name;
		this.color = color;
	}
	public Dog(String name, String color, String breed) {
		this.name = name;
		this.color = color;
		this.breed = breed;
	}
	

}
