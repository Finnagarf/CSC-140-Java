package unit3CodeIndentationExercise;

import java.util.Scanner;

public class Unit3CodeIndentationExercise {

	public static void main(String[] args) {
		//declarations
		Scanner scan = new Scanner(System.in);
		String name;
		int myNum;
		//name thing
		System.out.println("Welcome to my Program");
		System.out.println("What is your name?");
		name = scan.nextLine();
		theConditions(name);
		//loop thing
		System.out.println("1, 2 or 3?");
		myNum = Integer.parseInt(scan.nextLine());
		System.out.println(theLoop(myNum, name));
		scan.close();
	}
	
	public static void theConditions(String name) {
		if (name.equals("Steve")) {
			System.out.println("Hi, Steve.");
		} else {
			System.out.println("YOU AREN'T STEVE!?");
		}
	}
	
	public static String theLoop(int loopNum, String name) {
		for (int i = 0; i < loopNum; i++) {
			System.out.println(name);
		}
		return "Here is your name " + loopNum + " times.";
	}
}