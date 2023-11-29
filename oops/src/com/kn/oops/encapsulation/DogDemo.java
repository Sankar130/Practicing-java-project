package com.kn.oops.encapsulation;

public class DogDemo {
	public static void main(String[] args) {
		Dog d1= new Dog("Rosey","Black","Puppy",true);
		Dog d2= new Dog("Mani","White");
		Dog d3= new Dog("Subramani","Brown","Labarder");
		Dog d4= new Dog("Blacky","Black","Puppy",true);
		System.out.println("Dog 1 Deatails: ");
		System.out.println("Dog Name ="+d1.getName());
		System.out.println("Dog Color ="+d1.getColor());
		System.out.println("Dog Breed ="+d1.getBreed());
		System.out.println("Dog IsVaccnited ="+d1.isVaccinated());
		System.out.println("**************");
		System.out.println("Dog 2 Deatails: ");
		System.out.println("Dog Name ="+d2.getName());
		System.out.println("Dog Color ="+d2.getColor());
		System.out.println("Dog Breed ="+d2.getBreed());
		System.out.println("Dog IsVaccnited ="+d2.isVaccinated());
		System.out.println("**************");
		System.out.println("Dog 3 Deatails: ");
		System.out.println("Dog Name ="+d3.getName());
		System.out.println("Dog Color ="+d3.getColor());
		System.out.println("Dog Breed ="+d3.getBreed());
		System.out.println("Dog IsVaccnited ="+d3.isVaccinated());
		System.out.println("**************");
		System.out.println("Dog 4 Deatails: ");
		System.out.println("Dog Name ="+d4.getName());
		System.out.println("Dog Color ="+d4.getColor());
		System.out.println("Dog Breed ="+d4.getBreed());
		System.out.println("Dog IsVaccnited ="+d4.isVaccinated());
		System.out.println("**************");
		
	}

}
