package unit3ex2;

import java.util.Scanner;

public class Unit3ex2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("choose a number 100-999: ");
		int num = input.nextInt();
		
		for(int i = 0; i < num; i+=13) {
			System.out.print(i+"\n");
		}

	}

}

