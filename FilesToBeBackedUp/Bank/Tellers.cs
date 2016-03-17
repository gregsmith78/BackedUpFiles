
public class Tellers : Person {
	double hourlyWage;
	int securityLevel;
	string position;
	
	
	public Tellers(string FirstName, string LastName, string Position, string DateOfBirth, string SocSec, int EmployeeID, string HireDate, double HourlyWage){
		firstName = FirstName;
		lastName = LastName;
		position = Position;
		dateOfBirth = DateOfBirth;
		socialSecurity = SocSec;
		employeeID = EmployeeID;
		securityLevel = 2;
		hireDate = HireDate;
		hourlyWage = HourlyWage;
		
		
	}
	
	public double RaiseWage(){
		raise += 2;
		return raise;
	}

}






Bankers and tellers both have an employee id, hire date, and security levels (1 for banker and 2 for teller).
Bankers have a fixed salary.

Tellers have an hourly wage.

3. Give a teller a pay raise.