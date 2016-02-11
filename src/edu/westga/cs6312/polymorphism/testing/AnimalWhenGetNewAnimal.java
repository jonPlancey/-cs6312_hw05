package edu.westga.cs6312.polymorphism.testing;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.westga.cs6312.polymorphism.model.BirdEagle;
import edu.westga.cs6312.polymorphism.model.BirdCrow;
import edu.westga.cs6312.polymorphism.model.MammalCat;
import edu.westga.cs6312.polymorphism.model.MammalDog;



/**
 * Homework Unit Test 
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	02.10.2016
 */
public class AnimalWhenGetNewAnimal {

	
	/** 
	 * BirdEagle test: getNewAnimal return proper animal detailes
	 */	
	@Test
	public void testAnimalWhenGetNewAnimalEagle() {	
		BirdEagle eagle = new BirdEagle();
		String animal = BirdEagle.getNewAnimal("eagle");
		
		String expect = "Animal kind: " + animal + ", covering: feathers"; 
		String results = eagle.toString();
		assertEquals(expect, results);
	}
	

	
	/** 
	 * BirdEagle test: getNewAnimal return proper animal detailes
	 */	
	@Test
	public void testAnimalWhenGetNewAnimalCrow() {	
		BirdCrow crow = new BirdCrow();
		String animal = BirdEagle.getNewAnimal("crow");
		
		String expect = "Animal kind: " + animal + ", covering: feathers"; 
		String results = crow.toString();
		assertEquals(expect, results);
	}
	

	
	/** 
	 * BirdEagle test: getNewAnimal return proper animal detailes
	 */	
	@Test
	public void testAnimalWhenGetNewAnimalCat() {	
		MammalCat cat = new MammalCat();
		String animal = BirdEagle.getNewAnimal("cat");
		
		String expect = "Animal kind: " + animal + ", covering: fur"; 
		String results = cat.toString();
		assertEquals(expect, results);
	}
	

	
	/** 
	 * BirdEagle test: getNewAnimal return proper animal detailes
	 */	
	@Test
	public void testAnimalWhenGetNewAnimalDog() {	
		MammalDog dog = new MammalDog();
		String animal = BirdEagle.getNewAnimal("dog");
		
		String expect = "Animal kind: " + animal + ", covering: fur"; 
		String results = dog.toString();
		assertEquals(expect, results);
	}	

}
