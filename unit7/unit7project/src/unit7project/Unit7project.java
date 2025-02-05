package unit7project;
import java.util.Random;
import java.util.Scanner;

public class Unit7project {

	enum Fruit {
		orange,
		lemon,
		cherry
		}
	
	 private Fruit currentFruit;

    // Constructor to set the fruitSlot with an input fruit value
	 public Unit7project(Fruit initialFruit) {
	        this.currentFruit = initialFruit;
	    }
    
	 @Override
	    public String toString() {
	        return "The selected fruit is: " + currentFruit;
	    }
    //Spin method to set the enumerated variable to a random fruit value
    public void spin(){
    	Random random = new Random();
    	int randomIndex = random.nextInt(Fruit.values().length);
        this.currentFruit = Fruit.values()[randomIndex];
    }
    
    // Getter method for the current fruit
    public Fruit getCurrentFruit() {
        return currentFruit;
    }

    // Setter method for the current fruit
    public void setCurrentFruit(Fruit fruit) {
        this.currentFruit = fruit;
    }
    
	public static void main(String[] args) {
		 // Create a Slot object with an initial fruit (e.g., ORANGE)
		Unit7project slot1 = new Unit7project(Fruit.orange);
		Unit7project slot2 = new Unit7project(Fruit.cherry);
		Unit7project slot3 = new Unit7project(Fruit.lemon);
        
        // Print the initial fruit
        System.out.println(slot1);
        System.out.println(slot2);
        System.out.println(slot3);
        
        int i = 0;
        int num = 8;
        
        Scanner input = new Scanner(System.in);
        
        while (i != 1) {
            // Spin the slot (randomly change the fruit)
            slot1.spin();
            slot2.spin();
            slot3.spin();
            num = 8;
            
            // Print the result after spinning the slot
            System.out.println("After spinning:");
            System.out.println(slot1);
            System.out.println(slot2);
            System.out.println(slot3);
            
            // Check if the player won
            if (slot1.getCurrentFruit() == slot2.getCurrentFruit() && slot2.getCurrentFruit() == slot3.getCurrentFruit()) {
                System.out.println("You won!");
                i = 1;
            } else {
                System.out.println("You Lose!");
                
                // Get user input for next action
                System.out.println("Enter a number to spin again (or 0 to quit):");
                num = input.nextInt();
                
                if (num == 0) {
                    break; // Exit the loop if the user enters 0
                } else if (num < 0) {
                    continue; // Continue the loop if the user enters a negative number
                }
            }
    	 
    	 }
     }
}
