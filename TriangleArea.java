package asd;
import java.util.Scanner;
public class TriangleArea {

	public static void main(String[] args) {
		int base,height,area;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base of Triangle");
		base = sc.nextInt();
		System.out.println("Enter the height of Triangle");
		height = sc.nextInt();
		area = (base*height);
		System.out.println("The Area of Triangle 0f base = "+base+ " and height = "+height+ " is " + area );
			
	}

}
