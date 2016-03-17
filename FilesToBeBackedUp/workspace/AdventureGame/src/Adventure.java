import java.util.*;
import java.util.Scanner;

public class Adventure {

	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			Scanner girl = new Scanner(System.in);
			
			System.out.println("It's Saturday Night!");
			System.out.println("You're a little thirsty and you decide to go out for a drink.");
			System.out.println("You get to the bar and the bartender asks if you want a (1)Beer or (2)Cocktail?");
			
		
		Lady mya = new Lady("Mya", "brunette", "green eyes", "pink dress", 5.5, 1-345-6000);
		//System.out.println("You're sitting at the bar and a beautiful woman sits next to you and says  + " " + mya.myaDialogue());
		//mya.myaDialogue();
		mya.isFun();
		
		//Beer bottle = new Beer();
		//bottle.setKind("IPA");
		//System.out.println(bottle.getKind());
		//bottle.Open();
	

	}

}
