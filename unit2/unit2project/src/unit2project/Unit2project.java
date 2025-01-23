package unit2project;

import java.util.Scanner;

public class Unit2project {
  public static void main(String[] args) {
    double total = 0.0;
    Scanner scan = new Scanner(System.in);

    System.out.println("Welcome to Chudson's Potato Bar!");
    System.out.println("Available toppings: Yogurt, Tomato, Lettuce, Skittles");


    for (int i = 0; i < 3; i++) {
      System.out.print("Enter topping #" + (i + 1) + ": ");
      String topping = scan.nextLine().toLowerCase(); 

      if (topping.equals("yogurt")) {
        total += 1.00;
      } else if (topping.equals("tomato")) {
        total += 0.50;
      } else if (topping.equals("lettuce")) {
        total += 0.30;
      } else if (topping.equals("skittles")) {
        total += 0.75;
      } else {
        System.out.println("Invalid topping: " + topping + ".");
        i--; 
      }
    }

    System.out.println("Total cost of toppings: $" + total);

    double discount = 0;
    if (total >= 1.00) {
      discount = total * 0.10;
      total -= discount;
      System.out.println("A 10% discount has been applied!");
    }

    System.out.println("Discount: -$" + discount);
    System.out.println("Final total after discount: $" + total);
  }
}
