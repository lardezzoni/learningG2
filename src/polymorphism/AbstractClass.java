package polymorphism;

abstract class ABCBank{
	
	abstract void open();
	abstract void close();
}


abstract class BankAccount extends ABCBank{
	
	public static void display() {
		System.out.println("display.");
	}
	abstract void deposit();
	abstract void withdraw();
	abstract void balance();
}

class SavingAccount extends BankAccount{

	@Override
	void open() {
		// TODO Auto-generated method stub
		System.out.println("Open.");
	}

	@Override
	void close() {
		// TODO Auto-generated method stub
		System.out.println("Close.");
	}

	@Override
	void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit.");
		
	}

	@Override
	void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Withdraw.");
	}

	@Override
	void balance() {
		// TODO Auto-generated method stub
		System.out.println("Balance.");
	}
	
}

class CurrentAccount extends BankAccount {
	
	void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit Current.");
		
	}

	@Override
	void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Withdraw Current.");
	}

	@Override
	void balance() {
		// TODO Auto-generated method stub
		System.out.println("Balance Current.");
	}
	
	
}


public class AbstractClass {

	public static void main(String[] args) {
		
		SavingAccount save = new SavingAccount();
		save.balance();
		save.deposit();
		save.withdraw();
		
		CurrentAccount curr = new CurrentAccount();
		curr.balance();
		curr.deposit();
		curr.withdraw();
		
		//now with a parent and child in abstract class
		save.open();
		save.close();
		
		//and you can call a method inside an abstract class but needs to be
		//static
		BankAccount.display();
	}
	
}
