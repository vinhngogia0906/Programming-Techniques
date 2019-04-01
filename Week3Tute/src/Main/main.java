package Main;
import utilities.FeeCalculator;
import java.util.Scanner;
import Model.Dog;
public class main {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Hello Frido, who's a good dog?");
		System.out.println("Woof Woof Woof !");
		FeeCalculator cal = new FeeCalculator();
		// TODO Auto-generated method stub
		for (int i = 0; i < 2; i++){
			Dog doggo = new Dog();
			System.out.println(cal.getFee(doggo, input));
		}
		System.out.println("End of Program!!");
	}
}
