// Creating a thread by extending Thread class
class MyThread extends Thread {

    // Overriding run() method to define thread behavior
    public void run() {
        System.out.println("Thread created by extending Thread class");
    }
}

public class ThreadExtendExample {

    public static void main(String[] args) {

        MyThread t = new MyThread(); // Create thread object
        t.start();                   // Start the thread (calls run() method)
    }
}
