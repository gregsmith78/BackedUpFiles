import java.util.*;
public class Game {
	public int number;
	public String numbAsString;
	public String[] numbSplit;
	public int[] numbArray;
	
	public Game(){
		
	}
	public void Start(){
		System.out.println("What number would you like to use?");
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		
	}
	public String GetString(int number){
		numbAsString = Integer.toString(number);
		return numbAsString;
	}
	public String[] SplitString(int number){
		numbSplit = numbAsString.split("");
		return numbSplit;
	}
	public int[] MakeArrayForInts(){
		numbArray = new int[numbSplit.length];
		for (int i = 0; i < numbSplit.length; i++){
			numbArray[i] = Integer.parseInt(numbSplit);
			
		}
	}
	
	

}