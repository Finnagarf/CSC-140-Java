package unit1ex3;
import java.util.Scanner;
/*
Hide Folder Information
Instructions
Zach Stern, a floor tiler doing business as Zach Stern's Tile, needs to know the area of any rectangular floor he's tiling. 
He wants a program that asks for the room's length and width and the cost per square foot of tile. 
The program should calculate and display the room's area in square feet and the cost of the tile needed to cover the room. 
Dollar values should be formatted to two decimal places with a dollar sign in front.

Expected Output:

The room is 300 square feet.

At $25.00 per sq.ft., It will cost $7,500.00 to tile it.*/

public class Unit1ex3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the length of the room: ");
		double length = input.nextDouble();
		
		System.out.println("Enter the width of the room: ");
		double width = input.nextDouble();
		
		System.out.println("Enter the cost per square foot of tile: ");
		double cost = input.nextDouble();
		
		double area = length*width;
		double price = area*cost;
		
		System.out.println("The room is "+area+" square feet.");
		System.out.println("At $"+cost+" per sq.ft., It will cost $"+price+" to tile it.");
		input.close();
	}
}
