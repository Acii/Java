import java.util.Scanner;


public class _09_PointsInsideTheHouse {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		double y = input.nextDouble();
		double x1 = 12.5, y1 = 8.5;
		double x2 = 17.5, y2 = 3.5;
		double x3 = 22.5, y3 = 8.5;
		
		double abc = Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2))/2);
		double acb = Math.abs((x1 * (y2 - y) + x2 * (y - y1) + x * (y1 - y2))/2);
		double bac = Math.abs((x1 * (y - y3) + x * (y3 - y1) + x3 * (y1 - y))/2);
		double bca = Math.abs((x * (y2 - y3) + x2 * (y3 - y) + x3 * (y - y2))/2);
		boolean result = (12.5 <= x && x <= 17.5 && (8.5 <= y && y <= 13.5));
		if ((acb + bac + bca) == abc) {
			System.out.println("Inside");
		}
		else if (result) {
			System.out.println("Inside");
		}
		else if (20 <= x && x <= 22.5) {
			System.out.println("Inside");
		}
		else if (17.5 <= x && x <= 20 && 8.5 <= y && y <= 13.5 ) {
			System.out.println("Outside");
			
		}
		else {
			System.out.println("Outside");
		}
	}
}