package _03_LoopsMethodsClasses;

import java.util.Random;
import java.util.Scanner;

public class _06_RandomHandsOfCards {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		Random rd = new Random();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				int arr = rd.nextInt(14 -2) + 2;
					int first = rd.nextInt(4);
					switch(first) {
					case 1:
						if (2 <= arr && arr <= 10) {
						System.out.print("♣"+ arr + " ");
						}
						else if(10 < arr && arr <= 14) {
							String[] str = {"J", "Q", "K", "A"};
							int second = rd.nextInt(3);
							System.out.print("♣"+ str[second] + " ");
						}break;
					case 2:
						if (2 <= arr && arr <= 10) {
							System.out.print("♦"+ arr + " ");
							}
							else if(10 < arr && arr <= 14) {
								String[] str = {"J", "Q", "K", "A"};
								int second = rd.nextInt(3);
								System.out.print("♦"+ str[second] + " ");
							}break;
					case 3:
						if (2 <= arr && arr <= 10) {
							System.out.print("♥"+ arr + " ");
							}
							else if(10 < arr && arr <= 14) {
								String[] str = {"J", "Q", "K", "A"};
								int second = rd.nextInt(3);
								System.out.print("♥"+ str[second] + " ");
							}break;
					default:
						if (2 <= arr && arr <= 10) {
							System.out.print("♠"+ arr + " ");
							}
							else if(10 < arr && arr <= 14) {
								String[] str = {"J", "Q", "K", "A"};
								int second = rd.nextInt(3);
								System.out.print("♠"+ str[second] + " ");
							}break;
					}
			}
			System.out.println();
		}

	}

}
