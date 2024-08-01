package javapractices;

public class ConstructorInJava {

	public static void main(String args[]) {
		Bank bank = new Bank("icici", 072007);
		bank.depositeMoney();
		Bank b=new Bank();
		
	}
}

class Bank {

	// instance member variables
	String bankName;
	int ifscCode;

	public Bank(String bankName, int ifscCode) {
		this.bankName = bankName;
		this.ifscCode = ifscCode;
	}
	
	public Bank()
	{
		
	}

	// instance member functions/methods
	public void withdrawMoney() {
		// code
		System.out.println("Windraw money");
	}

	public void depositeMoney() {
		// code
		System.out.println("Deposite money");
	}
}
