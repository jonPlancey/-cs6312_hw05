package edu.westga.cs6312.polymorphism.testing;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.westga.cs6312.polymorphism.model.BirdCrow;



/**
 * Homework Unit Test 
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	02.10.2016
 */
public class BirdCrowWhenTestBirdCrow {
	

	
	/** 
	 * Test that animal is properly created
	 */		
	@Test
	public void  birdCrowWhenTestBirdCrow() {
		BirdCrow crow = new BirdCrow();
		String expect = "Animal kind: crow, covering: feathers"; 
		String results = crow.toString();
		assertEquals(expect, results);
	}

	/** 
	 * Test that toString works properly
	 */	
	@Test
	public void birdCrowWhenTestBirdCrowToString() {
		BirdCrow crow = new BirdCrow();
		String expect = "Animal kind: crow, covering: feathers"; 
		String results = crow.toString();
		assertEquals(expect, results);
	}
	
	/** 
	 * Test if correct sound is returned
	 */	
	@Test
	public void birdCrowWhenTestBirdCrowGetSound() {
		BirdCrow crow = new BirdCrow();
		String expect = "caw"; 
		String results = crow.getSound();
		assertEquals(expect, results);
	}


	/** 
	 * Test if proper movement is returned
	 */		
	@Test
	public void birdCrowWhenTestBirdCrowGetMovement() {
		BirdCrow crow = new BirdCrow();
		String expect = "I fly"; 
		String results = crow.getMovement(true);
		assertEquals(expect, results);
	}
	
	
	/** 
	 * Test that animal is properly created and that
	 * getKind, getCovering return proper values
	 */		
	@Test
	public void  birdCrowWhenTestGetKindGetCovering() {
		BirdCrow crow = new BirdCrow();
		String expect = "Animal kind: " + crow.getKind()  + ", covering: " + crow.getCovering(); 
		String results = crow.toString();
		assertEquals(expect, results);
	}	
	

}
