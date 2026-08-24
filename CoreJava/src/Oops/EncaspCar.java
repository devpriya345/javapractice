package Oops;

public class EncaspCar {
	private String brand;
	private String model;
	private int speed;
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	public void setSpeed(int speed) {
		if (speed>0 && speed<200)
			this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}
	public static void main(String[] args) {
		EncaspCar c = new EncaspCar();
		c.setBrand("I20");
		c.setModel("base");
		c.setSpeed(150);
		System.out.println(c.getBrand());
		System.out.println(c.getModel());
		System.out.println(c.getSpeed());
	}
}
