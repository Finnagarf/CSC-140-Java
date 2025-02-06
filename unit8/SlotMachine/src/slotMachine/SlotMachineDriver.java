package slotMachine;

import java.util.Scanner;

public class SlotMachineDriver {

    public static void main(String[] args) {
        // Create a SlotMachine instance
        SlotMachine machine = new SlotMachine();
        Scanner input = new Scanner(System.in);

        int spinCount = 0;

        // Loop until the player wins or decides to quit
        while (true) {
            // Spin the slot machine
            machine.spin();
            spinCount ++;
            // Print the results
            System.out.println("After spinning:");
            System.out.println(machine);

            // Check if all slots match
            if (machine.getSlot1().getCurrentFruit() == machine.getSlot2().getCurrentFruit() &&
                machine.getSlot2().getCurrentFruit() == machine.getSlot3().getCurrentFruit()) {
                System.out.println("JACKPOT!!!! You win!");
                System.out.println("It took " + spinCount +" spins to win.");
                break;
            } else {
                System.out.println("You lose. 99% of gamblers quit right before they win big!");
            }

            // Ask the player whether to spin again or quit
            System.out.println("Enter 1 to spin again or 0 to quit:");
            int choice = input.nextInt();
            if (choice == 0) {
                break;
            }
        }

        input.close();
    }
}
