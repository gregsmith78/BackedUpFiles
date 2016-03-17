import java.util.*;
import java.util.Scanner;

public class Adventure {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner girl = new Scanner(System.in);
		
		System.out.println("It's Saturday Night!");
		System.out.println("You're a little thirsty and you decide to go out for a drink.");
		System.out.println("You get to the bar and the bartender asks if you want a (1)Beer or (2)Cocktail?");
		
		int choice; 
		choice = input.nextInt();
		
	
		switch(choice){
		case 1:
			System.out.println("I'll have an IPA please!");
			break;
		case 2:
			System.out.println("I'll have a Jack n Coke please!");
			break;
		default:
			System.out.println("Make way for paying customers Chump!");
			
		}
		System.out.println("You lock eyes with a beautiful brunette...");
		System.out.println("Do you 1 buy her a drink? 2 Grab a drink for her and go to talk to her?");
		System.out.println("Or 3 hang at the bar, have another drink to work up liquid courage?");
		
		int date;
		date = girl.nextInt();
		
		if (date == 1)
			System.out.println("Bartender, can you please send this Cosmo to that woman in the dress.");
		else if (date == 2)
		    System.out.println("Hey, how you doing?");
		else if (date == 3)
			System.out.println("Take off your skirt!");
		else
			System.out.println("Do something!");
		
		    
		
	

	}

}