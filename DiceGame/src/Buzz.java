//package string;

import java.util.Random;
import java.util.Scanner;

public class Buzz{
	public static void main(String[] args) {
		System.out.println("Would you like to play dice roll?");
		Scanner input3 = new Scanner (System.in);
		String choice3 = input3.nextLine();
		if (choice3.compareTo("No") == 0)
			System.out.println("Hope you can play next time!");
		System.out.println("Will even or odd win?");
		int evenChoice = 2;
		int oddChoice = 1;
		Scanner input2 = new Scanner (System.in);
		String choice2 = input2.nextLine();
		if (choice2.compareTo("Even") == 0)
			evenChoice = 2;
		else if (choice2.compareTo("Odd") == 0)
			oddChoice = 1;
		int playAgain = 0;
		int min = 1;
		int max = 6;
		int min1 = 1;
		int max1 = 6;
		int even = 0;
		int totalEven1 = 0;
		int totalOdd1 = 0;
		while (playAgain == 0) {
		int playAgain1 = 0;
		int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
		System.out.println("");
		System.out.println("Dice #1 Rolled: " + random_int);
		int random_int1 = (int) Math.floor(Math.random() * (max1 - min1 + 1) + min1);
		System.out.println("Dice #2 Rolled: " + random_int1);
		even = (random_int + random_int1);
		System.out.println("");
		System.out.println("Dice #1 & Dice #2 Combined Equal: " + even);
		System.out.println("");
		if (even % 2 == 0)
		{
			System.out.println("It's an EVEN Number!");
			totalEven1 = totalEven1 + 1;
		}else
		{
			System.out.println("It's an ODD Number!");
			totalOdd1 = (totalOdd1 + 1);
		}
		System.out.println("");
		System.out.println("Play again? 'Yes' or 'No'?");
		System.out.println("");
		Scanner input = new Scanner (System.in);
		String choice = input.nextLine();
		if(choice2.compareTo("No") == 0 && totalEven1 == totalOdd1)
		{
			playAgain = 1;
			System.out.println("Thanks for Playing!");
			System.out.println("Even wins = " + totalEven1);
			System.out.println("Odd wins = " + totalOdd1);
			System.out.println("Tie! No Winner!");
		}
			else if (choice.compareTo("No") == 0 && totalEven1 > totalOdd1)
		{
				System.out.println("Thanks for Playing!");
				System.out.println("");
				System.out.println("Even wins = " + totalEven1);
				System.out.println("Odd wins = " + totalOdd1);
				System.out.println("");
				System.out.println("Even Wins!");
				System.out.println("");
				playAgain = 1;
				if (evenChoice == 2)
					System.out.println("You Win!");
				else
					System.out.println("Odd Wins");
		}
			else if (choice.compareTo("No") == 0 && totalEven1 < totalOdd1)
			{
				System.out.println("Thanks for Playing!");
				System.out.println("");
				System.out.println("Even wins = " + totalEven1);
				System.out.println("Odd wins = " + totalOdd1);
				System.out.println("");
				System.out.println("Odd Wins!");
				System.out.println("");
				playAgain = 1;
				if (evenChoice == 2)
					System.out.println("You Win!");
				else
					System.out.println("Odd Wins");
			}
			if (choice.compareTo("Yes") == 0)
					playAgain = 0;
		}
		{{
			{
			}
			{
			}}}}
}