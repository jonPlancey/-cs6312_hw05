package edu.westga.cs6312.polymorphism.testing;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.westga.cs6312.polymorphism.model.BirdEagle;



/**
 * Homework Unit Test 
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	02.10.2016
 */
public class AnimalWhenGetNewAnimal {

	
	/** 
	 * Test that getNewAnimal return proper animal
	 */	
	@Test
	//testBallWithColorYellow
	public void testAnimalWhenGetNewAnimalEagle() {	
		BirdEagle eagle = new BirdEagle();		
		String expect = BirdEagle.getNewAnimal("eagle");
		String results = eagle.toString();
		assertEquals(expect, results);
	}

}
