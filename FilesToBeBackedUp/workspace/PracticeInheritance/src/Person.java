
public class Person {
	String name;
	String department;
	double hourlyWage;
	double totalHours;
	int accessLevel;
	double salary;
	
	public Person(String Name, String Department, int AccessLevel){
		name = Name;
		department = Department;
		accessLevel = AccessLevel;
		
	}
	public double getPay(double wage, double hours){
		double totalPay = hourlyWage * totalHours;
		System.out.println(totalPay);
		return totalPay;
	}
	public double getSalary(double wage){
		double salary = hourlyWage * 40 * 52;
		System.out.println(salary);
		return salary;
	}

}
