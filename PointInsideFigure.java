import java.util.Scanner;


public class PointInsideFigure {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		double firstPoint = input.nextDouble();
		double secondPoint = input.nextDouble();
		
					
		if((12.5 <= firstPoint) && (firstPoint <= 22.5) && 
				(6 <= secondPoint) && (secondPoint <= 13.5)) {
			if ((17.5 <= firstPoint)&& (firstPoint <= 20) &&
					(8.5 <= secondPoint)) {
				System.out.println("Outside");
			}
			else {
			System.out.println("Inside");
			}
		}
		else {
			System.out.println("Outside");
		}
      
	}
}
