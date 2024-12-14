import java.util.Scanner;
public class Binary_To_Dec {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input your binary number: ");
		int bin = scanner.nextInt();
		int dec = 0;
		int base = 1;
		int Originbin = bin;
		
		while (bin > 0) {
			int lastdigit = bin % 10;
			dec += lastdigit * base;
			bin /= 10;
			base *= 2;
		}
		System.out.println("The Decimal conversion of " + Originbin + " is " + dec);
	}

}
