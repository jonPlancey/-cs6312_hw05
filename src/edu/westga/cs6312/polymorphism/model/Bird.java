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
	 * determin how fast animal is moving
	 * @param trueFalse 		Animal is moving fast or not.
	 * @return string describing how fast animal moves.
	 *  
	 * Precondition: trueFalse != null 
	 * Postcondition: boolean value of true\false and return discriptive string
	 */ 
	@Override
	public String getMovement(Boolean trueFalse) {
		String output 	= "";
		String ifFalse	= "I walk on two legs";
		String ifTrue 	= "I fly";
		
		if (trueFalse == null) {
			throw new IllegalArgumentException("Invalid value, expect boolean");
		}

		if (trueFalse) {
			output = ifTrue;
		} else {
			output = ifFalse;
		}
		return output;
	}
	
}
