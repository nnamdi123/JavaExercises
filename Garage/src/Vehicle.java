
public class Vehicle {
	
	private int vehicleID;
	private String make;
	private int numOfWheels;
	private String colour;
	private int numOfSeats;
	private int price;
	
	
	public int getvehicleID() {
		return vehicleID;
	}
	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getNumOfWheels() {
		return numOfWheels;
	}
	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getNumOfSeats() {
		return numOfSeats;
	}
	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Vehicle(int vehicleID, String make, int numOfWheels, String colour, int numOfSeats, int price) {
		this.vehicleID = vehicleID;
		this.make = make;
		this.numOfWheels = numOfWheels;
		this.colour = colour;
		this.numOfSeats = numOfSeats;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Vehicle: ID = " + vehicleID + ", make = " + make + ", Wheels = " + numOfWheels + ", Colour = "
				+ colour + ", Seats = " + numOfSeats + ", Price = £" + price;
	}
	
	public static void main (String[] args) {
		Garage g = new Garage();
		
		Vehicle c1 = new Car(1001, "Audi", 4, "Black", 5, 30000, true);
		Vehicle c2 = new Car(1002, "Mercedes", 4, "Red", 5, 40000, false);
		Vehicle c3 = new Car(1003, "BMW", 4, "Silver", 5, 29000, true);
		Vehicle c4 = new Car(1004, "Honda", 4, "Black", 5, 10000, false);
		
		
		Vehicle b1 = new Motorcycle(2001, "Yamaha", 2, "Silver", 2, 7000);
		Vehicle b2 = new Motorcycle(2002, "Honda", 2, "Blue", 2, 5000);
		Vehicle b3 = new Motorcycle(2003, "Suzuki", 2, "Yellow", 2, 10000);
		Vehicle b4 = new Motorcycle(2004, "Suzuki", 2, "Black", 2, 10000);
	
		
		Vehicle v1 = new Van(3001, "Ford", 4, "Red", 5, 23000, false);
		Vehicle v2 = new Van(3002, "Volkswagen", 4, "Silver", 5, 7000, false);
		Vehicle v3 = new Van(3003, "Toyota", 4, "Silver", 5, 13000, true);
		Vehicle v4 = new Van(3004, "Ford", 4, "Grey", 5, 9000, false);
		
		g.addvehicle(c1);
		g.addvehicle(c2);
		g.addvehicle(c3);
		g.addvehicle(c4);
		g.addvehicle(b1);
		g.addvehicle(b2);
		g.addvehicle(b3);
		g.addvehicle(b4);
		g.addvehicle(v1);
		g.addvehicle(v2);
		g.addvehicle(v3);
		g.addvehicle(v4);
		
		Vehicle findVehicle = g.findVehicle(1002);
		System.out.println(findVehicle);
		 
		
	
		
		//g.printList();
		//g.printRoofrack();
		
	}
	
}


