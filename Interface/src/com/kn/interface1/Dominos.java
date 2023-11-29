package com.kn.interface1;

public interface Dominos {
	//abstract method
	public abstract void colorWalls();
	
	//static method
	//==> Introduced in java 8-version
	public static void maintainCleanliness() {
		System.out.println("Cleanliness is maintained as per standard ");
	}
	//default method
	//==> Introduced in java 8-version
	default public void bakepizza() {
		System.out.println("Extravaganza with cheese Burst is being baked");
	}
	//private method ==> Introduced in java 9-version
	//private method
	 //private  void recipe() {
	//	 System.out.println("Recipe of baking pizza");
			
	// }
}
  