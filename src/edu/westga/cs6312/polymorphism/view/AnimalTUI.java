package edu.westga.cs6312.polymorphism.view;

import edu.westga.cs6312.polymorphism.model.Animal;
import edu.westga.cs6312.polymorphism.model.BirdCrow;
import edu.westga.cs6312.polymorphism.model.BirdEagle;
import edu.westga.cs6312.polymorphism.model.MammalCat;
import edu.westga.cs6312.polymorphism.model.MammalDog;

import java.util.Scanner;
import java.util.ArrayList;


/**
 * Homework HW05  
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	02.10.2016
 */
public class AnimalTUI {
	
	private Scanner userKeyboard;
	private ArrayList<Animal> animals;

	
	/**
	 * initialize the instance variable(s).
	 */	
	public AnimalTUI() {
		this.userKeyboard = new Scanner(System.in);
		this.animals = new ArrayList<Animal>();
	}
	
	
	/**
	 * controls program flow 
	 **/
	public void run() {
		int userchoice = 0;	
		
		this.displayMenu();		
		
		while (!(userchoice > 0 && userchoice < 1)) {
			try {
				userchoice = Integer.parseInt(this.userKeyboard.nextLine());
			} catch (NumberFormatException error) {
				System.out.println("Sorry: [ " + this.getErrorString(error) + " ] is not valid. Enter a number between 1 and 3. \n");
			}
			this.selectionCategories(userchoice);
        }
	}	
	
	
	
	/**
	 * Displays the following numbered 
	 * list of menu options on the console:
	 **/
	public void displayMenu() {
		System.out.println("Welcome to the animal collection application");		
		System.out.println("1 - Add an animal to the list");
		System.out.println("2 - Print the animals in the list"); 
		System.out.println("3 – Quit\n");	
	}
	
	/**
	 * main menu options
	 * prompt user to select 1-3
	 * @param userChoice users menu selection
	 **/
	public void displayMenuInput(int userChoice) {			
		try {
			userChoice = Integer.parseInt(this.userKeyboard.nextLine());
		} catch (NumberFormatException error) {
			System.out.println("Sorry: [ " + this.getErrorString(error) + " ] is not valid. Enter a number between 1 and 3. \n");
		}
		this.selectionCategories(userChoice);
	}	
	
	
	
	/**
	 * Decides what functions execute based on user input
	 * @param userchoice user's menu selection
	 **/	
	public void selectionCategories(int userchoice) {		
		switch (userchoice) {
			case 1:	
				System.out.println("\n    [1 Add a animal]");	   
	    		this.addAnimal();
	    		this.displayMenu();
	    		this.displayMenuInput(userchoice);	
				break;
	        case 2: 
	        	System.out.println("\n*   [2 Display list of animals]");
	        	this.displayAnimals();
	            break;
	        case 3: 
	        	System.out.println("\n    [3 Quit]");
	        	System.out.println("    We hope you enjoyed this program.\n\n");
	            break;
	        default: 
	        	System.out.print("Not valid input. \n\n");
	        	this.displayMenu();
	        	break;		
		}	
	}	

	/**
	 * Display list of animals
	 **/
	public void displayAnimals() {	
		String result = "";
		
		for (Animal currentAnimal : this.animals) {
			result += "    " + currentAnimal.toString() + "\n";
		}	
		System.out.println(result);
	}
	
	
	/**
	 * prompts and captures input to add animal to animal collection
	 **/	
	public void addAnimal() {
		String name = "";

		while (name.equals("")) {
			System.out.print("What kind of animal would you like: ");
			name = this.userKeyboard.nextLine();
        }

		if (BirdEagle.getNewAnimal(name) == null) {
			System.out.print("That's not a valid animal type: ");
		}
		
		if (name.equals("eagle")) {
			BirdEagle eagle = new BirdEagle();		
			this.animals.add(eagle);
		}
		if (name.equals("crow")) {
			BirdCrow birdCrow = new BirdCrow();	
			this.animals.add(birdCrow);
		}
		if (name.equals("cat")) {
			MammalCat mammalCat = new MammalCat();		
			this.animals.add(mammalCat);
		}
		if (name.equals("dog")) {
			MammalDog mamalDog = new MammalDog();		
			this.animals.add(mamalDog);
		}		
		
		System.out.println("\n");
	}
	
	
	/**
	 * provides specific text that causes input errors 
	 * @param error accepts ERROR from try catch 
	 * @return returns the value\input responsible for error
	 */
	private String getErrorString(NumberFormatException error) {
		int first = error.getMessage().indexOf("\"", 0) + 1; 
		int second = error.getMessage().lastIndexOf("\"");
	
		return error.getMessage().substring(first, second);		
	}	
}
