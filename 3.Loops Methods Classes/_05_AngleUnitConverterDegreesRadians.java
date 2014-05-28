package _03_LoopsMethodsClasses;

import java.util.Scanner;

public class _05_AngleUnitConverterDegreesRadians {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		String[] strDegRad = new String[n * 2];
			for (int i = 0; i < strDegRad.length; i++) {
				strDegRad[i] = input.next();
			}
		for (int i = 0; i < strDegRad.length; i++) {
			if(strDegRad[i].equals("deg")) {
				double valueRad = Double.parseDouble(strDegRad[i -1]);
				System.out.printf(((double)(valueRad) * (Math.PI/180)) + " rad\n");
			}
			else if (strDegRad[i].equals("rad")) {
				double valueDeg = Double.parseDouble(strDegRad[i -1]);
				System.out.printf(((double)(valueDeg* (180/Math.PI)) + " deg\n"));
			}
		}

	}

}
