/* 
 * This script was created by Max Acosta on 10/11/17
 * The purpose of this class file is to calculate gross pay, taxes, and other fees for employees.
 * 
 * 
 */

// First we need to declare our import statement. In here, we will import the java.util.scanner utility to allow us to enter input into the console.

import java.util.*;

//We declare our original class

public class taxCalculator {
	
	// Declare main method
	public static void main(String[] args) {
		
		// Declare scanner variable, name is set to reader, but it could be different names as well.
		Scanner input = new Scanner(System.in);
		
		// Declare our double variables. These will hold our hours, rate, overtime hours, gross income, overtime pay, federal taxes, fica taxes, state taxes, total taxes, and netpay.
		// We declare them double because there is a possibility we will have rates or hours that are not even, example, 30.5 hours worked under a $12.40 rate.
		double hours, rate, overtimehours, gross, overtimepay, fedtax, fica, statax, totaltax, netpay;
		
		// Prompt the user to enter the hours worked.
		System.out.print("Enter hours worked: ");
		// Store the user's input into the hours variable.
		hours=input.nextDouble();

		// Prompt the user to enter the pay rate.
		System.out.print("Enter pay rate: ");
		// Store the pay rate into the rate variable.
		rate=input.nextDouble();
		
		// We now need to check which hours are going to be considered overtime. Remember, overtime pay rate is increase by a half.
		// We can do this with a simple if else statement.
		
		// First We check if the value entered in the hours variable is greater than 40.
		// If it is, then we will proceed with this condition. If it isn't we proceed to the else condition.
		if (hours > 40) {
		    // Since our hours are more than 40, we need to find out the amount of overtime hours worked. To do this, we can simply subtract 40 from the hours. Example,
			// if the user's hour input is 45, then 45 - 40 = 5 hours of overtime.
			overtimehours = hours-40;
			
			// Now that we have our overtime hours, we will calculate overtime pay. We can do this by multiplying the overtimehours we found before, times the rate * 1.5 {to show that the rate is not 50% higher}
			overtimepay= overtimehours * (rate*1.5);
			// After obtaining the overtime pay and overtime hours, our original hours variable fulfilled its purpose. Therefore, we now set it to 40, our standard pay rate hours.
			// We do this by subtracting the overtime hours from the hours. Example: hours = 45, overtime hours = 5, therefore, 45 - 5 = 40 hours.
			hours = hours - overtimehours;
			// Finally we calculate the gross by multiplying our hours (40) times the rate that was input by the user. Then, we add the overtime pay and this is our gross pay.
			gross = (hours*rate) + overtimepay;
		}
		
		// If the initial condition was not met, then we run this statement.
		// In here, we are simply going to set our gross to the hours (from the user input) times the rate (also input from user)
		else 
		{
			gross = hours * rate;
		}
		
		// This statement will print out the gross pay.
		System.out.println("Gross Pay: $" + gross);

		// We then calculate the Federal Tax by multiplying our gross by 20%, which is an equivalent to 0.2
		fedtax=gross*0.2;
		// This statement will print out the Federal taxes
		System.out.println("Federal Taxes: $" + fedtax);
		
		// We now calculate the FICA taxes by multiplying our gross by 10%, which is an equivalent to 0.1
		fica=gross*0.1;
		// This statement will print out the FICA taxes
		System.out.println("FICA Taxes: $" + fica);
		
		// To find the State taxes, we need to multiply by 5%. Therefore, it's the same thing as multiplying by 0.05
		statax=gross*0.05;
		// This statement will print out the State taxes
		System.out.println("State Taxes: $" + statax);

		// To calculate the total tax, we simply add our three taxes variables.
		totaltax=fedtax+fica+statax;
		// This will print out the total tax
		System.out.println("Total Taxes Paid: $" + totaltax);
		
		// To finish up, we will calculate our netpay by subtracting the total tax from the gross.
		netpay=gross-totaltax;
		// This will print out the net pay
		System.out.println("New Pay: $" + netpay);
		
	}
	
}
