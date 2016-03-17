import java.util.*;
import java.util.Scanner;
  
  public class LuckySevens {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        Random random = new Random();
         String input;
         int startingCash, cash, maxCash, rolls, roll;
 
         // Loop until "quit" is input
         while (true) {
             System.out.print("Enter the amount of cash to start with (or \"quit\" to quit): ");
 
             input = in.nextLine();
 
             // Check if user wants to exit
           if (input.toLowerCase().equals("quit")) {
                System.out.println("\tGoodbye.");
                 System.exit(0);
             }
 
             // Get number
             try {
                 startingCash = Integer.parseInt(input);
             } catch (NumberFormatException ex) {
                 System.out.println("\tPlease enter a positive integer greater than 0.");
                 continue;
             }
 
             // You have to start with some money!
             if (startingCash <= 0) {
                 System.out.println("\tPlease enter a positive integer greater than 0.");
                 continue;
             }
 
             cash = startingCash;
             maxCash = cash;
             rolls = 0;
             roll = 0;
 
             // Here is the game loop
             for (; cash > 0; rolls++) {
                roll = random.nextInt(6) + 1;
                roll += random.nextInt(6) + 1;
 
                 if (roll == 7)
                     cash += 4;
                 else
                     cash -= 1;
 
                 if (cash > maxCash)
                     maxCash = cash;
             }
 
             System.out.println("\tYou start with $" + startingCash + ".\n"
                     + "\tYou peak at $" + maxCash + ".\n"
       + "\tAfter " + rolls + " rolls, you run out of cash.");
         }
     }
 }