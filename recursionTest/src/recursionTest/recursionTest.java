

package recursionTest;

import java.util.Scanner;


public class recursionTest {
	
	
	public static void myFun(int number) {
		if(number == 0) {
			return;
		}
		myFun(number/2);
		System.out.print(number%2 + " ");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		myFun(8);
		
	}
	
	
}
