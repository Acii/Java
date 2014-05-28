package _04_JavaCollectionsBasics;

import java.util.Scanner;

public class _02_SequencesOfEqualStrings {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] strArr = str.split(" ");
		String sort = strArr[0];
		for (int i = 1; i < strArr.length; i++) {
			if(strArr[i].equals(sort)) {
				System.out.print(strArr[i] + " ");	
			}
			else {
				System.out.println(strArr[i - 1]);
			}
			sort = strArr[i];
		}
		System.out.println(sort);

	}

}
