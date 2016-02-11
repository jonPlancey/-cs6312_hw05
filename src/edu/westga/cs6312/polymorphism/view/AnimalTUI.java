package edu.westga.cs6312.polymorphism.view;

import edu.westga.cs6311.roster2.model.Student;
import edu.westga.cs6312.polymorphism.model.Animal;
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
		do {
			this.displayMenu();
			this.displayMenuInput();
		}
		while (this.userchoice < 6);
		System.out.print("Thank you.");
	}	
	
	/**
	 * Displays the following numbered 
	 * list of menu options on the console:
	 **/
	public void displayMenu() {		
		System.out.println("1 - Add a student");
		System.out.println("2 - Remove a student"); 
		System.out.println("3 - Update a student");
		System.out.println("4 - Display class statistics");
		System.out.println("5 - Display grading breakdown"); 
		System.out.println("6 – Quit\n");	
	}	
	
	/**
	 * main menu options
	 * prompt user to select 1-6
	 **/
	public void displayMenuInput() {
		System.out.print("Select a menu item between 1 and 6: ");
		this.userchoice = Integer.parseInt(this.userKeyboard.nextLine());
		this.selectionCategories();
	}	
	
	
	/**
	 * decides what functions execute based on user input
	 **/	
	public void selectionCategories() {		
		switch (this.userchoice) {
			case 1:	
				System.out.println("\n    [1 Add a student]");	   
	    		this.addStudent();
				break;
	        case 2: 
	        	System.out.println("\n*   [2 Remove a student]");
	        	this.removeStudent();
	            break;
	        case 3: 
	        	System.out.println("\n*   [3 Update a student]");
	        	this.updateStudent();
	            break;
	        case 4: 	    		
	        	System.out.println("\n    [4 Display class statistics]");
	        	this.displayStatistics();	        	
	            break;
	        case 5: 
	        	System.out.println("\n    [5 Display grading breakdown]");
	        	this.gradingBreakdown();	        	
	        	break;
	        case 6: 
	        	System.out.println("\n    [6 Quit]");
	        	System.out.println("    We hope you enjoyed this program.");
	            break;
	        default: 
	        	System.out.print("Not valid input. ");
	        	this.displayMenuInput();
	        	break;		
		}	
	}
	

	/**
	 * prompts and captures input to add student roster
	 **/	
	public void addStudent() {
		String firstName = "";
		String lastName = "";
		int grade = -1;
		
		while (firstName.equals("")) {
			System.out.print("Enter first name:    ");
			firstName = this.userKeyboard.nextLine();
        }		
		while (lastName.equals("")) {
			System.out.print("Enter last name:     ");	
			lastName = this.userKeyboard.nextLine();
        }
		while (!(grade >= 0 && grade <= 100)) {
			System.out.print("Enter numeric grade: ");
			grade = Integer.parseInt(this.userKeyboard.nextLine());
        }
		Student student = new Student(firstName, lastName, grade);	
		this.studentRoster.addStudent(student);
		System.out.println(SPACE);

	}
	
	/**
	 * prompts and captures input to remove student roster
	 **/	
	public void removeStudent() {
		String lastName = "";
		
		while (lastName.equals("")) {
			System.out.print("Enter last name:     ");	
			lastName = this.userKeyboard.nextLine();
        }
		while (this.studentRoster.findStudent(lastName) == null) {
			System.out.print("Last name not found, try again: ");	
			lastName = this.userKeyboard.nextLine();
        }	
		
		this.studentRoster.removeStudent(lastName);
		
		if (this.studentRoster.findStudent(lastName) == null) {
			System.out.print("* record containing " + lastName + " has been successfully deleted.");
		}
		System.out.println(SPACE);
	}	

	/**
	 * prompts and captures input to update student roster
	 **/	
	public void updateStudent() {	
		String lastName = "";
		int gradeNew = -1;
		int gradeOld = -1;
		
		while (lastName.equals("")) {
			System.out.print("Enter last name:     ");	
			lastName = this.userKeyboard.nextLine();
        }
		while (this.studentRoster.findStudent(lastName) == null) {
			System.out.print("Last name not found, try again: ");	
			lastName = this.userKeyboard.nextLine();
        }	
		while (!(gradeNew >= 0 && gradeNew <= 100)) {
			System.out.print("Enter numeric grade: ");
			gradeNew = Integer.parseInt(this.userKeyboard.nextLine());
        }				
		gradeOld = this.studentRoster.findStudent(lastName).getGrade();
		
		this.studentRoster.updateGrade(lastName, gradeNew);

		System.out.print("    -> " + lastName + "'s grade changed from " + gradeOld + " to " + gradeNew);
		System.out.println(SPACE);
	}
	
	/**
	 * print to the console the results of calling the 
	 * Roster instance variable's toString() method.
	 **/	
	public void displayStatistics() {	
		System.out.println(this.studentRoster.toString());

	}
	
	/**
	 * displays grading breakdown and histogram
	 */		
	public void gradingBreakdown() {
		System.out.println("\n    statistics: \n" + this.studentRoster.getGradingBreakdown());
		System.out.println("    histogram:\n" + this.studentRoster.getGradingHistogram());			
	}
}
