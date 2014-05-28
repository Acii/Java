package _03_LoopsMethodsClasses;

import java.util.Scanner;

public class _02_Generate3LetterWords {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				for (int j2 = 0; j2 < ch.length; j2++) {
					System.out.println(ch[i] + "" + ch[j]+ "" + ch[j2] + "");
				}
			}
		}
	}

}
