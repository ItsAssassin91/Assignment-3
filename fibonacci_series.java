
public class fibonacci_series {

	public static void main(String[] args) {
		int n = 10;
		int first = 0,  second = 1;
		
		System.out.println("Fibonacci series up to " + n + " terms ");
		for (int i = 0; i < n; i++) {
			System.out.println(first + " ");
			
			int next = first + second;
			first = second;
			second = next;
			
		}
		
	}

}