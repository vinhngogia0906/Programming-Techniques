package Main;
import java.util.Scanner;

import UserInterface.MiRidesSystem;
public class MainController {
	private static boolean validInput = false;
	private static boolean exit = false;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MiRidesSystem system = new MiRidesSystem();
		String choice;
		// TODO Auto-generated method stub
			// SHOW THE MENU
		System.out.println("Welcome to MiRidesSystem, here is the menu:");
		System.out.println("*** MiRidesSystem ***");
		System.out.println("Create Car\t\tCC");
		System.out.println("Book Car\t\tBC");
		System.out.println("Complete Booking\tCB");
		System.out.println("Display All Cars\tDA");
		System.out.println("Search Specific Car\tSS");
		System.out.println("Search Available Car\tSA");
		System.out.println("Seed Data\t\tSD");
		System.out.println("Exit Program\t\tEX");
			// READ THE STRING
		System.out.print("Please input your choice here: ");
		choice = input.nextLine();
		
		while (validInput == false || exit == false) {
//				System.out.print("Please input your next choice here: ");
//				choice = input.nextLine();
				switch(choice) {
					case "CC":{
						system.CreateCar();
						validInput = true;
						break;
					}
					case "BC":{
						system.BookCar();
						validInput = true;
						break;
					}
					case "CB":{
						validInput = true;
						break;
					}
					case "DA":{
						validInput = true;
						system.DisplayAllCar();
						break;
					}
					case "SS":{
						system.DisplaySpecificCar();
						validInput = true;
						break;
					}
					case "SA":{
						validInput = true;
						break;
					}
					case "SD":{
						validInput = true;
						break;
					}
					case "EX":{
						System.out.println("Good bye, have a good day!!!");
						System.exit(0);
						validInput = true;
						exit = true;
						break;
					}
					default:{
						System.out.println("Invalid Input");
						break;
					}
				}
			System.out.print("Please enter your next choice: ");
			choice = input.nextLine();
		}
		input.close();
	}
}
