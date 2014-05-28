import java.util.Scanner;


public class _08_CountOfEqualBitPairs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int count = 0;
		int maskZero = 0;
		int maskOne = 3;
		int mask = number >> 1;
		while (number != 0 || mask != 0 ) {
			boolean resultZero = ((number & mask) == maskZero);
			boolean resultOne = ((number & mask) == maskOne);
			if(resultZero) {
				count++;
			}
			else if (resultOne) {
				count++;
			}
			number = number >>1;
			mask = mask >> 1;
		}
		System.out.println(count);
		
	}

}
