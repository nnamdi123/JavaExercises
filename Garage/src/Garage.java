import java.util.ArrayList;

public class Garage {
	private ArrayList<Vehicle> theGarage = new ArrayList<Vehicle>();
	private ArrayList<Vehicle> roofRack = new ArrayList<Vehicle>();
	
	public void addvehicle(Vehicle i) {
		theGarage.add(i);
		
	}
	
	public void removeVehicle(int theID) {
		for (Vehicle x : theGarage) {
			if (x.getvehicleID() == theID) {
				theGarage.remove(x);
				
			}
			
			
		}
		
	}
	
	
	public void addroofRack(Car i) {
		roofRack.add(i);
		
	}
		
	public void printList() {
		
		for (Vehicle i : theGarage)
			System.out.println(i);		
	}
	
	public void printRoofrack() {
		
		for (Vehicle i : roofRack)
			System.out.println(i);		
	}
	
	public Vehicle findVehicle(int theID) {
	Vehicle f = null;
	
	for (Vehicle currentVehicle : theGarage) {
		if (currentVehicle.getvehicleID() == theID) {
			f = currentVehicle;
			
		}
	}
	
		return f;
}
	
	public void getBill () {
		
		
	}

}
