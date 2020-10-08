package cse360assignment02;

import java.util.*;

public class AddingMachine {
	 private int total;
	 private List<String> listOfValues = new ArrayList<String>();
	 private String firstString = "";
	 private String finalString;
	
	 public AddingMachine () 
	 {
		 total = 0;  // not needed - included for clarity
	 }
	  
	 public int getTotal () //gets the total and returns it
	 {
		 return total;
	 }
	  
	 public void add (int value) //adds the value passed to the total
	 {
		 total = total + value;
		 listOfValues.add(" + " + value);
	 }

	 public void subtract (int value) //subtracts the value passed from the total
	 {
		 total = total - value;
		 listOfValues.add(" - " + value);
	 }

	 public String toString () // creates a string of the history of the values added to the adding machine
	 {
		 for (int i = 0; i < listOfValues.size(); i++)
		 {
			 firstString = firstString + listOfValues.get(i);
			 finalString = "0" + firstString;
		 }
		  
		 return finalString;
	 }

	 public void clear() 
	 {
		 total = 0;
		 listOfValues.clear();
	 }
	  
}
