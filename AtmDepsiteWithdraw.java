package asd;

import java.util.Scanner;

public class AtmDepsiteWithdraw {

	public static void main(String[] args) {
		float balanceamount=5000,amount;
		Scanner sc= new Scanner(System.in);
		System.out.println("MENU FOR SBI");
		System.out.println("1.BALANCE ENQUIRE");
		System.out.println("2.WITHDRAW");
		System.out.println("3.DEPOSITE");
		
		System.out.println("Enter yur choice");
		int choice =sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("your balance amount :"+balanceamount);
			break;
		case 2:
			System.out.println("Enter money to be withdrawn");
			amount=sc.nextFloat();
			if(balanceamount>=amount) {
				balanceamount=balanceamount-amount;
			System.out.println("balance amount:"+balanceamount);}
			else {
				System.out.println("Insufficient balance");
			}
			break;
		case 3:
			System.out.println("Enter amount to deposite");
			amount=sc.nextFloat();
			balanceamount=balanceamount+amount;
			System.out.println("Money Deposited "+balanceamount);
			break;
			default:
				System.out.println("Invalid");
		}

	}

}
