package asd;

import java.util.Scanner;

public class areaSC {

	public static void main(String[] args) {
		 char choice; 
		 float radius,base,height,length, breath,area; 
		 Scanner sc = new Scanner(System.in); 
		 System.out.println("Enter 'C' to find area of Circle"); 
		 System.out.println("Enter 'T' to find area of Triangle"); 
		 System.out.println("Enter 'S' to find area of Square"); 
		 System.out.println("Enter 'R' to find area of Reactangle"); 
		 System.out.println("Enter your choice"); 
		 choice = sc.next().charAt(0); 
		 // System.out.println("choice ="+choice); 
		 switch(choice) { 
		 case 'C':
			 System.out.println("Enter radius");
			 radius=sc.nextFloat();
			 area=3.14159f*radius*radius;
			 System.out.println("Area of Circle"+area); 
			 break; 
		 case 'T':
			 System.out.println("Enter base and height");
			 base=sc.nextFloat();
			 height=sc.nextFloat();
			 area=0.5f*base*height;
			 System.out.println("Area of Triangle"); 
			 break; 
		case 'S':
			System.out.println("Enter side");
			length=sc.nextFloat();
			 area=length*length;
			 System.out.println("Area of Square"); 
			 break;
		 case 'R':
			 System.out.println("Enter length and breath");
			length=sc.nextFloat();
			breath=sc.nextFloat();
			 area=length*breath;
			 System.out.println("Area of Rectangle"); 
			 break; 

	}
	}
}
