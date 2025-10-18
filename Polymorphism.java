public class Polymorphism {
	public static void main(String[] args) {
		Vehicles a;
		
		a = new bike();
		a.brand();
		a = new Car();
		a.brand();
		
	}
	
}

class Vehicles {
	void brand() {
		System.out.println("Both are reputed vehicle brands");
	}
	
}
class bike extends Vehicles {
	void brand() {
		System.out.println("Triumph is a bike brand");
		
	}
}
class Car extends bike{
	void brand() {
		System.out.println("Toyota is a car brand");
	}
}
