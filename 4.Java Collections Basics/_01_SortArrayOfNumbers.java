package _04_JavaCollectionsBasics;

import java.util.Arrays;
import java.util.Scanner;

public class _01_SortArrayOfNumbers {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] number = new int[size];
		for (int i = 0; i < number.length; i++) {
			number[i] = input.nextInt();
		}
		Arrays.sort(number);
		for (int num : number) {
			System.out.print(num + " ");
		}

	}

}
