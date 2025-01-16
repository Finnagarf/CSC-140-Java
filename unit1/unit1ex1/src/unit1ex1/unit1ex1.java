package unit1ex1;
//public class unit1ex1 {
	import java.util.Scanner;

class Main {
public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("Please enter your goal in number of sales: ");

	int total = input.nextInt();

	System.out.println("How many days do you have to complete your goal? ");

	int days = input.nextInt();

	double numberPerDay = total/days;

	System.out.println("You will need to make " + numberPerDay + " sales each day in order to reach your goal of " + total + " in " + days + " days");
	input.close();
}
}