import java.util.ArrayList;
import java.util.*;
public class HumanResources extends Person {
	double totalSalary;
	
	
	
	public HumanResources(String FirstName, String LastName, String Department,int AccessLevel, double HourlyWage, double TotalHoursWorkedForWeek){
		firstName = FirstName;
		lastName = LastName;
		department = Department;
		accessLevel = 3;
		hourlyWage = HourlyWage;
		totalHoursWorkedForWeek = TotalHoursWorkedForWeek;
		
	}
	public double CalculateSalary(){
		totalSalary = hourlyWage * 40 * 54;
		return totalSalary;
	}
	public void HRDisplay(){
		System.out.println("Name of employee: " + firstName + " " + lastName);
		System.out.println("Department: " + department);
		System.out.println("Access Level: " + accessLevel);
		System.out.println("Hourly Wage: " + hourlyWage  + " :: Total Hours: " + totalHoursWorkedForWeek);
		System.out.println("Annual Salary: " + CalculateSalary());
	}
	public void GetHires(){
		ArrayList<String> hired = new ArrayList<String>();
		hired.add("Steve Jobs");
		hired.add("Mark Zucks");
		System.out.println("New hires for the month are:");
		for(String item: hired){
			System.out.println(item);
	}
	}
	public void GetFires(){
		ArrayList<String> fired = new ArrayList<String>();
		fired.add("Batman");
		fired.add("Eminem");
		fired.add("John Doe");
		System.out.println("Recent terminations:");
		for(String item: fired){
			System.out.println(item);
		}
		
	}

}
