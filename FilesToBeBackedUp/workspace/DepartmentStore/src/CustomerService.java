
public class CustomerService extends Person {
	 
	double salary;
	double totalSalary;
	
	
	public CustomerService(String FirstName, String LastName, String Department,int AccessLevel, double HourlyWage, double TotalHoursWorkedForWeek){
		firstName = FirstName;
		lastName = LastName;
		department = Department;
		accessLevel = 2;
		hourlyWage = HourlyWage;
		totalHoursWorkedForWeek = TotalHoursWorkedForWeek;
		
	}
	public double CalculateSalary(){
		totalSalary = hourlyWage * 40 * 54;
		return totalSalary;
	}
	public void CustomerServiceDisplay(){
		System.out.println("Name of employee: " + firstName + " " + lastName);
		System.out.println("Department: " + department);
		System.out.println("Access Level: " + accessLevel);
		System.out.println("Hourly Wage: " + hourlyWage  + " :: Total Hours: " + totalHoursWorkedForWeek);
		System.out.println("Annual Salary: " + CalculateSalary());

	}

}
