import java.util.Scanner;
public class Sum_Digits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kindly input your number: ");
		int N = scanner.nextInt();
		int ON = N;
		int Digit = 0;
		int Sum = 0;
		while (N != 0) {
			Digit = N % 10;
			Sum = Sum + Digit;
			N = N / 10;
		}
		System.out.println("The sum is: " + Sum);
	}

}
