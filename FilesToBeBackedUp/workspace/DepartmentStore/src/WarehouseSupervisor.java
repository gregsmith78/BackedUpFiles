
public class WarehouseSupervisor extends Person {
	
	
	public WarehouseSupervisor(String FirstName, String LastName, String Department,int AccessLevel, double HourlyWage, double TotalHoursWorkedForWeek){
		firstName = FirstName;
		lastName = LastName;
		department = Department;
		accessLevel = AccessLevel;
		hourlyWage = HourlyWage;
		totalHoursWorkedForWeek = TotalHoursWorkedForWeek;
		isSupervisor = true;
	}
	public double CalculateTotalPayForWeek(){
		double totalPay = hourlyWage * totalHoursWorkedForWeek;
		return totalPay;
		
	}
	public void WareHouseDisplay(){
		System.out.println("Name of employee: " + firstName + " " + lastName);
		System.out.println("Department: " + department);
		System.out.println("Access Level: " + accessLevel);
		System.out.println("Hourly Wage: " + hourlyWage +  " :: Total Hours: " + totalHoursWorkedForWeek);
		System.out.println("Total Pay For the Week: " + CalculateTotalPayForWeek());

}
}
