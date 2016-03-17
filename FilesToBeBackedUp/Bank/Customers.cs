
public class Customers : Person {
	double bankAccount;
	double balance;
	double creditScore;
	double dateCreated;
	
	public Customers(string FirstName, string LastName, string DateOfBirth, string SocSec, double BankAccount, double Balance, double CreditScore, double DateCreated){
		firstName = FirstName;
		lastName = LastName;
		dateOfBirth = DateOfBirth;
		socialSecurity = SocSec;
		bankAccount = BankAccount;
		balance = Balance;
		creditScore = CreditScore;
		dateCreated = DateCreated;
		
	}

	public double DepositToBalance(){
		
		
	}
	
	public double WithdrawBalance(){
		
		
	}
	
	public double AdjustCreditScore(){
		
		
	}
}

Customers have a bank account number, a balance on their account, credit score, and an
account creation date.

1. Set a customer’s credit score.
2. Adjust a customer’s account balance.
Note: when you adjust a customer’s account balance, you need to return the new balance.