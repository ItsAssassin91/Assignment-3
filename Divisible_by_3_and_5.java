
public class Divisible_by_3_and_5 {

	public static void main(String[] args) {
		int N = 50;
		for (int i = 1; i <= N; i++) {
			if (i % 3 == 0) {
				if (i % 5 == 0) {
					System.out.println("This number " + i + " Is divisible by 3 and 5 ");
				} else {
					System.out.println(i + " This number is not divisible by 3 and 5");
				}
			} else {
				System.out.println( i + " This number is not divisible by 3");
			}
			
		}

	}

}
