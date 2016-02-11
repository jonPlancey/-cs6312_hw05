package edu.westga.cs6312.polymorphism.model;



/**
 * Homework 
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	02.10.2016
 */
public class MammalCat extends Mammal {
	
	/** 
	 * constructor to create an MammalCat object 
	 * 
	 */ 
	public MammalCat() {
		super("cat");
	}
	
	/** 
	 * Gets the sound the cat makes
	 * @return returns the sound of animal
	 */ 	

	public String getSound() {
		return "meow";
	};	

}
