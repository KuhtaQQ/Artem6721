package by.academy.Deal;

public abstract class Product {

	protected String name;
	protected double price;
	protected String manufacture;
	protected int quantity;

	public Product() {
		super();
	}
	

	public Product(String name, double price, String manufacture, int quantity) {
		this.name = name;
		this.price = price;
		this.manufacture = manufacture;
		this.quantity = quantity;
	}

	public abstract double discount();
	public double calcFinalPrice() {
		return quantity*price*discount();
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

}
