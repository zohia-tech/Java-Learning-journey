class MethodOverloadingExample {

    // Method 1: no parameters
    static void greet() {
        System.out.println("Hello!");
    }

    // Method 2: one int parameter
    static void greet(int times) {
        for(int i = 0; i < times; i++) {
            System.out.println("Hello! " + (i+1));
        }
    }

    // Method 3: two int parameters
    static void greet(int times, String name) {
        for(int i = 0; i < times; i++) {
            System.out.println("Hello " + name + "! " + (i+1));
        }
    }

    public static void main(String[] args) {
        // Call method with no parameters
        greet();

        // Call method with one parameter
        greet(3);

        // Call method with two parameters
        greet(2, "Zoii");
    }
}
