// Class implementing Runnable interface to create a thread
class MyRunnable implements Runnable {

    // Overriding run() method to define thread behavior
    public void run() {
        System.out.println("Thread created using Runnable interface");
    }
}

public class RunnableExample {

    public static void main(String[] args) {

        MyRunnable r = new MyRunnable();    // Create Runnable object
        Thread t = new Thread(r);           // Pass Runnable object to Thread
        t.start();                          // Start the thread (calls run() method)
    }
}
