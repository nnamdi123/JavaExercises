
public class Motorcycle extends Vehicle {
	
	private int repair = 200;

	public Motorcycle(int vehicleID, String make, int numOfWheels, String colour, int numOfSeats, int price) {
		super(vehicleID, make, numOfWheels, colour, numOfSeats, price);
		
	}
	
	public int getRepair() {
		
		return repair;
	}
	
		

}
