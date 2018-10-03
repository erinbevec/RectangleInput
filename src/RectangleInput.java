/**
 * Erin Bevec
 * Rectangle Input
 * Period 6 Comp Sci
 */
import java.util.Scanner;
public class RectangleInput 
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Length of rectange: ");
		double length = in.nextDouble();
		in.nextLine();
		System.out.print("Width of rectange: ");
		double width = in.nextDouble();
		in.nextLine();
		in.close();
		
		double area = length * width;
		double perimeter = 2 * length + 2 * width;
		double diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
		
		
		System.out.printf("The area is %6.2f", area);
		System.out.println();
		System.out.printf("The perimeter is %6.2f", perimeter);
		System.out.println();
		System.out.printf("The length of the diagonal is %6.2f", diagonal);
		System.out.println();
	}

}

