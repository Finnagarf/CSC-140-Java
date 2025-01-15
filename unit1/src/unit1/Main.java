package unit1;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner myObj = new Scanner(System.in);
    String name = "Levi";
    char theCharacter = 'j';
    double interestRate = 6;
    
    System.out.println(name);
    System.out.println(theCharacter);
    System.out.println(interestRate);
    
    System.out.println("Enter a value: ");
    int userInput = myObj.nextInt();
    myObj.nextLine(); // Consume the newline character after nextInt()
    
 
    System.out.println("Enter your name: ");
    String theName = myObj.nextLine();
    

    System.out.println("Enter your age: ");
    int theAge = myObj.nextInt();
    myObj.nextLine(); // Consume the newline character after nextInt()
    

    int blinks = 200;
    int minutes = 7;
    double blinksPerMinute = (double) blinks / minutes;
    

    System.out.printf("Blinks per minute: ", blinksPerMinute);
    

    System.out.println("Enter your account balance: ");
    double accountBalance = myObj.nextDouble();
    
    System.out.printf("Account balance: %.2f%n", accountBalance);
    
    myObj.close();
  }
}
