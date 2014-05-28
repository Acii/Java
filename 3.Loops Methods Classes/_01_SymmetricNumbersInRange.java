package _03_LoopsMethodsClasses;

import java.util.Scanner;

public class _01_SymmetricNumbersInRange {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int startNum = input.nextInt();
		int endNum = input.nextInt();
		for (int i = startNum; i <= endNum; i++, startNum++) {
			searchSymmantric(startNum, i);
		}

	}

	private static void searchSymmantric(int startNum, int i) {
		int firstNum;
		int secondNum;
		if(i <10) {
			System.out.printf("%d ", i);
		}
		else if (i < 100) {
			firstNum = startNum / 10;
			secondNum = i % 10;
			if(firstNum == secondNum) {
				System.out.printf("%d ", i);
			}
		}
		else {
			firstNum = i / 100;
			secondNum = i % 10;
			if(firstNum == secondNum) {
				System.out.printf("%d ", i);
			}
		}
	}

}
