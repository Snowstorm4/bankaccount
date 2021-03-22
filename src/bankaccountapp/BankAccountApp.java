package bankaccountapp;

public class BankAccountApp {

	public static void main(String[] args) {
		
		Checking chkacc1 = new Checking("Tom Wilson", "980837348", 100);
		Savings savacc1 = new Savings("Barbara Kim", "8473628493", 60000);
		
		chkacc1.showInfo();
		System.out.println("______________________________________");
		savacc1.showInfo();
		
		// Read a CSV file than create new accounts based on that data

	}

}
