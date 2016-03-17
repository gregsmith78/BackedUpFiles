
public class BankAccount {
	public String name;
	public double balance;
	public double checking;
	
	public BankAccount(String Name, double Balance, double Checking){
		name = Name;
		balance = 300.00;
		checking = 450.00;
	}
	public void Deposit(double AmountAdded){
		checking += AmountAdded;
	}
	public void Withdrawal(double AmountSubtracted){
		checking -= AmountSubtracted;
	}

}
