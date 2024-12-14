import java.util.Scanner;
public class amicable_numbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kindly input your value: ");
		int N = scanner.nextInt();
		int Y = scanner.nextInt();
		int SumN = 0;
		int SumY = 0;
		for (int i = 1;i < N;i++) {
			if (N % i == 0) {
				SumN = SumN + i;
				
			} 
		}
		System.out.println(SumN);
		for (int X = 1; X < Y; X++) {
			if (Y % X == 0) {
				SumY = SumY + X;
			}
		}
		System.out.println(SumY);
		if (SumY == N && SumN == Y) {
			System.out.println("This is an ammicable number");
		} else {
			System.out.println("This is not an ammicable number");
		}
	}

}
