package asd;

import java.util.Scanner;

public class EvenoddSwitchCase {

	public static void main(String[] args) {
		int num;
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		switch (num%2) {
		case 0:
			System.out.println("The given number is Even");
			break;
		case 1:
			System.out.println("The given number is Odd");
			break;
			default:
				System.out.println("Invalid");	
			
		}
	}

}
