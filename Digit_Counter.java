import java.util.Scanner;
public class Digit_Counter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kindly input your number: ");
		int num = scanner.nextInt();
		int NumOrigin = num;
		int sum = 0;
		while (num != 0) {
			num = num / 10;
			sum++;
		}
		System.out.print("The num of digits of " + NumOrigin + " is " + sum);
		
	}

}
