import java.util.Scanner;
public class Palindrome_Num {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input your number: ");
		int N = scanner.nextInt();
		int ON = N;
		int reversed = 0;
		
		while (N != 0) {
			int lastdigit = N % 10;
			reversed = reversed * 10 + lastdigit;
			N = N / 10;
		}
		if (ON == reversed) {
			System.out.println("This is a palindrome number");
		} else {
			System.out.println("This is not a palindrome number");
		}
	}

}
