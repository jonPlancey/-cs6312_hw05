package edu.westga.cs6312.polymorphism.model;


/**
 * Homework 
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	02.10.2016
 */
public abstract class Mammal extends Animal {

	
	/** 
	 * 2 parameter constructor to create an mammal object 
	 * @param animalkind 		The kind of mammal being created 
	 * 
	 * Precondition: animalkind != null, animalCovering!= null  
	 * Postcondition: An animal of whose type is kind and is
	 *                covered with covering
	 */ 
	public Mammal(String animalkind) {
		super(animalkind, "hair");
	}
}
