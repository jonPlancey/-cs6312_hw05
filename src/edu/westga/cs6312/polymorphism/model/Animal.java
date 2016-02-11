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
	 * Precondition: animalkind != null, animalCovering!= null  
	 * Postcondition: An animal of whose type is kind and is
	 *                covered with covering
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
	 * Returns animal to be created as an object
	 * @param animalkind  The kind of animal being created 
	 * @return returns an object from the corresponding Animal subclass.
	 *  
	 * Precondition: kind != null 
	 * Postcondition: Animal of whose type is kind & covered with covering
	 */ 	
	public static String getNewAnimal(String animalkind) {		
		if (animalkind == null) {
			throw new IllegalArgumentException("Invalid kind");
		}
		
		String animal = animalkind.toLowerCase();
		
		if (animal.equals("eagle")) {
			return "eagle";
		} else if (animal.equals("crow")) {
			return "crow";
		} else if (animal.equals("cat")) {
			return "cat";
		} else if (animal.equals("dog")) {			
			return "dog";
		} else {
			return null;
		}		
	}; 
	
	
	
	/** 
	 * determin how fast animal is moving
	 * @param trueFalse 		Animal is moving fast or not.
	 * @return string describing how fast animal moves.
	 *  
	 * Precondition: trueFalse != null 
	 * Postcondition: boolean value of true\false and return discriptive string
	 */ 
	public String getMovement(Boolean trueFalse) {
		String output = "";
		String ifFalse = "I walk on 4 legs";
		String ifTrue = "I run on 4 legs";
		
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

	
	
	
	
	/** 
	 * Gets the sound the animal makes
	 * @return returns the sound of animal
	 */ 	
	public abstract String getSound();
	
	
	
	
	
	
	/** 
	 * Generates string describing animal object.
	 * @return return a String representation of animal object
	 */ 	
	@Override
	public String toString() {
		String output = "Animal kind: " + this.kind  + ", covering: " + this.covering;		
		return output;	
	}
	
	
	
	
	/** 
	 * Gets animals kind
	 * @return the kind of animal  
	 */
	public String getKind() {					
		return this.kind;
	}	


	/** 
	 * Gets animals covering
	 * @return the covering of the animal
	 */
	public String getCovering() {	
		return this.covering;
	}
	

	
}
