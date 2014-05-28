import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int firstNumber = input.nextInt();
		int secondNumber = input.nextInt();
		System.out.println(firstNumber * secondNumber);
	}

}
