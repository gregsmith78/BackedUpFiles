
public class Car {
	String name;
	String model;
	boolean carStarted;
	
public Car() {
	name = "Hoopty";
	model = "Broke-down";
	carStarted = false;
	
}
public Car(String Name, String Model) {
	name = Name;
	model = Model;
	carStarted = true;
}
public String getName(){
	return name;
}
public String getModel(){
	return model;
}

public void startCar(){
    carStarted = false;
}
public String getCarStarted() {
	if(carStarted) {
		return "Please turn the key to start the car.";
	} else {
		return "Vroom!";
	
	}
}
}