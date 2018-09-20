package cs354assignOne;

import java.util.Scanner;
import java.util.Random;

public class assignOne {

	public static void main(String[] args) {
		
		
		int correctCount = 0;

		String whatOperation = "";
		
		
		
		do {
			
		Random rand = new Random();
		Scanner input = new Scanner(System.in);

		int  num1 = rand.nextInt(100) + 1;
		int  num2 = rand.nextInt(100) + 1;
			
		int wrongCount =0;
			
		System.out.println("Correct counter is at: " + correctCount);
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
			
			if (addAns == keyAdd && correctCount == 0)
			{
				System.out.println("Very good!");
				correctCount = correctCount + 1;
			}
			else if(addAns == keyAdd && correctCount == 1) 
			{
				System.out.println("Excellent!");
				correctCount++;
			}
			else if(addAns ==keyAdd && correctCount >=2 ) 
			{
				System.out.println("Keep up the good work!");
				correctCount++;
			}
			else
			{
				System.out.println("No. Please try again.");
				correctCount = 0;
			}
			break;
			
		case "2":
			System.out.println("Your choice: 2");
			int subAns = num1 - num2;
			System.out.println("How much is " + num1 + " minus " + num2 +"?");
			System.out.println("Enter your answer:");
			int keySub = input.nextInt();
			
			if (subAns == keySub && correctCount == 0)
			{
				System.out.println("Very good!");
				correctCount = correctCount + 1;
			}
			else if(subAns == keySub && correctCount == 1) 
			{
				System.out.println("Excellent!");
				correctCount++;
			}
			else if(subAns == keySub && correctCount >=2 ) 
			{
				System.out.println("Keep up the good work!");
				correctCount++;
			}
			else
			{
				System.out.println("No. Please try again.");
				correctCount = 0;
			}
			break;
			
		case "3":
			System.out.println("Your choice: 3");
			int multiAns = num1*num2;
			
			System.out.println("How much is " + num1 + " times " + num2 +"?");
			System.out.println("Enter your answer:");
			int keyMulti = input.nextInt();
			
			if (multiAns == keyMulti && correctCount == 0)
			{
				System.out.println("Very good!");
				correctCount = correctCount + 1;
			}
			else if(multiAns == keyMulti && correctCount == 1) 
			{
				System.out.println("Excellent!");
				correctCount++;
			}
			else if(multiAns == keyMulti && correctCount >=2 ) 
			{
				System.out.println("Keep up the good work!");
				correctCount++;
			}
			else
			{
				System.out.println("No. Please try again.");
				correctCount = 0;
			}
			break;
			
		case "4":
			System.out.println("Your choice: 4");
			int divAns = num1/num2;
			System.out.println("How much is " + num1 + " divided by " + num2 +"?");
			System.out.println("Enter your answer:");
			int keyDiv = input.nextInt();
			
			if (divAns == keyDiv && correctCount == 0)
			{
				System.out.println("Very good!");
				correctCount = correctCount + 1;
			}
			else if(divAns == keyDiv  && correctCount == 1) 
			{
				System.out.println("Excellent!");
				correctCount++;
			}
			else if(divAns == keyDiv  && correctCount >=2 ) 
			{
				System.out.println("Keep up the good work!");
				correctCount++;
			}
			else
			{
				System.out.println("No. Please try again.");
				correctCount = 0;
			}
			break;
			
		case "5":
			System.out.println("Your choice: 5");
			int modAns = num1%num2;
			System.out.println("How much is the remainder for " + num1 + " divided by " + num2 +"?");
			System.out.println("Enter your answer:");
			int keyMod = input.nextInt();
			
			if (modAns == keyMod && correctCount == 0)
			{
				System.out.println("Very good!");
				correctCount = correctCount + 1;
			}
			else if(modAns == keyMod && correctCount == 1) 
			{
				System.out.println("Excellent!");
				correctCount++;
			}
			else if(modAns == keyMod && correctCount >=2 ) 
			{
				System.out.println("Keep up the good work!");
				correctCount++;
			}
			else
			{
				System.out.println("No. Please try again.");
				correctCount = 0;
			}
			break;
			
		default: 
			System.out.println("You have choosen to exit");
			break;
	}
		}
		while(whatOperation != "other");
	}
}
