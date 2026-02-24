// Parent class
class Parent {

    // Method to display message
    void showMessage() {
        System.out.println("Message from Parent class");
    }
}

// Child class overriding Parent method
class Child extends Parent {

    // Method Overriding: same method name as in Parent
    @Override
    void showMessage() {
        System.out.println("Message from Child class");
    }
}

// Main class to demonstrate method overriding and polymorphism
public class MethodOverridingExample {

    public static void main(String[] args) {

        Parent p = new Parent();
        p.showMessage();  // Calls Parent's method

        Child c = new Child();
        c.showMessage();  // Calls Child's overridden method

        // Runtime polymorphism (Parent reference, Child object)
        Parent pc = new Child();
        pc.showMessage(); // Calls Child's method due to runtime polymorphism
    }
}
