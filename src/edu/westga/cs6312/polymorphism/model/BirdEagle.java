package edu.westga.cs6312.polymorphism.model;



/**
 * Homework 
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	02.10.2016
 */
public class BirdEagle extends Bird {
	
	/** 
	 * constructor to create an BirdEagle object 
	 * 
	 */ 
	public BirdEagle() {
		super("eagle");
	}
	
	/** 
	 * Gets the sound the eagle makes
	 * @return returns the sound of animal
	 */ 	

	public String getSound() {
		return "scree";
	};	

}
