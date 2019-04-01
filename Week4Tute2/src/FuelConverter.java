import java.util.Scanner;

public class FuelConverter {
	public FuelConverter() {}
	public void convert() {
		Scanner input = new Scanner(System.in);
		int choice;
		double kpl;
		double mpg;
		System.out.println("-- PREFERED CONVERSATION --");
		System.out.println();
		System.out.println("1.\tkpl to mpg");
		System.out.println("2.\tmpg to kpl");
		System.out.println();
		System.out.print("Please enter your choice: ");
		choice = input.nextInt();
		input.nextLine();
		if(choice == 1) {
			System.out.print("Enter the kilometers per liter value: ");
			kpl = input.nextDouble();
			input.nextLine();
			mpg = (kpl / 1.609) * 3.785;
			System.out.printf("The equivalent miles per gallon value is: %.2f", mpg);
		}
		else if (choice == 2) {
			System.out.print("Enter the miles per gallon value: ");
			mpg = input.nextDouble();
			input.nextLine();
			kpl = (mpg * 1.609) / 3.785;
			System.out.printf("THe equivalent kilometers per liter value is: %.2f", kpl);
		}
		else {
			System.out.println("Invalid input, program terminated!!!");
			System.exit(1);
		}
	}
}
