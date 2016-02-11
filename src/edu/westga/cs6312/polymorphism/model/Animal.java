package edu.westga.cs6312.polymorphism.model;



/**
 * Homework 
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	02.10.2016
 */
public abstract class Animal {
	
	private String kind;
	private String covering;

	/** 
	 * 2 parameter constructor to create an Animal object 
	 * @param animalkind 		The kind of animal being created 
	 * @param animalCovering 	The animal's covering type 
	 * 
	 * Precondition: kind != null 
 	 * covering:	 != null 
	 * Postcondition: An animal of whose type is kind and is
	 * covered with covering
	 */ 
	public Animal(String animalkind, String animalCovering) {
		if (animalkind == null) {
			throw new IllegalArgumentException("Invalid kind");
		}	
		if (animalCovering == null) {
			throw new IllegalArgumentException("Invalid covering"); 					
		}
		this.kind = animalkind;
		this.covering = animalCovering; 	
	} 
	
	/** 
	 * 2 parameter constructor to create an Animal object 
	 * @param trueFalse 		Animal is moving fast or not.
	 * @return string describing how fast animal moves.
	 *  
	 * Precondition: trueFalse != null 
	 * Postcondition: boolean value of true\false and return discriptive string
	 */ 
	public String getMovement(Boolean trueFalse) {
		String output = "";
		String ifFalse = "I walk on four legs";
		String ifTrue = "I run on fourlegs";
		
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
