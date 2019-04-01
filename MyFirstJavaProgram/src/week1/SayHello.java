package week1;

public class SayHello {
	public void sayHello()
	{
		System.out.println("Hello, is it me you looking for?");
	}
	public void toMyClassMates() 
	{
		System.out.println("Hello My Tutor");
		System.out.println("Hello Vinh");
		System.out.println("Hello Nhul");
	}
	public void makeAusFlag() 
	{
		for(int i = 0; i < 5; i++) {
			System.out.print("I");
			if (i == 0 || i == 4) {
				for (int j = 0; j < 30; j++) {
					System.out.print("-");
				}
			}
			else if (i == 1) {
				System.out.print(" \\"); System.out.print("\\ || //");
				for (int j = 0; j < 21; j++) {
					System.out.print(" ");
				}
			}
			else if (i == 3) {
				System.out.print(" // || \\");
				System.out.print("\\");
				for (int j = 0; j < 21; j++) {
					System.out.print(" ");
				}
			}
			else {
				System.out.print(" =  ||  =");
				for (int j = 0; j < 21; j++) {
					System.out.print(" ");
				}
			}
			System.out.println("I");
			System.out.println();
		}
	}
}
