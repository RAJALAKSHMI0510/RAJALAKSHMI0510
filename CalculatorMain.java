package asd;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		int n1,n2,ans = 0;
	    String choice;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Calculator Menu");
		System.out.println("1.Addition");
		System.out.println("2.Subration");
		System.out.println("3.Multiplicatkion");
		System.out.println("4.Division");
		
		System.out.println("Enter choice");
		choice=sc.next();
		System.out.println("Enter two numbers");
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		switch(choice) {
		case "1.Addition":ans=n1+n2;
		System.out.println("The Sum of "+n1+ " and "+n2+ " is "+ans);
		break;
		case "2.Subration":ans=n1-n2;
		System.out.println("The difference of "+n1+ " and "+n2+ " is "+ans);
		break;
		case "3.Multiplicatkion":ans=n1*n2;
		System.out.println("The multiple of "+n1+ " and "+n2+" is "+ans);
		break;
		case "4.Division":if(n2!=0) { float qt = (float)n1/n2;
		System.out.println("The quotient of "+n1+" and "+n2+" is "+qt); 
		}
		else { 
			System.out.println("Divide by zero error");
		}
		break;
	 
		default : 
			System.out.println("Invalid"); 
		
		
	}
	}
}
	
	//int n1,n2,ans; String choice; Scanner sc = new Scanner(System.in); System.out.println("Calculator Menu"); System.out.println("Addition"); System.out.println("Subtraction"); System.out.println("Multiplication"); System.out.println("Division"); 
	//System.out.println("Enter your choice as complete word"); choice = sc.next(); System.out.println("Enter two numbers"); n1 = sc.nextInt(); n2 = sc.nextInt(); switch(choice) { case "Addition": ans = n1+n2; System.out.println("The sum of "+n1+" and "+n2+" is "+ans); break; case "Subtraction": ans = n1-n2; System.out.println("The difference of "+n1+" and "+n2+" is "+ans); break; case "Multiplication": ans = n1*n2; System.out.println("The product of "+n1+" and "+n2+" is "+ans); break;

//case "Division": if(n2!=0) { float qt = (float)n1/n2; System.out.println("The quotient of "+n1+" and "+n2+" is "+qt); } else { System.out.println("Divide by zero error");; } break; default : System.out.println("Invalid"); } }

