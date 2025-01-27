package unit3project;

import java.util.Scanner;

public class Unit3project {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Think of a number between 1 and 1000.");
        System.out.println("Respond with 'H' if the guess is too high, 'L' if it's too low, or 'G' if the guess is correct.");
        
        int low = 1;
        int high = 1000;
        int guess = 0;
        int numberOfGuesses = 0;
        
        while (true) {
            guess = (low + high) / 2;  // Guess in the middle of the range
            numberOfGuesses++;
            
            System.out.println("Is the number " + guess + "? (H/L/G)");
            String response = input.nextLine().toUpperCase();
            
            if (response.equals("G")) {
                System.out.println("The computer guessed your number in " + numberOfGuesses + " guesses.");
                
                // Print the number of '#' corresponding to the iteration count
                for (int i = 1; i <= numberOfGuesses; i++) {
                    System.out.println(i + " hip-hip-hooray!");
                }
                break;
            } else if (response.equals("H")) {
                high = guess - 1;  // The guess is too high, adjust the high limit
            } else if (response.equals("L")) {
                low = guess + 1;  // The guess is too low, adjust the low limit
            } else {
                System.out.println("Invalid response. Enter 'H', 'L', or 'G'.");
            }
        }
        
        input.close();
    }
}
