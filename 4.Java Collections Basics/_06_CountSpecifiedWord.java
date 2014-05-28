package _04_JavaCollectionsBasics;

import java.util.Scanner;

public class _06_CountSpecifiedWord {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		String search = input.nextLine();
		int result = 0;
		@SuppressWarnings("unused")
		boolean found;
		String[] arr = text.split(" ,\\W+");
		for (int i = 0; i < arr.length; i++) {	
			if(found = arr[i].contains(search)) {
				result++;
			}
		}
		System.out.println(result);

	}

}
