package unit4practice;

public class Unit4practice {

	public static void main(String[] args) {

		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars[2]);
		cars[1] = "Acura";
		System.out.println(cars.length);
		
		for (int i = 0; i < cars.length; i++) {
			  System.out.println(cars[i]);
			}
		String[] pets = {"dog", "cat", "fish", "bird"};
		String[][] combinedArray = new String[2][];
        
        combinedArray[0] = cars;  
        combinedArray[1] = pets;
        
        for (int i = 0; i < combinedArray.length; i++) {
            for (int j = 0; j < combinedArray[i].length; j++) {
                System.out.println(combinedArray[i][j]);
            }
        }
	}

}
