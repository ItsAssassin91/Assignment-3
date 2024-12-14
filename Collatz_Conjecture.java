import java.util.Scanner;
public class Collatz_Conjecture {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		while (N != 1) {
			if (N % 2 == 0) {
				N = N / 2;
			} else {
				N = 3 * N + 1;
			}
		}
		System.out.print("ibrahim is brens" + N);
	}

}
