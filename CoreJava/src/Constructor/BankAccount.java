package Constructor;

public class BankAccount {
	String holdername;
	int accountNo;
	double balance;
	BankAccount(String hn,int an,double b){
		holdername = hn;
		accountNo = an;
		balance = b;
	}
	void display() {
		System.out.println("holdername:"+holdername);
		System.out.println("accountNo:"+accountNo);
		System.out.println("balance:"+balance);
	}
	public static void main(String[] args) {
		BankAccount b = new BankAccount("Rajesh", 123456789, 455000.00);
				b.display();
	}
}
