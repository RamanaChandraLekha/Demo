
public class Bank {
	static String bankName = "ABC";
	String accNo;
	String name;
	float balance;

	Bank(String name, String accNo, float balance) {
		this.name = name;
		this.accNo = accNo;
		this.balance = balance;

	}

	void deposit(float amount) {
		balance = balance + amount;

	}

	void withDraw(float amount) throws InSufficientBalanceException {
		if (balance < amount)
			throw new InSufficientBalanceException();
		else
			balance=balance-amount;
	}

	void display() {
		System.out.println("Name -" + name + "\n" + "AccountNumber-" + accNo + "\n" + "balance-" + balance);
	}

}
