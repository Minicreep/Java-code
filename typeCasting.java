import java.util.Scanner;

public class typeCasting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name:");
		String name=sc.nextLine();
		
		System.out.println("Enter surname:");
		String surname=sc.nextLine();
		
		int num1=0, num2=0;
		
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(Character.isDigit(ch)) {
				num1=num1 * 10 + Character.getNumericValue(ch);
			
			
			}
		}
		
		for(int i=0;i<surname.length();i++) {
			char ch=surname.charAt(i);
			if(Character.isDigit(ch)) {
				num2= num2 * 10 + Character.getNumericValue(ch);
			
			}
		}
		
		int sum= num1+num2;
		
		System.out.println("name:"+name);
		System.out.println("surname:"+surname);
		System.out.println("sum:"+sum);
		
		sc.close();
		
		
	}

}
