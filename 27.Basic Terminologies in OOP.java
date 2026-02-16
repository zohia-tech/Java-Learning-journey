class OOPTerminology {

    public static void main(String[] args) {

        // Class = blueprint (design of an object)
        // Object = instance of a class (real entity made from class)

        Student s1 = new Student(); // Creating object of Student class
        s1.name = "Ali";            // Assigning value to data member
        s1.age = 18;                // Assigning value to data member

        s1.display();               // Calling method using object
    }
}

class Student {

    String name;   // Data member (variable of class)
    int age;       // Data member

    // Method to display student details
    void display() {   
        System.out.println("Name: " + name); // Print name
        System.out.println("Age: " + age);   // Print age
    }
}
