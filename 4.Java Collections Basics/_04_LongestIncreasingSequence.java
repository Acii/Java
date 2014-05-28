package _04_JavaCollectionsBasics;

import java.util.Scanner;

public class _04_LongestIncreasingSequence {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] arr = str.split(" ");
		int[] line = new int [arr.length];
		for (int i = 0; i < line.length; i++) {
			line[i] = Integer.parseInt(arr[i]);
		}
		int counterTemp = 1;
		int counter = 1;
		int positionOfInt = 0;
		System.out.print(line[0]);
		for (int i = 1; i < arr.length; i++) {
			if (line[i] > line[i - 1]) {
				counterTemp++;
				System.out.print(" " + line[i]);
			} else {
				counterTemp = 1;
				System.out.println();
				System.out.print(line[i]);
			}
			if (counterTemp > counter) {
				counter = counterTemp;
				positionOfInt = i;
			}
		}
		System.out.println();
		System.out.print("Longest: ");
		for (int j = 0; j < counter - 1; j++) {
			System.out.print(line[positionOfInt - counter + 1 + j] + " ");
		}
		System.out.println(line[positionOfInt]);
	}
}
