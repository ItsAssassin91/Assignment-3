import java.util.Scanner;
public class Number_Reverse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input your number: ");
		int N = scanner.nextInt();
		int reversed = 0;
		
		while ( N != 0) {
			int lastdigit = N % 10;
			reversed = reversed * 10 + lastdigit;
			N = N / 10;
		}
		System.out.println("Reversed number is " + reversed);
		

	}

}
