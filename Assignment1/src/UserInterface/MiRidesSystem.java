package UserInterface;
import java.util.Scanner;
import Model.Booking;
import Model.Car;
import utilities.DateTime;
public class MiRidesSystem {
	 static Car[] cars = new Car[50];
	 Scanner input = new Scanner(System.in);
	public MiRidesSystem() {
		for (int i = 0; i < cars.length; i++) {
			cars[i] = new Car("","","","",0);
		}
	}
	public void CreateCar() {
	
		System.out.print("Enter Registration No: ");
		String regNo = input.nextLine();
		System.out.print("Enter Make: ");
		String make = input.nextLine();
		System.out.print("Enter Model: ");
		String model = input.nextLine();
		System.out.print("Enter Driver's Name: ");
		String driverName = input.nextLine();
		System.out.print("Enter Passenger Capacity: ");
		int passengerCapacity = input.nextInt();
		input.nextLine();
		Car newCar = new Car(regNo, make, model, driverName, passengerCapacity);
		newCar.setAvailable(true);
		for(int i = 0; i < cars.length; i++) {
			if(cars[i].getRegNo() == "") {
				cars[i].setRegNo(newCar.getRegNo());
				cars[i].setMake(newCar.getMake());
				cars[i].setModel(newCar.getModel());
				cars[i].setDriverName(newCar.getDriverName());
				cars[i].setPassengerCapacity(newCar.getPassengerCapacity());
				cars[i].setAvailable(newCar.getAvailable());
				System.out.println("New car added successfully for registration number: "+newCar.getRegNo());
				break;
			}
		}
//		System.out.println(newCar.getDetails());
//		System.out.println(newCar.toString());
	}
	public void BookCar() {
		Car[] availableCars = new Car[10];
		String bookId= "";
		String day,month,year;
		System.out.println("Enter Date Required: ");
		String dateRequired = input.nextLine();
		String dateParts[] = dateRequired.split("/");
		day = dateParts[0];
		month = dateParts[1];
		year = dateParts[2];
		DateTime date = new DateTime(Integer.valueOf(day),Integer.valueOf(month),Integer.valueOf(year));
		System.out.println("The following cars are available:");
		int availableNo = 0;
		for(int i = 0; i < cars.length; i++) {
			if(cars[i].getAvailable() == true) {
				availableCars[availableNo] = cars[i];
				System.out.println(availableNo+1+". "+cars[i].getRegNo());
				availableNo++;
			}
		}
		System.out.print("Please select the number to the car you need to book: ");
		int choice = input.nextInt();
		input.nextLine();
		System.out.print("Enter First Name: ");
		String firstName = input.nextLine();
		System.out.print("Enter Last Name: ");
		String lastName = input.nextLine();
		System.out.print("Enter the number of passengers: ");
		int passengerNum = input.nextInt();
		input.nextLine();
		Booking newBooking = new Booking(firstName, lastName, date, passengerNum, availableCars[choice-1]);
		bookId += availableCars[choice-1].getRegNo()+"_"+firstName.substring(0, 3).toUpperCase();
		bookId += lastName.substring(0, 3).toUpperCase()+"_"+day.toString()+month.toString()+year.toString();
		newBooking.setId(bookId);
		for(int i = 0; i < availableCars[choice-1].getCurrentBookings().length; i++) {
			if(availableCars[choice-1].getCurrentBookings()[i] == null) {
				availableCars[choice-1].getCurrentBookings()[i] = newBooking;
				break;
			}
		}
		System.out.println();
		System.out.println("Thank you for your booking. "+availableCars[choice-1].getDriverName()+" will pick you up on "
				+ date.getFormattedDate() +".\nYour booking reference is: "+bookId+".");
	}
	public void DisplaySpecificCar() {
		System.out.println("Enter Registration No: ");
		String regNo;
		regNo = input.nextLine();
		boolean found = false;
		for(int i = 0; i < cars.length; i++) {
			if(cars[i].getRegNo().equals(regNo) && cars[i].getRegNo() != "") {
				System.out.println(cars[i].getDetails());
				found = true;
				break;
			}
		}
		if (found == false) {
			System.out.println("Error - The car could not be located.");
		}
	}
	public void DisplayAllCar() {
		System.out.println("Here are all the cars: ");
		for(int i = 0; i < cars.length; i++) {
			if(cars[i].getRegNo() != "") {
				System.out.println(cars[i].getDetails());
			}
		}
	}
}
