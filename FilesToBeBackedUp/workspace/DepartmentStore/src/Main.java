
public class Main {

	public static void main(String[] args) {
		Person print = new Person();
		Warehouse employee1 = new Warehouse("Ron", "Burgandy", "Warehouse", 1, 17.25, 40 );
		employee1.WareHouseDisplay();
		print.PrintLines();
		WarehouseSupervisor employee5 = new WarehouseSupervisor("Clark", "Kent", "Warehouse Supervisor", 3, 19.35, 40);
		employee5.WareHouseDisplay();
		print.PrintLines();
		CustomerServSupervisor employee6 = new CustomerServSupervisor("Bruce", "Wayne", "Customer Service Supervisor", 3, 21.75, 40);
		employee6.CustomerServiceDisplay();
		print.PrintLines();
		CustomerService employee2 = new CustomerService("Nino", "Brown", "Customer Service", 2, 18.75, 53);
		employee2.CustomerServiceDisplay();
		HumanResources employee3 = new HumanResources("Peter", "Parker", "Human Resources", 3, 23.50, 41);
		print.PrintLines();
		employee3.HRDisplay();
		Executives employee4 = new Executives("Captain", "America", "Executive", 4, 33.25, 47);
		print.PrintLines();;
		employee4.ExecDisplay();
		print.PrintLines();
		employee3.GetHires();
		employee3.GetFires();

	}

}
