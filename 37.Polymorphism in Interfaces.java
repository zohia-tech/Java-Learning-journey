// Base interface
interface Animal {

    // Abstract method for animal sound
    void sound();
}

// Dog class implementing Animal interface
class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks"); // Dog's implementation of sound
    }
}

// Cat class implementing Animal interface
class Cat implements Animal {

    @Override
    public void sound() {
        System.out.println("Cat meows"); // Cat's implementation of sound
    }
}

// Main class demonstrating polymorphism using interface
public class InterfacePolymorphismExample {

    public static void main(String[] args) {

        Animal a; // Interface reference

        a = new Dog(); // Dynamic polymorphism: reference to Dog object
        a.sound();     // Calls Dog's method

        a = new Cat(); // Dynamic polymorphism: reference to Cat object
        a.sound();     // Calls Cat's method
    }
}
