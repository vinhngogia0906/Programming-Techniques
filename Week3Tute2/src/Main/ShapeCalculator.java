package Main;
import java.util.Scanner;
import ModelClass.*;
public class ShapeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean validInput = false;
		int choice = 0;
		
		System.out.println("Please enter your choice"
				+ ", 1 for calculating the area of a rectangle"
				+ ", 2 for calculating the volume of a cube: ");
		choice = input.nextInt();
		while(validInput == false) {
			switch(choice) {
				case 1:{
					AreaOfRectangle area = new AreaOfRectangle();
					area.Calculate();
					validInput = true;
					break;
				}
				case 2: {
					VolumeOfACube volume = new VolumeOfACube();
					volume.Calculate();
					validInput = true;
					break;
				}
				default:{
					System.out.print("Invalid input, please enter your choice again, only 1 or 2: ");
					choice = input.nextInt();
					break;
				}
			}
		}
	}

}
