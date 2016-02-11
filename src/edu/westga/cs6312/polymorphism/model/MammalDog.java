package edu.westga.cs6312.polymorphism.model;



/**
 * Homework 
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	02.10.2016
 */
public class MammalDog extends Mammal {
	
	/** 
	 * constructor to create an MammalDog object 
	 * 
	 */ 
	public MammalDog() {
		super("dog");
	}
	
	/** 
	 * Gets the sound the dog makes
	 * @return returns the sound of animal
	 */ 	

	public String getSound() {
		return "woof";
	};	

}
