package unit6project;

public class Unit6project {

    public static class Flight {
        // Instance variables
        String shuttleName;
        int missionNumber;
        String originCity;
        String originState;
        int numberOfPassengers;
        String cargoType;
    
        // Constructor to initialize all attributes
        public Flight(String shuttleName, int missionNumber, String originCity, String originState, int numberOfPassengers, String cargoType) {
            this.shuttleName = shuttleName;
            this.missionNumber = missionNumber;
            this.originCity = originCity;
            this.originState = originState;
            this.numberOfPassengers = numberOfPassengers;
            this.cargoType = cargoType;
        }
    
        public String getFlightDescription() {
            return "Flight " + shuttleName + " (Mission #" + missionNumber + ") is departing from " + originCity + ", " + originState +
                   " with " + numberOfPassengers + " passengers, carrying " + cargoType + " to Mars.";
        }
        
        public void setNumberOfPassengers(int newNumberOfPassengers) { //setter method to set new number of passengers 
            this.numberOfPassengers = newNumberOfPassengers;
        }
        // Getter method to retrieve shuttleName
        public String getShuttleName() {
            return shuttleName;
        }
    }
    
    public static void main(String[] args) {
        Flight flight1 = new Flight("Monica 17", 1, "Jonestown", "Mississippi", 2, "People");
        Flight flight2 = new Flight("Levi 18", 2, "Urbana", "Illinois", 100, "Supplies");
        Flight flight3 = new Flight("Vogel 2", 3, "Kirchberg an der Wild", "Southern Austria", 15, "Auxilary items");
        
        
        flight2.setNumberOfPassengers(50);
        

        System.out.println("Shuttle Name of flight2: " + flight2.getShuttleName());
        
        System.out.println(flight1.getFlightDescription());
        System.out.println(flight2.getFlightDescription());
        System.out.println(flight3.getFlightDescription());
        
    }
    
}
