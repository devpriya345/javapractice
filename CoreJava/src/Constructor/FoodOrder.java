package Constructor;

public class FoodOrder {
	String item;
	int qty;
	int price;
	 FoodOrder(String item) {
		this .item = item;
		qty= 1;
		price = 100;
		
	}
	 FoodOrder(String item , int qty){
		 this.item = item;
		 this.qty = qty;
		 price = 100;
	 }
	 FoodOrder(String item,int qty,int price){
		 this.item = item;
		 this.qty = qty;
		 this.price = price;
	 }
	 void bill() {
		 System.out.println(item+"Total"+(qty*price));
	 }
	 public static void main(String[] args) {
		FoodOrder f1 = new FoodOrder("Burger");
		FoodOrder f2 = new FoodOrder("Burger",5);
		FoodOrder f3 = new FoodOrder("Burger",5,350);
		f1.bill();
		f2.bill();
		f3.bill();
	}
	
}
