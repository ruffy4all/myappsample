package chapter3;

import java.util.*;
public class GuessNumber {

	   public static void main(String[] args) {
	        // pick a random number
		   int num;
		   int off=0;
		   System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?\n");
		   
		   Scanner scan = new Scanner(System.in);
		   System.out.println("Type a number: ");
		   num=scan.nextInt();
		   System.out.printf("Your guess is: %d", num);
	        Random random = new Random();
	        int number = random.nextInt(100) + 1;
	        System.out.printf("\n The number I was thinking of is: %d \n",number);
	        off=num-number;
	        System.out.printf("You were off by: %d", off);
	}
	
}

