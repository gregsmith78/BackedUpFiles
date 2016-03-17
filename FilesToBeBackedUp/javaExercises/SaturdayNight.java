import java.util.*;
public class SautrdayNight
{
  //Here is the main method
  //remember you must have one main method only. 
  //This is the boss that starts everything off. 

  public static void main(String[] args)
  {
    System.out.println("Welcome to this adventure");
    System.out.println("Here we go, do you want to go (1)Right or (2)Left?");
    int choice = SimpleInput.getIntNumber("(1) right or (2) left");

    if(choice==1)
    {
      right();
    }
    else if(choice==2)
    {
      left();
    }
    else {
      System.out.println("you typed in something bad.. too bad");
      die();
    }
  }//end of main method
  

  ////Here begins the other methods..............

  public static void right()
  {
   System.out.println("You chose right... good job!");
   System.out.println("Now there is a tree in your way. Do you want to go over, under, or go around it?");
   int choice = SimpleInput.getIntNumber("(1) over or (2) under or (3) go around");

    if(choice==1)
    {
      over();
    }
    else if(choice==2)
    {
      under();
    }
    else if(choice==3)
    {
      around();
    }
    else 
    {
      System.out.println("you typed in something bad.. too bad");
      die();
    }
  }
  
  public static void left()
  {
   System.out.println("You choose left... too bad... ");
   die();
  }
  
  public static void over()
  {
   System.out.println("You chose to go over the tree. Yay! you made it!! You win!!");
  }
  
  public static void under()
  {
   System.out.println("You chose to go under the tree and got squished ");
   die();
  }
  
  public static void around()
  {
   System.out.println("You chose to go around and were attacked by bears... too bad... ");
   die();
  }
  
  public static void die()
  {
   System.out.println("You lose... you die.. better luck next time.. loser."); 
  }
}//end of class