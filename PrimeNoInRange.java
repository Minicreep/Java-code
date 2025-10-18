import java.util.Scanner;

public class PrimeNoInRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Start and end range:");
		int start=sc.nextInt();
		int end=sc.nextInt();
		
		System.out.println("the prime numbers btw "+start+" and "+end+" are:");
		
		for(int i=start;i<=end;i++) {
			if(isPrime(i)) {
				System.out.println(i+" ");
			}
		}
		sc.close();
		
	}



static boolean isPrime(int num) {
	if(num <=1) {
		return false;
	}
	for(int i=2;i<=Math.sqrt(num);i++) {
		if(num %i==0) {
			return false;
		}
	}
	return true;
	}
		
	
	
}
