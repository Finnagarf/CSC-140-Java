package unit5ex3;

//Main class of the project
public class Unit5ex3 {
	// Main entry point of the program
    public static void main(String[] args) {

        class Ship {
            public int cannons;
            public double treasure;
        }
        class ShipCaptain {
            public String shipName;
            public int crewSize;
        }
        class Navigator {
            public Boolean canReadStars;
            public double sailingSpeed;
        }

        // Creating Ship objects
        Ship blackPearl = new Ship();
        //assigning values to the object's attributes
        blackPearl.cannons = 50;
        blackPearl.treasure = 0;

        Ship queenAnnesRevenge = new Ship();
        //assigning values to the object's attributes
        queenAnnesRevenge.cannons = 100;
        queenAnnesRevenge.treasure = 50;

        // Creating ShipCaptain objects
        ShipCaptain jackSparrow = new ShipCaptain();
        //assigning values to the object's attributes
        jackSparrow.shipName = "Black Pearl";
        jackSparrow.crewSize = 12;

        ShipCaptain blackbeard = new ShipCaptain();
        //assigning values to the object's attributes
        blackbeard.shipName = "Queen Anne's Revenge";
        blackbeard.crewSize = 300;

        // Creating Navigator objects
        Navigator firstNavigator = new Navigator();
        //assigning values to the object's attributes
        firstNavigator.canReadStars = false;
        firstNavigator.sailingSpeed = 100.5;

        Navigator secondNavigator = new Navigator();
        //assigning values to the object's attributes
        secondNavigator.canReadStars = true;
        secondNavigator.sailingSpeed = 600.43;

        // Describing each object
        System.out.println("\nI am the mighty ship 'Black Pearl'.\nI carry " + blackPearl.cannons + " cannons and currently have " + blackPearl.treasure + " gold pieces in treasure.");
        System.out.println("\nI am the mighty ship 'Queen Anne's Revenge'.\nI carry " + queenAnnesRevenge.cannons + " cannons and " + queenAnnesRevenge.treasure + " gold pieces of treasure.");

        System.out.println("\nAhoy! I am Captain Jack Sparrow.\nI command the legendary 'Black Pearl', with a crew of " + jackSparrow.crewSize + " sailors.");
        System.out.println("\nArrr! I be Captain Blackbeard.\nI lead 'Queen Anne's Revenge' with a fearsome crew of " + blackbeard.crewSize + " pirates.");

        System.out.println("\nI am the first navigator aboard the ship.\nI cannot read the stars, but I sail at a speed of " + firstNavigator.sailingSpeed + " knots.");
        System.out.println("\nI be the second navigator.\nI can read the stars and sail with incredible speed, reaching " + secondNavigator.sailingSpeed + " knots.");
        }
}

