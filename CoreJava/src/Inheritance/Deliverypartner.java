package Inheritance;

 class App {
	 void openapp() {
		 System.out.println("App is open");
	 }

	}
class Restaurent extends App{
	void preparefood() {
		System.out.println("Food prepared");
	}
}
class Deliverypartner extends Restaurent{
	void deliverorder() {
		System.out.println("Order deliverd");
	}
	public static void main(String[] args) {
		Deliverypartner dp = new Deliverypartner();
		dp.openapp();
		dp.preparefood();
		dp.deliverorder();
	}
}

