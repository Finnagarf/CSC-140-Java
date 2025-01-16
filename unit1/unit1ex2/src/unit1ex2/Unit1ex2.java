package unit1ex2;
/*Brianna Watt, a consultant doing business as Watt Gives, wants a program to create an invoice for consulting services. 
 * Normally, she works on a project for three days before sending an invoice. 
 * She writes down the number of hours worked total and needs a program that asks for these amounts, totals them, and multiplies 
 * the amount by her standard rate of $30.65 per hour. The invoice should include Brianna's business name, the client's business name,
 *  the total number of hours worked, the rate, and the total amount billed. The information will be displayed onscreen.

Expected Output:

Brianna Watt DBA Watt Gives
Invoice for Grunge Inc. 
Hours: 20
Rate: $30.65
Total: $613
*/

import java.util.Scanner;

public class Unit1ex2 {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	System.out.println("Brianna Watt DBA Watt Gives \nInvoice for Grunge Inc.");
	
	System.out.println("Enter the number of hours worked: ");
	int hours = input.nextInt();
	
	double rate = 30.65;
	
	double total = hours * rate;
		
	System.out.println("Hours: "+ hours);
	System.out.println("Rate: $"+ rate);
	System.out.println("Total: $"+ total);

	input.close();
	}

}
