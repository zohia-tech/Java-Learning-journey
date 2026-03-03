// Class extending Thread to demonstrate thread priorities
class PriorityThread extends Thread {

    // Overriding run() method
    public void run() {
        System.out.println("Running: " + getName() + " with priority " + getPriority());
    }
}

public class ThreadPriorityExample {

    public static void main(String[] args) {

        PriorityThread t1 = new PriorityThread(); // Thread 1
        PriorityThread t2 = new PriorityThread(); // Thread 2

        t1.setPriority(Thread.MIN_PRIORITY); // Set priority 1 (lowest)
        t2.setPriority(Thread.MAX_PRIORITY); // Set priority 10 (highest)

        t1.start(); // Start first thread
        t2.start(); // Start second thread
    }
}
