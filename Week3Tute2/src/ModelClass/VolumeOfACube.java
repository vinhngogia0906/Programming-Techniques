package ModelClass;
import java.util.Scanner;
public class VolumeOfACube {
	public void Calculate() {
		Scanner input = new Scanner(System.in);
		int length = 0;
		int width, height = 0;
		
		System.out.print("Enter the lenght: ");
		length = input.nextInt();
		System.out.print("\nEnter the width: ");
		width = input.nextInt();
		System.out.print("\nEnter the height: ");
		height = input.nextInt();
		System.out.println("The volume of the cube is: "+length*width*height);
	}
}
