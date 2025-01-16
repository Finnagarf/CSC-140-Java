package unit1Project1;

import java.util.Scanner;

/*
Hide Folder Information
Instructions
Create a new Java Repl.it and name it Java Project 1.  Write the following program.

The program should ask the user for the following data and store it in variables of the indicated data types:

name - string
first initial - character
last initial - character
a number - integer
another number - integer

The program should calculate the following arithmetic results for the numbers:

number 1 plus number 2
number 1 minus number 2
number 1 times number 2
number 1 divided by number 2

The program should display the user's entered name followed by a tab and then both of the user's initials

It should then display the calculations it performed along with the results.
Any calculations which could result in decimal values should display 2 decimal places*/
public class Project1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		System.out.println("Enter your first inital: ");
		char firstInital = input.next().charAt(0); 
		System.out.println("Enter your last inital: ");
		char lastInital = input.next().charAt(0); 
		System.out.println("Enter a num: ");
		double num1 = input.nextDouble();
		System.out.println("Enter another num: ");
		double num2 = input.nextDouble();
		
		System.out.println(name+"\t"+firstInital+lastInital);
		System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, num1 + num2);
        System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, num1 - num2);
        System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, num1 * num2);
        System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, num1 / num2);
		
		input.close();
	}

}
