package asd;
import java.util.Scanner;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
public class EmployeDetails {

	    public static void main(String[] args) throws IOException { // TODO Auto-generated method stub  

		int age; 
		float salary; 
		long phone;
		String name; 
		String email; 

		//InputStreamReader is=new InputStreamReader(System.in);
		//BufferedReader br =new BufferedReader(is); 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name="); 
		name=br.readLine(); 
		System.out.println("Enter age="); 
		age=Integer.parseInt(br.readLine()); 
		System.out.println("Enter Email="); 
		email=br.readLine(); 
		System.out.println("Enter Phone no="); 
		phone=(long) Double.parseDouble(br.readLine()); 
		System.out.println("Enter Salary="); 
		salary=Float.parseFloat(br.readLine()); 
		System.out.println("Employee details:"); 
		
		System.out.println("Name="+name);
		System.out.println("Employee age="+age);
		System.out.println("Salary="+salary);
		System.out.println("Phone No.="+phone);
		System.out.println("Employee Email="+email);
	}

}
