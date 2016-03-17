
public class Person {

	string firstName;
	string lastName;
	string dateOfBirth;
	long socialSecurity;
	
	public Person(){
	}
	
}








You have been commissioned to create a web application for a bank. Specifically, you need to track everyone associated with the bank, tellers, bankers, customers, etc. To do this, you will use what you know of object oriented programming to create objects for every person.
Every person has a first name, last name, date of birth, and social security number. However, different people have additional information.

Customers have a bank account number, a balance on their account, credit score, and an
account creation date.

Bankers and tellers both have an employee id, hire date, and security levels (1 for banker and 2 for teller).
Bankers have a fixed salary.
Tellers have an hourly wage.

To get started, build out your classes using inheritance to represent the tellers, bankers, and customers. Two classes, may not have the same variable, for example, if you set up a banker class and a customer class, they may not each have a variable representing their first name. To get around this requirement, you must use inheritance. This means have a class they would inherit a property from that represents their name.
There must be at least 5 classes total.

Each class should have a constructor. For simplicity, everything can be public. Additionally, you may store dates as a string.
You will need methods (functions) to perform the following tasks:
1. Set a customer’s credit score.
2. Adjust a customer’s account balance.
3. Give a teller a pay raise.
Note: when you adjust a customer’s account balance, you need to return the new balance.
Once you have built all of your classes, variables, and methods, create one teller, one banker, and one customer (these are objects). 
Once they are created, give the teller a raise, set the customer’s credit score, adjust a customer’s account balance, and echo out the balance that is returned.
Finally, after you have done all of this, create list and store your three people (objects) in the
list. Loop through the list, printing each person’s full name on one line each.