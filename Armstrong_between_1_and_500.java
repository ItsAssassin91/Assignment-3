
public class Armstrong_between_1_and_500 {

	public static void main(String[] args) {
		System.out.println("Armstrong numbers between 1 and 500 are:");

        for (int num = 1; num <= 500; num++) {
            int sum = 0;
            int originalNum = num;
            int digits = 0;

            int temp = num;
            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            temp = num;
            while (temp > 0) {
                int lastDigit = temp % 10;

                int power = 1;
                for (int i = 0; i < digits; i++) {
                    power *= lastDigit;
                }

                temp /= 10;   // Remove last digit
            }

            if (sum == originalNum) {
                System.out.println(originalNum);
            }
        }
	}

}
