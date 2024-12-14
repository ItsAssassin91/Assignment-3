import java.util.Scanner;
public class positive_or_negative {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kindly input your number: ");
		int num = scanner.nextInt();
		if (num > 0) {
			System.out.println("This number is positive");
		} else if ( num < 0) {
			System.out.println("This number is negative");
		} else {
			System.out.println("This number is zero");
		}

	}

}
