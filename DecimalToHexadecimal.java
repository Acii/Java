import java.util.Scanner;


public class DecimalToHexadecimal {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		String hex = Integer.toHexString(num);
		System.out.printf("%S", hex);

	}

}
