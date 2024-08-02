package asd;
import java.util.Scanner;
public class grade{

	public static void main(String[] args) {
		int marks;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks: ");
		marks=sc.nextInt();
		if(marks>90 && marks<=100) {
			System.out.println("Your Grade is A ");
		}
		else if(marks>=70 && marks<=89) {
			System.out.println("Your Grade is B ");
		}
		else if(marks>=50 && marks<=69) {
		System.out.println("Your Grade is C ");
		}
		else if(marks>=35 && marks<=49) {
			System.out.println("Your Grade is D ");
		}
		else if(marks>=34 && marks<=0) {
			System.out.println("Your Grade is E ");
		}
		else {
			System.out.println("INVALID MARKS ");
		}
	}
}

