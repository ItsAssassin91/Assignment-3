import java.util.Scanner;
public class Factors {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kindly input your value: ");
		int N = scanner.nextInt();
		int Y = 0;
		for (int i = 1;i < N;i++) {
			if (N % i == 0) {
				System.out.println(i + " is a divisor ");
			} 
		}
	}

}
