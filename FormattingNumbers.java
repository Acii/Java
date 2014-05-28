import java.util.Scanner;


public class FormattingNumbers {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		double b = input.nextDouble();
		double c = input.nextDouble();
		String hex, bin;
		if(0 <= a && a <= 500) {
			hex = Integer.toHexString(a);
			bin = Integer.toBinaryString(a);
			System.out.printf("|%-10S |%s| %10.2f|%-10.3f|", hex, bin, b, c);
		}
	}

}
