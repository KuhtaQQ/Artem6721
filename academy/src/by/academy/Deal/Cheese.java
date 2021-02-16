package by.academy.Deal;

public class Cheese extends Product {
	private Double massa;
	private String made;

	public Cheese(Double price, String name, String manufacture, Integer quantity,Double massa,String made) {
		super(name, price,manufacture ,quantity);
		this.massa = massa;
		this.made = made;
	
	}

	@Override 
	public double discount() {
		if (massa>1||made.equals("Савушкин")) {
			return 0.8;
		} else {
			return 1;
		}
	}
	

	public Cheese() {
		super();
	}

	public Double getMassa() {
		return massa;
	}

	public void setMassa(Double massa) {
		this.massa = massa;
	}

	public String getMade() {
		return made;
	}

	public void setMade(String made) {
		this.made = made;
	}


}	
