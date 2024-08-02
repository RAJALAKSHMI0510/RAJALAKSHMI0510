package asd;
import java.util.Scanner;

public class ELectricBill {

	public static void main(String[] args) {
		String name = null;
		int units;
		float Billamount,totalamount = 0;
	
		 Scanner sc = new Scanner(System.in);
			System.out.println("Enter your name: ");
			name=sc.nextLine();
			System.out.println("Enter the number of units consumed:");
			units=sc.nextInt();
		
		if(units>=1 && units<=100) {
			Billamount=(int) (units*2.0f);
		}
		else if(units>=100 && units<=200) {
			Billamount=(int) (100*2.0f+(units-100)*3.0f);
		}
		else {
			Billamount=(int) (100*2.0f+100*3.0f+(units-200)*5.0f);
		totalamount=Billamount+(Billamount*2.5f)/100;
		}
		System.out.println(" Name of the Customer:" +name );
		System.out.println("Number of units consumed:" +units);
		System.out.println("Billamount: " +totalamount);
		
	}

}
