import java.util.Random;
import java.util.Scanner;

public class CalculateArea {

	public static void main(String[] args) {
		
		float radius = 0;
		float area;
		
		System.out.println("Enter the radius of the circle");
		Scanner scn = new Scanner(System.in);
		radius = scn.nextFloat();
		area = calc_area(radius, null);
		System.out.println("Aread of the circle is " + area);
		
		scn.close();	
		}
	
	/**
	 * @param radius
	 * @param newParam 
	 * @return
	 */
	
	private static float calc_area(float radius, Object newParam) {
		return (float) (Math.PI * radius * radius);
	}
	

}
