package cs354assignOne;

import java.util.Scanner;

public class assignOne {

	
	public static void main(String[] args) {
		
		String ans = "";
		
		Scanner input = new Scanner(System.in);
		System.out.println("What math operator do you want to perform?");
		ans = input.nextLine();
		
		switch(ans) {

		case "+": 
			System.out.println("Add");
			break;
		case "-":
			System.out.println("Sub ");
			break;
		case "/":
			System.out.println("Div");
			break;
		case "*":
		default: 
			System.out.println("Fuck you");
			break;
	}
}
}
