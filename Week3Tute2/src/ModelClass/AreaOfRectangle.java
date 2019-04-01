package ModelClass;
import java.util.Scanner;
public class AreaOfRectangle {
	Scanner input = new Scanner(System.in);
	public void Calculate() {
		int width = 0;
		int height = 0;
		
		System.out.print("Please input the width of the rectangle: ");
		width = input.nextInt();
		System.out.print("\nPlease input the height of the rectangle: ");
		height = input.nextInt();
		System.out.println("\nThe area of the rectangle is: "+width*height);
	}

}
