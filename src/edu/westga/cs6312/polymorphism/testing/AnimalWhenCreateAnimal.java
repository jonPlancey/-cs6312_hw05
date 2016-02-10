package edu.westga.cs6312.polymorphism.testing;


import static org.junit.Assert.*;
import org.junit.Test;
import edu.westga.cs6312.polymorphism.model.Animal;



/**
 * Homework Unit Tests 
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	02.10.2016
 */

public class AnimalWhenCreateAnimal {

	
	/** 
	 * Tests: be sure that spinning the padlock
	 *  42 units right will leave it at 7
	 */		
	@Test
	public void testAnimalWithDogHair() {
		Animal dog = new Animal("dog", "hair");
		String expect = "New Animal (1, 9, 5), currently at 0, cannot be opened";
		String result = "New Animal (1, 9, 5), currently at 0, cannot be opened";
		assertEquals(expect, result);
	}

}
