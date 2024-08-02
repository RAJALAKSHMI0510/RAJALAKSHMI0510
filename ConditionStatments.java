package asd;

import java.util.Scanner;

public class ConditionStatments {

	public static void main(String[] args) {
	//	int i = 15;
	//	if(i>10) {
	//		System.out.println("The value "+i+ " is greater the 10");
	//	}
	//	else {
	//		System.out.println("The value "+i+ " is not greater the 10");
	//	}
		
	
	// odd or even:
      //  int num;
      //  Scanner sc = new Scanner(System.in);
     //   System.out.println("Enter the number :");
     //   num=sc.nextInt();
     //   if(num %2==0) {
     //   	System.out.println(num+" is even number ");  	
    //   }
    //    else {
    //    	System.out.println(+num+" is odd number ");  	
		
		
//	 int num;
//	 Scanner sc = new Scanner(System.in);
//	 System.out.println("Enter the number :");
//	 num=sc.nextInt();
//	 if(num>0) {
//		 System.out.println(num+" positive number ");
	       	 	
//	      }
//	      else {
//	    	  System.out.println(num+" is negative number "); 
		
//        }
		
	//else if ladder----
		 int a,b,c,l;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the 3 number :");
		 a=sc.nextInt();
		 b=sc.nextInt();
		 c=sc.nextInt();
		 if(a>b && a>c) {
			 l=a;
			 
		 }else if(b>a && b>c) {
			 l=b;	 
		 }
		 else {
			 l=c;
		 }
		 System.out.println("The largest of " +a+" , "+b+ " and "+c+ " is "+l);
	}

}
