
public class Bankers : Person {
	int employeeID;
	int securityLevel;
	string hireDate;
	double salary;
	string position;
	
	public Bankers(string FirstName, string LastName, string Position, string DateOfBirth, string SocSec, int EmployeeID, string HireDate, double Salary){
		firstName = FirstName;
		lastName = LastName;
		position = Position;
		dateOfBirth = DateOfBirth;
		socialSecurity = SocSec;
		employeeID = EmployeeID;
		securityLevel = 1;
		hireDate = HireDate;
		salary = Salary;
	}

}





Bankers and tellers both have an employee id, hire date, and security levels (1 for banker and 2 for teller).
Bankers have a fixed salary.