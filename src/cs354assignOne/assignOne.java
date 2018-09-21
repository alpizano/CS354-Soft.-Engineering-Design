/*
 * Alberto Pizano
 * CS354 Software Engineering Design
 * Purdue University - Northwest
 * 9/19/2018
 */


package cs354assignOne;

import java.util.Scanner;
import java.util.Random;

public class assignOne {
	
	/*
	public static int addFunct(int num1, int num2) {
		
	}
*/
	public static void main(String[] args) {
		
	
		String whatOperation = "";
		
		
		int correctCount = 0;
		
		do {
		boolean correctFlag  = false;
		Random rand = new Random();
		String contOrNot = "";
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		int wrongCount = 0;
		int attemptCount = 0;
		int totalCount = correctCount + wrongCount;
		int totAttempts = totalCount + attemptCount;
	
		int  num1 = rand.nextInt(100) + 1;
		int  num2 = rand.nextInt(100) + 1;
		int keyAdd;	
		int addAns = 0;
		
		//first line ran after loop restarts
		System.out.println("current correctCount is: " + correctCount);
		System.out.println("Enter 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division, 5 for remainder, other for Exit.");
		whatOperation = input.nextLine();
		
		switch(whatOperation) {
		case "1": 
			System.out.println("Your choice: 1");
			addAns = num1 + num2;
			
			System.out.println("How much is the sum of " + num1 + " and " + num2 +"?");
			System.out.println("Enter your answer:");
			keyAdd = input.nextInt();
			
			if (addAns == keyAdd && correctCount == 0)
			{
				System.out.println("Very good!");
				correctCount++;
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
				wrongCount++; //marks first wrong answer
				correctCount = 0; //resets counter
				
				while(wrongCount <= 4 && correctFlag == false) 
				{
				
				if(wrongCount == 1 ) //1st wrong answer
				{
					System.out.println("How much is the sum of " + num1 + " and " + num2 +"?");
					System.out.println("Enter your answer:");
					keyAdd = input.nextInt();
					
					if(addAns == keyAdd) 
					{
						System.out.println("Very good");
						correctFlag = true;
						//wrongCount = 5;
						correctCount++;
						attemptCount++;
					}
					else 
					{
						System.out.println("Wrong. Try once more.");
						wrongCount++;
						attemptCount++;
					}	
				}
				else if (wrongCount == 2) 
				{
					System.out.println("How much is the sum of " + num1 + " and " + num2 +"?");
					System.out.println("Enter your answer:");
					keyAdd = input.nextInt();
					
					if(addAns == keyAdd) {
						System.out.println("Very good");
						correctFlag = true;
						correctCount++;
						attemptCount++;
					}
					else 
					{
						System.out.println("Don't give up!");
						wrongCount++;
						attemptCount++;
					}	
					
				}
				else if (wrongCount == 3) 
				{
					System.out.println("How much is the sum of " + num1 + " and " + num2 +"?");
					System.out.println("Enter your answer:");
					keyAdd = input.nextInt();
					
					if(addAns == keyAdd) 
					{
						System.out.println("Very good");
						correctFlag = true;
						correctCount++;
						attemptCount++;
						
					}
					else 
					{
						System.out.println("No, keep trying");
						wrongCount++;	
						attemptCount++;
					}	
					
				}
				else if (wrongCount == 4) 
				{
					System.out.println("How much is the sum of " + num1 + " and " + num2 +"?");
					System.out.println("Enter your answer:");
					keyAdd = input.nextInt();
					
					if(addAns == keyAdd) {
						System.out.println("Very good");
						correctFlag = true;
						correctCount++;
						attemptCount++;
					}
					
				else 
					{
						System.out.println("Type \"exit\" to try another problem or \"continue\" to attempt this problem again.");
						contOrNot = input2.nextLine();
						
						System.out.println("You typed: " + contOrNot);
						
						if(contOrNot.equals("continue"))
						{
							 //resets wrong counter all over again, and entire loop starts again for user to attempt again
							wrongCount = 1;
							System.out.println("The wrong count is: " + wrongCount);
						}
						
						if(contOrNot.equals("exit"))
						{
							wrongCount++;
							System.out.println("The wrong count is: " + wrongCount);
						}
					} // closing brace for last else	
				} // closing for else if == 4
				
			} // closing brace for while loop
				
		} // closing for else conditional
			break;
//--------------------------------------------------------------------------------------------------------------------------
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
				wrongCount++; //marks first wrong answer
				correctCount = 0; //resets counter
				
				while(wrongCount <= 4) 
				{
				
				if(wrongCount == 1 ) //1st wrong answer
				{
					System.out.println("How much is " + num1 + " minus " + num2 +"?");
					System.out.println("Enter your answer:");
					keySub = input.nextInt();
					
					if(subAns == keySub) 
					{
						System.out.println("Very good");
						wrongCount = 5;
						correctCount++;
						attemptCount++;
					}
					else 
					{
						System.out.println("Wrong. Try once more.");
						wrongCount++;
						attemptCount++;
					}	
				}
				else if (wrongCount == 2) 
				{
					System.out.println("How much is " + num1 + " minus " + num2 +"?");
					System.out.println("Enter your answer:");
					keyAdd = input.nextInt();
					
					if(subAns == keySub) {
						System.out.println("Very good");
						correctCount++;
						attemptCount++;
					}
					else 
					{
						System.out.println("Don't give up!");
						wrongCount++;
						attemptCount++;
					}	
					
				}
				else if (wrongCount == 3) 
				{
					System.out.println("How much is " + num1 + " minus " + num2 +"?");
					System.out.println("Enter your answer:");
					keyAdd = input.nextInt();
					
					if(subAns == keySub) 
					{
						System.out.println("Very good");
						correctCount++;
						attemptCount++;
						
					}
					else 
					{
						System.out.println("No, keep trying");
						wrongCount++;	
						attemptCount++;
					}	
					
				}
				else if (wrongCount == 4) 
				{
					System.out.println("How much is " + num1 + " minus " + num2 +"?");
					System.out.println("Enter your answer:");
					keyAdd = input.nextInt();
					
					if(subAns == keySub) {
						System.out.println("Very good");
						correctCount++;
						attemptCount++;
					}
					
				else 
					{
						System.out.println("Type \"exit\" to try another problem or \"continue\" to attempt this problem again.");
						contOrNot = input2.nextLine();
						
						System.out.println("You typed: " + contOrNot);
						
						if(contOrNot.equals("continue"))
						{
							 //resets wrong counter all over again, and entire loop starts again for user to attempt again
							wrongCount = 1;
							System.out.println("The wrong count is: " + wrongCount);
						}
						// exits to selection screen
						if(contOrNot.equals("exit"))
						{
							wrongCount++;
							System.out.println("The wrong count is: " + wrongCount);
						}
					} // closing brace for last else	
				} // closing for else if == 4
				
			} // closing brace for while loop
				
		} // closing for else conditional
			
			
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
				wrongCount++; //marks first wrong answer
				correctCount = 0; //resets counter
				
				while(wrongCount <= 4) 
				{
				
				if(wrongCount == 1 ) //1st wrong answer
				{
					System.out.println("How much is " + num1 + " times " + num2 +"?");
					System.out.println("Enter your answer:");
					keyMulti = input.nextInt();
					
					if(multiAns == keyMulti) 
					{
						System.out.println("Very good");
						wrongCount = 5;
						correctCount++;
						attemptCount++;
					}
					else 
					{
						System.out.println("Wrong. Try once more.");
						wrongCount++;
						attemptCount++;
					}	
				}
				else if (wrongCount == 2) 
				{
					System.out.println("How much is " + num1 + " times " + num2 +"?");
					System.out.println("Enter your answer:");
					keyAdd = input.nextInt();
					
					if(multiAns == keyMulti) {
						System.out.println("Very good");
						correctCount++;
						attemptCount++;
					}
					else 
					{
						System.out.println("Don't give up!");
						wrongCount++;
						attemptCount++;
					}	
					
				}
				else if (wrongCount == 3) 
				{
					System.out.println("How much is " + num1 + " times " + num2 +"?");
					System.out.println("Enter your answer:");
					keyAdd = input.nextInt();
					
					if(multiAns == keyMulti) 
					{
						System.out.println("Very good");
						correctCount++;
						attemptCount++;
						
					}
					else 
					{
						System.out.println("No, keep trying");
						wrongCount++;	
						attemptCount++;
					}	
					
				}
				else if (wrongCount == 4) 
				{
					System.out.println("How much is " + num1 + " times " + num2 +"?");
					System.out.println("Enter your answer:");
					keyAdd = input.nextInt();
					
					if(multiAns == keyMulti) {
						System.out.println("Very good");
						correctCount++;
						attemptCount++;
					}
					
				else 
					{
						System.out.println("Type \"exit\" to try another problem or \"continue\" to attempt this problem again.");
						contOrNot = input2.nextLine();
						
						System.out.println("You typed: " + contOrNot);
						
						if(contOrNot.equals("continue"))
						{
							 //resets wrong counter all over again, and entire loop starts again for user to attempt again
							wrongCount = 1;
							System.out.println("The wrong count is: " + wrongCount);
						}
						
						if(contOrNot.equals("exit"))
						{
							wrongCount++;
							System.out.println("The wrong count is: " + wrongCount);
						}
					} // closing brace for last else	
				} // closing for else if == 4
				
			} // closing brace for while loop
				
		} // closing for else conditional
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
				wrongCount++; //marks first wrong answer
				correctCount = 0; //resets counter
				
				while(wrongCount <= 4) 
				{
				
				if(wrongCount == 1 ) //1st wrong answer
				{
					System.out.println("How much is " + num1 + " divided by " + num2 +"?");
					System.out.println("Enter your answer:");
					keyDiv = input.nextInt();
					
					if(divAns == keyDiv) 
					{
						System.out.println("Very good");
						wrongCount = 5;
						correctCount++;
						attemptCount++;
					}
					else 
					{
						System.out.println("Wrong. Try once more.");
						wrongCount++;
						attemptCount++;
					}	
				}
				else if (wrongCount == 2) 
				{
					System.out.println("How much is " + num1 + " divided by " + num2 +"?");
					System.out.println("Enter your answer:");
					keyAdd = input.nextInt();
					
					if(divAns == keyDiv) {
						System.out.println("Very good");
						correctCount++;
						attemptCount++;
					}
					else 
					{
						System.out.println("Don't give up!");
						wrongCount++;
						attemptCount++;
					}	
					
				}
				else if (wrongCount == 3) 
				{
					System.out.println("How much is " + num1 + " divided by " + num2 +"?");
					System.out.println("Enter your answer:");
					keyAdd = input.nextInt();
					
					if(divAns == keyDiv) 
					{
						System.out.println("Very good");
						correctCount++;
						attemptCount++;
						
					}
					else 
					{
						System.out.println("No, keep trying");
						wrongCount++;	
						attemptCount++;
					}	
					
				}
				else if (wrongCount == 4) 
				{
					System.out.println("How much is " + num1 + " divided by " + num2 +"?");
					System.out.println("Enter your answer:");
					keyDiv = input.nextInt();
					
					if(divAns == keyDiv) {
						System.out.println("Very good");
						correctCount++;
						attemptCount++;
					}
					
				else 
					{
						System.out.println("Type \"exit\" to try another problem or \"continue\" to attempt this problem again.");
						contOrNot = input2.nextLine();
						
						System.out.println("You typed: " + contOrNot);
						
						if(contOrNot.equals("continue"))
						{
							 //resets wrong counter all over again, and entire loop starts again for user to attempt again
							wrongCount = 1;
							System.out.println("The wrong count is: " + wrongCount);
						}
						
						if(contOrNot.equals("exit"))
						{
							wrongCount++;
							System.out.println("The wrong count is: " + wrongCount);
						}
					} // closing brace for last else	
				} // closing for else if == 4
				
			} // closing brace for while loop
				
		} // closing for else conditional
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
				wrongCount++; //marks first wrong answer
				correctCount = 0; //resets counter
				
				while(wrongCount <= 4) 
				{
				
				if(wrongCount == 1 ) //1st wrong answer
				{
					System.out.println("How much is the sum of " + num1 + " and " + num2 +"?");
					System.out.println("Enter your answer:");
					keyMod = input.nextInt();
					
					if(modAns == keyMod) 
					{
						System.out.println("Very good");
						wrongCount = 5;
						correctCount++;
						attemptCount++;
					}
					else 
					{
						System.out.println("Wrong. Try once more.");
						wrongCount++;
						attemptCount++;
					}	
				}
				else if (wrongCount == 2) 
				{
					System.out.println("How much is the sum of " + num1 + " and " + num2 +"?");
					System.out.println("Enter your answer:");
					keyAdd = input.nextInt();
					
					if(modAns == keyMod) {
						System.out.println("Very good");
						correctCount++;
						attemptCount++;
					}
					else 
					{
						System.out.println("Don't give up!");
						wrongCount++;
						attemptCount++;
					}	
					
				}
				else if (wrongCount == 3) 
				{
					System.out.println("How much is the sum of " + num1 + " and " + num2 +"?");
					System.out.println("Enter your answer:");
					keyAdd = input.nextInt();
					
					if(modAns == keyMod) 
					{
						System.out.println("Very good");
						correctCount++;
						attemptCount++;
						
					}
					else 
					{
						System.out.println("No, keep trying");
						wrongCount++;	
						attemptCount++;
					}	
					
				}
				else if (wrongCount == 4) 
				{
					System.out.println("How much is the sum of " + num1 + " and " + num2 +"?");
					System.out.println("Enter your answer:");
					keyAdd = input.nextInt();
					
					if(modAns == keyMod) {
						System.out.println("Very good");
						correctCount++;
						attemptCount++;
					}
					
				else 
					{
						System.out.println("Type \"exit\" to try another problem or \"continue\" to attempt this problem again.");
						contOrNot = input2.nextLine();
						
						System.out.println("You typed: " + contOrNot);
						
						if(contOrNot.equals("continue"))
						{
							 //resets wrong counter all over again, and entire loop starts again for user to attempt again
							wrongCount = 1;
							System.out.println("The wrong count is: " + wrongCount);
						}
						
						if(contOrNot.equals("exit"))
						{
							wrongCount++;
							System.out.println("The wrong count is: " + wrongCount);
						}
					} // closing brace for last else	
				} // closing for else if == 4
				
			} // closing brace for while loop
				
		} // closing for else conditional
			break;
			
		default: 
			System.out.println("You have choosen to exit");
			System.out.println("You score: " + correctCount + " out of" + totalCount + " in " + totAttempts + " attempts.");
			System.out.println("Total attempts were: " + totAttempts);
			correctCount = 0;
			break;
	}
		}
		while(!(whatOperation.equals("other")));
		
	}
}
