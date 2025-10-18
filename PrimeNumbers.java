import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		
		boolean prime=true;
		
		if(num <= 1)
			prime=false;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				prime=false;
				
			}
		}
		if(prime) {
			System.out.println(num+" is prime");
		}
		else {
			System.out.println(num+" is not prime");
		}
		sc.close();
		
	}
	

}
