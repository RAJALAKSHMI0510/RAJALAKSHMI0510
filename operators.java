package asd;

import java.util.Scanner;

public class operators {
	public static void main(String[] args) {
		int i,k,large;
		i=5;
		k=i%2;// gives reminder
		System.out.println("k=" +k);
		System.out.println("i=" +i);
		int n1,n2,n3,n4;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		n1=sc.nextInt();
		System.out.println("Enter second number");
		n2=sc.nextInt();
		System.out.println("Enter Third number");
		n3=sc.nextInt();
		System.out.println("Enter fourth number");
		n4=sc.nextInt();
		
 large = (n1>n2 && n1>n3 && n1>n4)?n1:(n2>n1 && n2>n3 && n2>n4)?n2:(n3>n1 && n3>n2 && n3>n4)?n3:n4;
		System.out.println("The largest number 0f "+n1+ " , " +n2+" , "+n3+" and " +n4+ " is "+large);
		
	//	int a,b;
	//	a=5;
	//	b=3;
	//	a=a+5;
	//	a+=5; //+= short hand assg opr
	//	a=b+5;
	//	System.out.println(a);
	//	System.out.println(b);
	}

}
