// Base interface
interface Vehicle {

    // Abstract method to start vehicle
    void start();
}

// Derived interface inheriting Vehicle
interface ElectricVehicle extends Vehicle {

    // Abstract method to charge vehicle
    void charge();
}

// Class implementing ElectricVehicle interface
class Tesla implements ElectricVehicle {

    @Override
    public void start() {
        System.out.println("Tesla is starting"); // Implementation of Vehicle method
    }

    @Override
    public void charge() {
        System.out.println("Tesla is charging"); // Implementation of ElectricVehicle method
    }
}

// Main class to test interface inheritance
public class InterfaceInheritanceExample {

    public static void main(String[] args) {

        Tesla t = new Tesla(); // Creating Tesla object

        t.start();   // Call method from Vehicle interface
        t.charge();  // Call method from ElectricVehicle interface
    }
}
