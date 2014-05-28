import java.util.Scanner;


public class TheSmallestNumbers {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double small = 0;
		if(a <= b && a <= c) {
			small = a;
		}
		else if (b <= c && b<=a ) {
			small = b;
		}
		else {
			small = c;
		}
		System.out.println(small);

	}

}
