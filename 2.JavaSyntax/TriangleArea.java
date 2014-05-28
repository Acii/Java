import java.util.Scanner;


public class TriangleArea {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int aX = input.nextInt();
		int aY = input.nextInt();
		int bX = input.nextInt();
		int bY = input.nextInt();
		int cX = input.nextInt();
		int cY = input.nextInt();
		
		int areaA = (aX * (bY - cY));
		int areaB = (bX * (cY - aY));
		int areaC = (cX * (aY - bY));
		int area = Math.abs((areaA + areaB + areaC)/2);
		System.out.println(area);

	}

}
