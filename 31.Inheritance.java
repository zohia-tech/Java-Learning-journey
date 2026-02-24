// Parent class (Super class)
class Animal {
    
    // Method of parent class
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class (Sub class) that inherits Animal
class Dog extends Animal {
    
    // Method of child class
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Main class to demonstrate inheritance
public class InheritanceSimple {

    public static void main(String[] args) {

        Dog d = new Dog(); // Creating object of child class

        d.eat();   // Calling inherited method from Animal (parent)
        d.bark();  // Calling own method of Dog (child)
    }
}
