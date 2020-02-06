
public class UsedCar extends Car {
	
	private Double mileage;

	public UsedCar(String make, String model, int year, Double price, Double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return String.format("%s %14.2f", super.toString(), mileage);
	}
	
	

	
}
