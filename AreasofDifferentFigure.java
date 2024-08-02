package asd;

import java.util.Scanner;

public class AreasofDifferentFigure {

	public static void main(String[] args) {
		int r,l,a,b,b1,h,ans=0;
		String choice;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Figure Menu");
		System.out.println("1.Square");
		System.out.println("2.Rectangle");
		System.out.println("3.Circle");
		System.out.println("4.Triangle");
		System.out.println("Enter choice");
		choice=sc.next();
		
		switch(choice) {
		case "1.Square":
			System.out.println("Enter side of Square ");
			a =sc.nextInt();
			ans=a*a;
			System.out.println("The Area of Square 0f side "+a+" is " + ans );
			break;
		case "2.Rectangle":
			System.out.println("Enter the length of Rectangle");
			l =sc.nextInt();
			System.out.println("Enter the breath of Rectangle");
			b =sc.nextInt();
			ans=l*b;
			System.out.println("The Area of Rectangle 0f length "+l+ " and breath "+b+ " is " + ans );
			break;
			case "3.Circle":
				System.out.println("Enter radius of circle");
			r =sc.nextInt();
			ans=(22/7)*r*r;
			System.out.println("The Area of Circle 0f radius "+r+" is " + ans );
			break;
		case "4.Triangle":
			System.out.println("Enter the base of Triangle");
			b1 =sc.nextInt();
			System.out.println("Enter the height of Triangle");
			h =sc.nextInt();
			ans=(int) (0.5*b1*h);
			System.out.println("The Area of Rectangle 0f  base "+b1+ " and height "+h+ " is " + ans );
			break;
			default:
				System.out.println("Invalid");

	}
	}
}
