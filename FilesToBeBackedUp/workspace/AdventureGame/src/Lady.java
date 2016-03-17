
public class Lady {
	String name;
	String colorHair;
	String eyeColor;
	String colorDress;
	double height;
	boolean isFun;
	long phoneNum;
	
	
	public void isInterested(){
		isFun = true;
	}	

public Lady(String Name, String HairColor, String EyeColor, String DressColor, double Height, long PhoneNumber){
	name = Name;
	colorHair = HairColor;
	eyeColor = EyeColor;
	colorDress = DressColor;
	height = Height;
	phoneNum = PhoneNumber;
}

public void myaDialogue() {
	System.out.println("Hi, I'm Mya!");
	//System.out.println("Here's my number: " + pNum);
}
	
}

