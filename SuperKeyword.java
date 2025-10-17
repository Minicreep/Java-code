class Parent {
    int num = 100;

    Parent() {
        System.out.println("Parent class constructor called");
    }

    void display() {
        System.out.println("Display method of Parent class");
    }
}

class Child extends Parent {
    int num = 200;

    Child() {
       
        super();
        System.out.println("Child class constructor called");
    }

    void show() {
   
        System.out.println("Parent num = " + super.num);
        System.out.println("Child num = " + num);

       
        super.display();
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}
