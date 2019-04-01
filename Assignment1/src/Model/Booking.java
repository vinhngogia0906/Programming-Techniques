package Model;
import utilities.DateTime;
public class Booking {
	//Variables for Booking class;
	private String id;
	private double bookingFee;
	private DateTime pickUpDateTime;
	private String firstName;
	private String lastName;
	private int numPassengers;
	private double kilometersTravelled;
	private double tripFee;
	private Car car;
	//Constructor
	public Booking(String firstName, String lastName, DateTime required,
			int numPassenger, Car car) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.pickUpDateTime = required;
		this.numPassengers = numPassenger;
		this.car = car;
	}
	// get detail String
	public String getDetails() {
		String details = "";
		String travelled = "";
		String tripFee = "";
		if (this.kilometersTravelled <= 0) {
			travelled = "N/A";
		}
		if (this.tripFee <= 0) {
			tripFee = "N/A";
		}
		details +="id:\t"+this.id+"\nBooking Fee:\t$"+this.bookingFee;
		details +="\nPick up date:\t"+this.pickUpDateTime.toString()+"\n";
		details += "Name:\t"+this.firstName+" "+this.lastName+"\nPassengers:\t";
		details += this.numPassengers+"\nTravelled:\t"+travelled+"\nTrip Fee"+tripFee;
		details += "\nCar Id:\t"+this.car.getRegNo();
		return details;
	}
	//to String method
	public String toString() {
		String detailToString = "";
		detailToString += this.id+":"+this.bookingFee+":"+this.pickUpDateTime.toString();
		detailToString += ":"+this.firstName+" "+this.lastName+":"+this.numPassengers;
		detailToString += ":"+this.kilometersTravelled+":"+this.tripFee+":"+this.car.getRegNo();
		return detailToString;
	}
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
