public class Animal {
	void eat() {
		System.out.println("This animal eats food");
		
	}

}


public class Dog extends Animal {
	void bark(){
		System.out.println("The dog is barking!");
		
	}

}


public class InheritanceExp {
	public static void main(String[] args) {
		Dog d = new Dog();
		System.out.println("both the classes are loaded");
		
		d.eat();
		d.bark();
		
		
	}

}
