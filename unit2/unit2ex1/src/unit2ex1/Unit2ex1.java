package unit2ex1;
import java.util.Scanner;
public class Unit2ex1 {


	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int number = 6;

	System.out.print("Guess a number between 1 and 10: ");

	int guess = input.nextInt();

	if (guess > number) {

	System.out.println("Too high");

	}

	else if (guess == number) { 
		System.out.println("You got it!");

	}

	else if (guess < number) { 
		System.out.println("Too low");

	}
	else { 
		System.out.println("Invalid input");

	}

}

}