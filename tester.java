import java.util.Scanner;

public class tester {
	
	public static void main(String[] args) {
		
	
		Scanner scan=new Scanner(System.in);
		
		int x,y;
		
		System.out.println("load");
		x=scan.nextInt();
		y=scan.nextInt();
		int z = addition.add(x,y);
	
		if(z>30)
		{
			System.out.println("value of z is:"+z);
			
		}
		else 
		{
			System.out.println("the number is less than 30"+z);
			
		}
			scan.close();
			
		
	}
	

}
