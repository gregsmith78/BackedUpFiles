import java.util.*;
public class Slugging {

	public static void main(String[] args) {
		Player steve = new Player();
		double steveSluggs = steve.GetSlugging(20, 22, 14, 30, 467);
		System.out.println(steveSluggs);
		System.out.println();
		
		
		
		ArrayList<String> theCharacters = new ArrayList<String>();
		theCharacters.add("[]");
		theCharacters.add("{}");
		theCharacters.add("<>");
		System.out.println(theCharacters.size());
		System.out.println();
		
		if(theCharacters.contains("<>")){
			System.out.println("That is correct.");
		} else {
			System.out.println("That character is not in the list.");
		}
		
	}
}
