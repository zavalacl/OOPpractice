
public class UsedCar extends Car {

	int miles;
	
	public UsedCar(String make, String model, int year, double price, int miles) {
		super(make, model, year, price);
		this.miles = miles;
	}
	
	public int getMiles() {
		return miles;
	}


	public void setMiles(int miles) {
		this.miles = miles;
	}
	
	@override
	public String toString(){
		String out = super.toString() + "mls:"+ miles;
		return out;
	}

}
