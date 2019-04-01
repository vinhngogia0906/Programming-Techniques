package Model;
import utilities.DateTime;
public class Car {
	// Variables of Car Class
	private String regNo;
	private String make;
	private String model;
	private String driverName;
	private int passengerCapacity;
	private boolean available;
	private Booking[] currentBookings;
	private Booking[] pastBookings;	
	// Constructor
	public Car(String regNo, String make, String model, String driverName
			,int passengerCapacity) {
		this.regNo = regNo;
		this.make = make;
		this.model = model;
		this.driverName = driverName;
		this.passengerCapacity = passengerCapacity;
		this.currentBookings = new Booking[5];
		this.pastBookings = new Booking[5];
	}
	//Booking the car method
	public boolean book(String firstName, String lastName,
			DateTime required, int numPassengers) {
		return true;
	}
	public String getDetails() {
		String details = "";
		//String for boolean Available
		String available = "";
		// Set conditional branch for available String;
		if (this.available == true) {
			available = "YES";
		}
		else {
			available = "NO";
		}
		
		details += "RegNo:\t\t"+this.regNo+"\nMake & Model:\t";
		details += this.make+" "+this.model+"\nDriverName:\t";
		details += this.driverName+"\nCapacity:\t"+this.passengerCapacity;
		details += "\nAvailable:\t"+available;
		return details;
	}
	public String toString() {
		String detailsToString = "";
		//String for boolean Available
		String available = "";
		// Set conditional branch for available String;
		if (this.available == true) {
			available = "YES";
		}
		else {
			available = "NO";
		}
		// Forming the String of details
		detailsToString += this.regNo+":"+this.make+":"+this.model;
		detailsToString += ":"+this.driverName+":"+this.passengerCapacity+":"+available;
		return detailsToString;
	}
	
	// Setter and Getter methods
	//Setter
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	//Getter
	public String getRegNo() {
		return this.regNo;
	}
	public String getMake() {
		return this.make;
	}
	public String getModel() {
		return this.model;
	}
	public String getDriverName() {
		return this.driverName;
	}
	public int getPassengerCapacity() {
		return this.passengerCapacity;
	}
	public boolean getAvailable() {
		return this.available;
	}
	public Booking[] getCurrentBookings() {
		return this.currentBookings;
	}
	public Booking[] getPastBookings() {
		return this.pastBookings;
	}
}
