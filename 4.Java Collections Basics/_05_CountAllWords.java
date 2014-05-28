package _04_JavaCollectionsBasics;

import java.util.Scanner;

public class _05_CountAllWords {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		String[] strArr = text.split("\\W+");
		int size = strArr.length;
		System.out.println(size);
	}

}
