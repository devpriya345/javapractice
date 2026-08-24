package Inheritance;

public class User {
	void login() {
		System.out.println("user logged in ");
	}
}
class Customer extends User{
	void browseproduct() {
		System.out.println("customer browseproduct");
	}
}
class PrimeCustomer extends Customer{
	void fastdelivery() {
		System.out.println("Fastdelivery");
	}
}

