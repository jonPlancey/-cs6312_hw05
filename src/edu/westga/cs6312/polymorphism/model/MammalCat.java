package edu.westga.cs6312.polymorphism.model;



/**
 * Homework 
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	02.10.2016
 */
public class MammalCat extends Bird {
	
	/** 
	 * constructor to create an BirdCrow object 
	 * 
	 */ 
	public MammalCat() {
		super("cat");
	}
	
	/** 
	 * Gets the sound the animal makes
	 * @return returns the sound of animal
	 */ 	

	public String getSound() {
		return "meow";
	};	

}
