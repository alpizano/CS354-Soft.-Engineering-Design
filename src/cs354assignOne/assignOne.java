package cs354assignOne;

import java.util.Scanner;
import java.util.Random;



public class assignOne {

	
	public static void main(String[] args) {
		
		
	
		String whatOperation = "";
		
		
		do {
			
			Random rand = new Random();
			Scanner input = new Scanner(System.in);

			int  num1 = rand.nextInt(100) + 1;
			int  num2 = rand.nextInt(100) + 1;
			
		System.out.println("Enter 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division, 5 for remainder, other for Exit.");
		whatOperation = input.nextLine();
		
		System.out.println("The first random number is: " + num1);
		System.out.println("The second random number is: " + num2);
		
		switch(whatOperation) {

		case "1": 
			System.out.println("Your choice: 1");
			int addAns = num1 + num2;
			System.out.println("How much is the sum of " + num1 + " and " + num2 +"?");
			System.out.println("Enter your answer:");
			int keyAdd = input.nextInt();
			if (addAns == keyAdd)
			{
				System.out.println("You are correct!");
			}
			else
				System.out.println("No. Please try again.");
			break;
		case "2":
			System.out.println("Your choice: 2");
			int subAns = num1 - num2;
			System.out.println(subAns);
			break;
		case "3":
			System.out.println("Your choice: 3");
			int multiAns = num1*num2;
			System.out.println(multiAns);
			break;
		case "4":
			System.out.println("Your choice: 4");
			int divAns = num1/num2;
			System.out.println(divAns);
			break;
		default: 
			System.out.println("You have choosen to exit");
			break;
	}
		}
		while(whatOperation != "other");
		
		
}
}
