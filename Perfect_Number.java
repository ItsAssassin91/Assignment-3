
public class Perfect_Number {

	public static void main(String[] args) {
		System.out.println("This is the output of perfect numbers from 1-100");
		for (int N = 1;N <=100;N++) {
			int sum = 0;
			for (int i = 1;i <= N/2;i++) {
				if (N % i == 0) {
					sum += i;
				}
			}
		 if (sum == N) {
			 System.out.println(N + " is a perfect number");
		}
		
			
		}
	}

}
