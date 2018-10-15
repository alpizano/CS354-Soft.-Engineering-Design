package arrayListTest;

import java.util.ArrayList;


public class arrayListTest {
	
	
	public static void main(String[] args) {
		ArrayList<String> numbers = new ArrayList<String>();
		
		numbers.add("3");
		numbers.add("9");
		numbers.add("2");
		numbers.add("0");
		numbers.add("4");
		numbers.add("12");
		numbers.add("7");
		
		for(int i = 0; i<numbers.size(); i++) {
			System.out.print(numbers.get(i) + " ");
		}
		
	}
	


}
