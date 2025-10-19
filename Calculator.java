import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the 1st number:");
		double num1=sc.nextInt();
		
		System.out.println("Enter the 2nd number:");
		double num2=sc.nextInt();
		
		System.out.println("enter the operation + - * / :");
		char op=sc.next().charAt(0);
		
		double result=0;
		
		sc.close();
		
		switch (op) {
		
		case '+':
			result=num1+num2;
			break;
			
		case '-':
			result=num1-num2;
			break;
			
		case '*':
			result=num1*num2;
			break;
			
		case '/':
			if(num2 != 0)
				result=num1/num2;
			else
				System.out.println("divison by zero is not possible!");
			break;
			
		default:
			System.out.println("invalid operation !");
			return;
			
		}
		
		System.out.println("Result:"+result);
		
		
	}

}
