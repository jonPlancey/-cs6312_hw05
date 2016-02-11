package edu.westga.cs6312.polymorphism.model;



/**
 * Homework 
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	02.10.2016
 */
public class BirdCrow extends Bird {
	/** 
	 * constructor to create an BirdCrow object 
	 * 
	 */ 
	public BirdCrow() {
		super("crow");
	}
	
	/** 
	 * Gets the sound the animal makes
	 * @return returns the sound of animal
	 */ 	
	@Override
	public String getSound() {
		return super.getSound();
	};	
	
	/** 
	 * Sets the sound of animal 
	 * @param sound  sound animal makes 
	 */ 	
	public void setSound(String sound) { 	
		return super.setSound();
	};	
}
