package by.academy.Deal;

public class Kefir extends Product {
	private Double fatContent ;
	private Double volume;
	public Kefir() {
		super();	
	}
	public Kefir(Double price, String name, String manufacture, int quantity, Double fatContent, 
			Double volume) {
		super(name,price, manufacture,quantity);
		this.fatContent = fatContent;
		this.volume = volume;
	}
	@Override
	public double discount() {
		if(getQuantity()>20) {
			return 0.9;
		}
		else {
			return 1;
		}
	}
	

	public Double getFatContent() {
		return fatContent;
	}

	public void setFatContent(Double fatContent) {
		this.fatContent = fatContent;
	}

	public Double getVolume() {
		return volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

}
