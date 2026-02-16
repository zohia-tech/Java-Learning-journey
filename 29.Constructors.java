class ConstructorExample {

    public static void main(String[] args) {

        // Creating objects of Car class using constructor
        Car c1 = new Car("Honda", 2022);
        c1.showDetails();  // Display details of first car

        Car c2 = new Car("Toyota", 2024);
        c2.showDetails();  // Display details of second car
    }
}

class Car {

    String brand;      // Data member
    int modelYear;     // Data member

    // Constructor: used to initialize objects when created
    Car(String b, int y) {
        brand = b;
        modelYear = y;
    }

    // Method to display car details
    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model Year: " + modelYear);
    }
}
