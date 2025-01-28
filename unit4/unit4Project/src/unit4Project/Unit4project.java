package unit4Project;

import java.util.Scanner;

public class Unit4project {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] nounIdea = {"Happiness", "Courage", "Freedom", "Love", "Knowledge", "Justice", "Peace", "Wisdom"};
		String[] nounObject = {"Dog", "Car", "Table", "Book", "Phone", "House", "Computer", "Tree"};
		String[] adjective = {"Happy", "Tall", "Bright", "Fierce", "Soft", "Beautiful", "Quiet", "Angry"};
        
		
		System.out.print("How many products do you want?\n");
		System.out.print("-----------------------------------\n");
		
		System.out.print("Enter a number: > ");
		int num = input.nextInt();
		System.out.print("-----------------------------------\n");
		
	    
	    for(int i = 0; i < num; i++) {
	    	int randomAdjective = (int) (Math.random() * adjective.length);
			int randomIdea = (int) (Math.random() * nounIdea.length);
			int randomObject = (int) (Math.random() * nounObject.length);
		        
		    String randomProduct = adjective[randomAdjective] +" "+ nounIdea[randomIdea] +" "+ nounObject[randomObject];
	    	System.out.print(randomProduct + "\n");
	    }
		
		
		
	}

}
