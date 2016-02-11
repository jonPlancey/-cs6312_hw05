package edu.westga.cs6312.polymorphism.model;


/**
 * Homework 
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	02.10.2016
 */
public abstract class Bird extends Animal {
	

	
	/** 
	 * 2 parameter constructor to create an mammal object 
	 * @param animalkind 		The kind of mammal being created 
	 * 
	 * Precondition: animalkind != null, animalCovering!= null  
	 * Postcondition: An animal of whose type is kind and is
	 *                covered with covering
	 */ 
	public Bird(String animalkind) {
		super(animalkind, "feathers");
	}
	

	
	/** 
	 * determin whether bird is walking or flying
	 * @param trueFalse Animal is walking or flying
	 * @return bird walks on 2 les or flyss.
	 *  
	 * Precondition: trueFalse != null 
	 * Postcondition: boolean value of true\false and return discriptive string
	 */ 
	@Override
	public String getMovement(Boolean trueFalse) {
		super.getMovement(trueFalse);		
		if (trueFalse) {
			return "I fly";
		} else {
			return "I walk on 2 legs";
		}
	}
	
}
