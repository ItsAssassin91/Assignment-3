import java.util.Scanner;
public class GCD {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kindly input the larger number: ");
		int X = scanner.nextInt();
		System.out.println("Kindly input the smaller number: ");
		int Y = scanner.nextInt();
		
		
		while (Y != 0) {
			int remainder = X % Y;
			X = Y;
			Y = remainder;
		}
		System.out.println("The GCD is: "+ X);

	}

}
