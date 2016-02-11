package edu.westga.cs6312.polymorphism.controller;

import edu.westga.cs6312.polymorphism.view.AnimalTUI;

/**
 * Homework HW05  
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	02.10.2016
 */
public class AnimalDriver {

	/**
	 * This method is the entry point of the application
	 * @param args Command line arguments, not used
	 */ 
	public static void main(String[] args) {
		AnimalTUI gui = new AnimalTUI();
		gui.run();				

	}

}
