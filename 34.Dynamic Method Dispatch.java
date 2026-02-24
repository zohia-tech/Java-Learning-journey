// Parent class
class Parent {

    // Method to display message
    void showMessage() {
        System.out.println("Message from Parent class");
    }
}

// Child class overriding Parent method
class Child extends Parent {

    // Overridden method
    @Override
    void showMessage() {
        System.out.println("Message from Child class");
    }
}

// Main class to demonstrate dynamic method dispatch
public class DynamicMethodDispatchExample {

    public static void main(String[] args) {

        Parent p;  // Reference of Parent class

        p = new Parent();
        p.showMessage();  // Calls Parent method

        p = new Child();
        p.showMessage();  // Calls Child method at runtime (dynamic method dispatch)
    }
}
