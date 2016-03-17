import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Human human1 = new Human();
		System.out.println(human1.name);
		Monster monster1 = new Monster();
		System.out.println(monster1.power);
		System.out.println(monster1.StrengthBooster());
		
		monster1.AddMoreStrength();
		//System.out.println(monster1.StrengthBooster());
		ArrayList<String> theList = new ArrayList<String>();
		theList.add(human1.name);
		theList.add("Ray Lewis");
		theList.add("Peyton Manning");
		
		for(int i = 0; i < theList.size(); i++){
			System.out.println(i);
		}
		
		for(String item : theList){
			System.out.println(item);
		}
		boolean retreval = theList.contains("Ray Rice");
		
		if (retreval == true){
			System.out.print("Ray is in the list.");
		} else {
			System.out.println("Sorry, he didn't make the cut.");
		}
		
		
		
	}
	

}
