import java.util.Scanner;
public class session {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 int temperature = scanner.nextInt();
	        int humidity = scanner.nextInt();

	        if ((temperature > 20 && humidity < 50) || (temperature > 30 && humidity > 70)) {
	            System.out.println("Condition 1");
	        } else if ((temperature <= 25 && humidity <= 60) || (temperature > 15 && humidity > 50)) {
	            System.out.println("Condition 2");
	        } else if ((temperature < 10 && humidity > 80) || (temperature > 50 && humidity < 20)) {
	            System.out.println("Condition 3:");
	        } else {
	            System.out.println("Default condition:");
	        }
	}

}
