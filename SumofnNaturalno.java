package asd;

public class SumofnNaturalno {

	public static void main(String[] args) {
		int sum=0;
		for (int i=1;i<=100;i++) {//even --->for (int i=2;i<=100;i=i+2){sum=sum+i}
			//oddn --->for (int i=1;i<=100;i=i+2){sum=sum+i}           
			sum=sum+i;
			System.out.println("sum of 1 to 100 naturral number is " +sum);
		}
	

	}

}
