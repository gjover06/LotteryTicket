import java.util.Scanner;

//Author: George Samu
//This program will read a ticket number and 
//indicates whether it is a winner.

public class LotteryTicket
{
	public static void main (String [] args)
	{
		System.out.println("Is your ticket a winner?");
		System.out.println("Enter a five digit ticket number");
		Scanner keyboard= new Scanner(System.in);
		String lotteryticket=keyboard.nextLine();
		
		System.out.println("The ticket number is "+lotteryticket);
		System.out.println("if "+lotteryticket+" matches the following value you are a winner: 74222");
		
		
	
	
	}// end main
	}// end LotteryTicket
	