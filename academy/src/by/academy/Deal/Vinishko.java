package by.academy.Deal;

public class Vinishko extends Product {
	private String sort;
	private String color;
	private Double volume;

	public Vinishko() {
		super();
	}

	public Vinishko(Double price, String name, String manufacture, Integer quantity, String sort, String color,
			Double volume) {
		super(name, price,manufacture ,quantity);
		this.sort = sort;
		this.color = color;
		this.volume = volume;

	}
    @Override 
	public double discount() {
		if (sort.equals("Плодово-ягодное") || color.equals("Red")||volume>1.0) {
			return 0.83;
		} else {
			return 1;
		}
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String Sort) {
		this.sort = sort;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public Double getVolume() {
		return volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

}
