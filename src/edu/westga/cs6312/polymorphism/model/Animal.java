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
	

}
