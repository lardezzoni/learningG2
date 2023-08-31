package polymorphism;

interface NewBankAccount{
	
	// by default all methods are public and static and final
	void deposit();
	void withdraw();
	void balance();
	
	
}

interface BankABC {
	
	//it needs the world default first
	default void example() {
		System.out.println("example");
	}
	void opening();
	void closing();
}

//a class can be the child of multiple interfaces, this is multiple inheritances
class Saving implements NewBankAccount, BankABC{

	@Override
	public void opening() {
		// TODO Auto-generated method stub
		System.out.println("opening in Saving.");
	}

	@Override
	public void closing() {
		// TODO Auto-generated method stub
		System.out.println("closing in Saving.");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("deposit in Saving.");
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("withdraw in Saving.");
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		System.out.println("balance in Saving.");
	}
	
	
}


public class Interface {

	public static void main(String[] args) {
		
		Saving saving = new Saving();
		saving.balance();
		saving.closing();
		saving.withdraw();
		saving.example();
			
	}
	
}
