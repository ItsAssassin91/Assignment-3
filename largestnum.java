import java.util.Scanner;
public class largestnum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kindly input your 2 values: ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		if (x>y) {
			System.out.println(x + " Is greater than" + y);
			
		} else {
			System.out.println(y + "Is greater than " + x);
			
		}
	}

}
