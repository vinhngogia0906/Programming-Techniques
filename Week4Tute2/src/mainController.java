import java.util.Scanner;
public class mainController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int choice;
		System.out.println("Welcome to Programming Techniques week 4 tutorial!!!");
		System.out.print("Please enter your choice from 0 to 19 to run the according exercise: ");
		choice = input.nextInt();
		input.nextLine();
		switch (choice){
			case 0:{
				FuelConverter fuelCon = new FuelConverter();
				fuelCon.convert();
				break;
			}
			case 1:{
				break;
			}
			case 2:{
				break;
			}
			case 3:{
				break;
			}
			case 4:{
				break;
			}
			case 5:{
				break;
			}
			default:{
				System.out.println("Incorrect input, program terminated !!! :(");
				System.exit(1);
				break;
			}
		}

	}

}
