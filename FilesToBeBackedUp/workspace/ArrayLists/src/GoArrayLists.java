import java.util.*;

public class GoArrayLists {
	// static boolean retreval1;
	// static boolean retreval2;

	public static void main(String[] args) {
		ArrayList<Integer> firstArray = new ArrayList<Integer>();
		ArrayList<Integer> secondArray = new ArrayList<Integer>();
		
		firstArray.add(21);
		firstArray.add(11);
		firstArray.add(34);
		firstArray.add(66);
		firstArray.add(89);
		
		
		for(Integer item: firstArray){
			//retreval1 = firstArray.contains(21);
			System.out.println(item);
		}

		secondArray.add(21);
		secondArray.add(11);
		secondArray.add(66);
		secondArray.add(34);
	
		for(Integer item: secondArray){
			//retreval2 = secondArray.contains(21);
			System.out.println(item);
		
		}
		  if (firstArray.containsAll(secondArray)){
		//if (retreval1 == true && retreval2 == true){
			System.out.println("Both Arrays have the same numbers.");
			 
		} else {
			System.out.println("One of the numbers doesn't match up in the Arrays.");
		}
		

	}

}