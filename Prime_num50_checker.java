
public class Prime_num50_checker {

	public static void main(String[] args) {
		for (int num = 1;num <=50;num++) {
			if (num <=1) {
				System.out.println(num + " is not a prime number");
			} else {
				boolean isPrime = true;
				
				for (int i = 2; i < num; i++) {
					if (num % i == 0) {
						isPrime = false;
						break;
					}
				}
				if (isPrime) {
					System.out.println(num + " is a prime number");
				} else {
					System.out.println(num + " is not a prime number");
				}
		} 
		}
	}

}
