package cs354assignOne;

import java.util.Scanner;
import java.util.Random;



public class assignOne {

	
	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner input = new Scanner(System.in);

		int  num1 = rand.nextInt(100) + 1;
		int  num2 = rand.nextInt(100) + 1;
	
		String ans = "";
		
		System.out.println("What math operator do you want to perform?");
		ans = input.nextLine();
		
		System.out.println("The first random number is: " + num1);
		System.out.println("The second random number is: " + num2);
		
		switch(ans) {

		case "+": 
			System.out.println("Add");
			int addAns = num1 + num2;
			System.out.println(addAns);
			break;
		case "-":
			System.out.println("Sub ");
			int subAns = num1 - num2;
			System.out.println(subAns);
			break;
		case "/":
			System.out.println("Div");
			int divAns = num1/num2;
			System.out.println(divAns);
			break;
		case "*":
			System.out.println("Multi");
			int multiAns = num1*num2;
			System.out.println(multiAns);
			break;
		default: 
			System.out.println("Fuck you");
			break;
	}
}
}
