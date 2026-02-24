abstract class Shape {
    // Abstract method (no body)
    abstract void area();

    // Normal method
    void welcome() {
        System.out.println("Welcome to Shape Calculator!");
    }
}

// Child class must implement abstract methods
class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    @Override
    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Circle c = new Circle(5);

        c.welcome();  // normal method from abstract class
        c.area();     // implemented abstract method
    }
}
