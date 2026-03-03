// Thread class extending example: creating multiple threads
class MyThread1 extends Thread {

    // Overriding run() method to define thread behavior
    public void run() {
        System.out.println("Thread 1 is running");
    }
}

class MyThread2 extends Thread {

    // Overriding run() method to define thread behavior
    public void run() {
        System.out.println("Thread 2 is running");
    }
}

// Main class to demonstrate multithreading
public class MultiThreadingDemo {

    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1(); // Create first thread
        MyThread2 t2 = new MyThread2(); // Create second thread

        t1.start(); // Start first thread (calls run())
        t2.start(); // Start second thread (calls run())
    }
}
