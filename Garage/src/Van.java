
public class Van extends Vehicle {
	
	public Van(int vehicleID, String make, int numOfWheels, String colour, int numOfSeats, int price, boolean ladderorNot) {
		super(vehicleID, make, numOfWheels, colour, numOfSeats, price);
		}

	private boolean ladderorNot;
	private int repair = 500;
	
	public boolean isLadderorNot() {
		return ladderorNot;
	}

	public void setLadderorNot(boolean ladderorNot) {
		this.ladderorNot = ladderorNot;
	}
	
	public int getRepair() {
		
		return repair;
	}
	

	
	


	
	
	

}
