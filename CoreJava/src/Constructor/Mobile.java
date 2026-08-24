package Constructor;

public class Mobile {
	String brand;
	double price;
	int RAM;
	Mobile( String b){
		brand =b;
	}
	Mobile(String b,double p){ //constructor overloading
		brand =b;
		price = p;
	}
	Mobile(String b,double p,int R){ //constructor overloading
		brand =b;
		price = p;
		RAM =R;
	}
	void display() {
		System.out.println(brand+"..."+price+"..."+RAM+"...");
	}
	public static void main(String[] args) {
		Mobile m = new Mobile("Samsung",45000.00,256);
		m.display();
	}
}
