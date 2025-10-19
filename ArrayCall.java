import java.util.Scanner;

public class ArrayCall {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many numbers you want to store:");
		int n=sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("enter "+n+" numbers.");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("you entered:");
		for(int i=0;i<n;i++) {
			System.out.println("Number entered at index "+i+":"+arr[i]);
		}
		sc.close();
		
	}

}
