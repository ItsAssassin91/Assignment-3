import java.util.Scanner;
public class smallest_of_three {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input your 3 numbers: ");
		int X = scanner.nextInt();
		int Y = scanner.nextInt();
		int Z = scanner.nextInt();
		
		if (Z < Y && Z < X) {
			System.out.print(Z + " Is the lowest number of the 3 ");
			
		} else if ( Y < Z && Y < X) {
			System.out.println(Y + " Is the lowest number of the 3 ");
		} else {
			System.out.println(X + " Is the lowest number of the 3 ");
		}
	}

}
