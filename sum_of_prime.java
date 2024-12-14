
public class sum_of_prime {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 2; i <= 100; i++) {
			boolean isPrime = true;
			
			for (int X = 2; X < i/2;X++) {
				if (i % X == 0) {
					isPrime = false;
					break;
				} 
			}
		if (isPrime) {
			sum += i;
		}
		}
		System.out.println("this is the sum "+ sum);
	}

}
