package unit2project;

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  
    //the variables I need
    String topping1, topping2, topping3;
    double total, discount;
    Scanner scan = new Scanner(System.in);
    //take user input
    System.out.print("Enter your topping: ");
    topping1 = scan.nextLine();
    
// calculate total and discount
// yogurt adds $1.00,
// tomato adds $0.50,
// lettuce adds $.30,
// skittles add $0.75
    total = 0;
    if(topping1.equals("yogurt")){
      total = total + 1.00;
    }

    //calculate the discount
    
    //output the results
    System.out.print("The total is "+total);
    
  }
}
