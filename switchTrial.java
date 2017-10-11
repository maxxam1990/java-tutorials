/* 
 * This script was created by Max Acosta on 10/11/17
 * The purpose of this class file is to show how to use switch statements with a simple numbers to month program.
 * 
 * DESCRIPTION:
 * In this program, we will use the "java scanner utility" to declare a Scanner which will allow us to receive user's 
 * keyboard input. We will then prompt the user to enter a number from 1 to 12. When they enter their number, 
 * our program will use a switch statement to check the user's input and match the number entered with the 
 * corresponding month of the year. Finally we will print out in a string the month that corresponds to the number the user entered.
 * 
 */


// First we need to declare our import statement. In here, we will import the java.util.scanner utility to allow us 
// to enter input into the console.

import java.util.Scanner;

// We declare our original class
public class switchtrial {
	
	// Declare main method
	 public static void main(String[] args) {
		 	
		 // Declare scanner variable, name is set to reader, but it could be different names as well.
		 Scanner reader = new Scanner(System.in);
			
		 // Prompt the user for an input.
	         System.out.print("Enter a number of a month: ");
	        
	         // Use the previously declared scanner input for accepting user's keyboard input into the console.
		 int month = reader.nextInt();
			
		 // Declare a string called monthstring to store the result of our switch statement.
	         String monthString;
	        
	         // Start our switch function.
	         // This is the format for our switch function: switch (condition variable - what we will be checking) 
	        
		 switch (month) {
	        	// Declare multiple cases to check condition. This is the format: 
			// case {checking condition} : this will happen. Make sure you break the statement when you finish.
			// otherwise, statement will run to the next condition causing unexpected output
	        	case 1:  monthString = "January";
	                     break;
	            	case 2:  monthString = "February";
	                     break;
	            	case 3:  monthString = "March";
	                     break;
	            	case 4:  monthString = "April";
	                     break;
	            	case 5:  monthString = "May";
	                     break;
	            	case 6:  monthString = "June";
	                     break;
	            	case 7:  monthString = "July";
	                     break;
	            	case 8:  monthString = "August";
	                     break;
	            	case 9:  monthString = "September";
	                     break;
	            	case 10: monthString = "October";
	                     break;
	            	case 11: monthString = "November";
	                     break;
	            	case 12: monthString = "December";
	                     break;
	                     
	            	// Always remember to declare a default case. This case will happen when none of the previous 
			// conditions are met.
	            	default: monthString = "Invalid month";
	                     break;
	        	}
	        
	         // Finally, we will print out a simple print out statement, with our monthString variable.
	         System.out.println("The month you chose is " + monthString);
	    }
}
