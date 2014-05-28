package _04_JavaCollectionsBasics;

import java.util.Scanner;

public class _03_LargestSequenceEqualStrings {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] strArr = str.split(" ");
		int counterTemp = 1;
		int counter = 1;
		int positionOfWord = 0;
		for (int i = 1; i < strArr.length; i++) {
			if (strArr[i].equals(strArr[i - 1])) {
				counterTemp++;
			} else {
				counterTemp = 1;
			}
			if (counterTemp > counter) {
				counter = counterTemp;
				positionOfWord = i;
			}
		}
		for (int j = 0; j < counter - 1; j++) {
			System.out.print(strArr[positionOfWord] + " ");
		}
		System.out.println(strArr[positionOfWord]);
	}
}
