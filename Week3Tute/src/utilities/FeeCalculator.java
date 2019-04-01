package utilities;
import java.util.Scanner;
import Model.Dog;

public class FeeCalculator {
	final double DAILY_RATE = 10.0;
	public String getFee(Dog dog, Scanner console)
	{
		System.out.println();
		System.out.println();
		System.out.println("What is the name of your pet?");
		dog.name = console.next();

		System.out.println("Input how many days your pet will be staying?");
		int numberOfDays = console.nextInt();
				String feeStatement = "The cost for boarding "
						+ dog.name
						+ " for "
						+ numberOfDays
						+ " days is $" + numberOfDays *
						DAILY_RATE; 
				return feeStatement;
	}

}
