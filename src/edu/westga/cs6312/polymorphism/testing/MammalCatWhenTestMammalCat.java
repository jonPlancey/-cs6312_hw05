package edu.westga.cs6312.polymorphism.testing;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.westga.cs6312.polymorphism.model.MammalCat;

/**
 * Homework Unit Test 
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	02.10.2016
 */
public class MammalCatWhenTestMammalCat {

	

	
	/** 
	 * Test that animal is properly created
	 */		
	@Test
	public void  birdCrowWhenTestMammalCat() {
		MammalCat cat = new MammalCat();
		String expect = "Animal kind: cat, covering: fur"; 
		String results = cat.toString();
		assertEquals(expect, results);
	}

	/** 
	 * Test that toString works properly
	 */	
	@Test
	public void birdCrowWhenTestMammalCatToString() {
		MammalCat cat = new MammalCat();
		String expect = "Animal kind: cat, covering: fur"; 
		String results = cat.toString();
		assertEquals(expect, results);
	}
	
	/** 
	 * Test if correct sound is returned
	 */	
	@Test
	public void birdCrowWhenTestMammalCatGetSound() {
		MammalCat cat = new MammalCat();
		String expect = "meow"; 
		String results = cat.getSound();
		assertEquals(expect, results);
	}


	/** 
	 * Test if proper movement is returned
	 */		
	@Test
	public void birdCrowWhenTestMammalCatGetMovement() {
		MammalCat cat = new MammalCat();
		String expect = "I run on 4 legs"; 
		String results = cat.getMovement(true);
		assertEquals(expect, results);
	}
	
	
	/** 
	 * Test that animal is properly created and that
	 * getKind, getCovering return proper values
	 */		
	@Test
	public void  birdCrowWhenTestGetKindGetCovering() {
		MammalCat cat = new MammalCat();
		String expect = "Animal kind: " + cat.getKind()  + ", covering: " + cat.getCovering(); 
		String results = cat.toString();
		assertEquals(expect, results);
	}	
	

}
