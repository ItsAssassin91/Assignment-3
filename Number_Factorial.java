import java.util.Scanner;
public class Number_Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kindly input a number: ");
		int n = scanner.nextInt();
		long factorial = 1;
		
		for (int i = 1;i <= n;i++) {
			factorial *= i;
		}
		System.out.print("The factorial to " + n + " is " + factorial);

	}

}
