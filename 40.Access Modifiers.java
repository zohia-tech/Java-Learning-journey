// Class demonstrating different access modifiers
class Student {

    public String name = "Ali";     // public: accessible from anywhere
    private int age = 18;           // private: accessible only inside this class
    protected String grade = "A";   // protected: accessible in same package or subclasses

    // Public method to access private variable (getter)
    public int getAge() {
        return age; // Returning private variable
    }
}

public class AccessModifierExample {

    public static void main(String[] args) {

        Student s = new Student(); // Creating object of Student class

        System.out.println("Name: " + s.name);    // Accessing public variable
        System.out.println("Grade: " + s.grade);  // Accessing protected variable
        System.out.println("Age: " + s.getAge()); // Accessing private variable using public method
    }
}
