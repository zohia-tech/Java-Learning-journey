// Parent class
class Parent {

    // Constructor of Parent class
    Parent() {
        System.out.println("Parent constructor called");
    }
}

// Child class inheriting Parent
class Child extends Parent {

    // Constructor of Child class
    Child() {
        super(); // Calls Parent constructor (optional, called automatically)
        System.out.println("Child constructor called");
    }
}

// Main class to test constructors
public class ConstructorInheritanceExample {

    public static void main(String[] args) {

        Child c = new Child(); // Creating object of Child class
        // Output will show Parent constructor first, then Child constructor
    }
}
