import java.util.*;
public class GoPalindrome {

	public static void main(String[] args) {
		
		String original;
		String reverse = "";
		
		System.out.println("Enter a string to determine if it is a palindrome.");
		Scanner read = new Scanner(System.in);
		
		original = read.next();
		int length = original.length();
		//int i;
		for(int i = length - 1; i >= 0; i--){
			reverse += original.charAt(i);
			
			if(original.equals(reverse)){
				System.out.println("String is a palindrome!");
			}else{
				System.out.println("String is not a palindrome.");
		
			}
		}
			}
}
		
		
	/*	//StringBuilder text = new StringBuilder();
	    String text = "racecar";
		String cutText;
		String cutText2;
		cutText = text..substring(0,3);
		cutText2 = text.substring(4, 7);
	
		
		
	    for (int i = 0; i < cutText.length(); i++){
	    	System.out.println(i);	
	}	
	    for(int i = 0; i < cutText2.length(); i++){
	    	System.out.println(i);
	    }   */
	