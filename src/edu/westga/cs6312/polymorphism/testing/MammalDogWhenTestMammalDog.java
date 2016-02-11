package edu.westga.cs6312.polymorphism.testing;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.westga.cs6312.polymorphism.model.MammalDog;

/**
 * Homework Unit Test 
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	02.10.2016
 */

public class MammalDogWhenTestMammalDog {

	

	
	/** 
	 * Test that animal is properly created
	 */		
	@Test
	public void  mammalDogWhenTestMammalDog() {
		MammalDog dog = new MammalDog();
		String expect = "Animal kind: dog, covering: fur"; 
		String results = dog.toString();
		assertEquals(expect, results);
	}

	/** 
	 * Test that toString works properly
	 */	
	@Test
	public void mammalDogWhenTestMammalDogToString() {
		MammalDog dog = new MammalDog();
		String expect = "Animal kind: dog, covering: fur"; 
		String results = dog.toString();
		assertEquals(expect, results);
	}
	
	/** 
	 * Test if correct sound is returned
	 */	
	@Test
	public void mammalDogWhenTestMammalDogGetSound() {
		MammalDog dog = new MammalDog();
		String expect = "woof"; 
		String results = dog.getSound();
		assertEquals(expect, results);
	}


	/** 
	 * Test if proper movement is returned
	 */		
	@Test
	public void mammalDogWhenTestMammalDogGetMovement() {
		MammalDog dog = new MammalDog();
		String expect = "I walk on 4 legs"; 
		String results = dog.getMovement(false);
		assertEquals(expect, results);
	}
	
	
	/** 
	 * Test that animal is properly created and that
	 * getKind, getCovering return proper values
	 */		
	@Test
	public void  mammalDogWhenTestGetKindGetCovering() {
		MammalDog dog = new MammalDog();
		String expect = "Animal kind: " + dog.getKind()  + ", covering: " + dog.getCovering(); 
		String results = dog.toString();
		assertEquals(expect, results);
	}	
	

}
