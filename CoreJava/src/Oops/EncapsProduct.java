package Oops;

public class EncapsProduct {
	private String name;
	private int id;
	private double price;
	
	public  void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public static void main(String[] args) {
		EncapsProduct p = new EncapsProduct();
		p.setId(19);
		p.setName("Binu");
		p.setPrice(2500.00);
		
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getPrice());
	}
}
