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
public class BirdEagleWhenTestBirdEagle {

	
	/** 
	 * Test that animal is properly created
	 */		
	@Test
	public void  birdEagleWhenTestBirdEagle() {
		BirdEagle eagle = new BirdEagle();
		String expect = "Animal kind: eagle, covering: feathers"; 
		String results = eagle.toString();
		assertEquals(expect, results);
	}

	/** 
	 * Test that toString works properly
	 */	
	@Test
	public void birdEagleWhenTestBirdEagleToString() {
		BirdEagle eagle = new BirdEagle();
		String expect = "Animal kind: eagle, covering: feathers"; 
		String results = eagle.toString();
		assertEquals(expect, results);
	}
	
	/** 
	 * Test if correct sound is returned
	 */	
	@Test
	public void birdEagleWhenTestBirdEagleGetSound() {
		BirdEagle eagle = new BirdEagle();
		String expect = "scree"; 
		String results = eagle.getSound();
		assertEquals(expect, results);
	}


	/** 
	 * Test if proper movement is returned
	 */		
	@Test
	public void birdEagleWhenTestBirdEagleGetMovement() {
		BirdEagle eagle = new BirdEagle();
		String expect = "I fly"; 
		String results = eagle.getMovement(true);
		assertEquals(expect, results);
	}
	
	
	/** 
	 * Test that animal is properly created and that
	 * getKind, getCovering return proper values
	 */		
	@Test
	public void  birdEagleWhenTestGetKindGetCovering() {
		BirdEagle eagle = new BirdEagle();
		String expect = "Animal kind: " + eagle.getKind()  + ", covering: " + eagle.getCovering(); 
		String results = eagle.toString();
		assertEquals(expect, results);
	}	
	

}
