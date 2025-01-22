package unit2Practice;
/*Declare a boolean variable called canVote and assign it an appropriate value.
Declare two int variables and assign values of your choice.
Write a conditional statement to test whether the two values are equal, if true output "true", or if false output "false"
Declare 2 int variables and assign them an int value between 1 and 999
Write conditional statements to output which value is larger.
Declare another int variable and assign it an int value between 1 and 999
Write conditional statements to output which value is in the middle.
Declare a variable called selection with the value of 2. Use a  switch statement to accomplish the following: 
If the user enters 1, display a message saying the color is yellow. 
If the user enters 2, display a message saying the color is blue. 
If the user enters 3, display a message saying the color is red. 
If the user input is not 1, 2, or 3, display a message saying the selection was invalid*/

import java.util.Scanner;
public class Unit2Practice {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	boolean canVote = true;
	int num1 = 5;
	int num2 = 10;
	int num3 = 7;
	String result = (num1 == num2) ? "True" : "False";
	System.out.println(result);
	
	if (num1 < num2) {
		  System.out.println("Number 2 is larger than number 1.");
		} else {
		  System.out.println("Number 1 is larger than number 2.");
		}

	 if ((num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3)) {
         System.out.println(num1 + " is the middle value.");
     } else if ((num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3)) {
         System.out.println(num2 + " is the middle value.");
     } else {
         System.out.println(num3 + " is the middle value.");
     }
	
	 System.out.println("Enter a number 1-3: ");
	 int userInput = input.nextInt();
	 if(userInput == 1) {
		 System.out.println("yellow");
	 } else if (userInput == 2){
		 System.out.println("blue");
	 } else if (userInput == 3) {
		 System.out.println("red");
	 } else {
		 System.out.println("Invalid Input.");
	 }
	 
	
	input.close();
	}

}
