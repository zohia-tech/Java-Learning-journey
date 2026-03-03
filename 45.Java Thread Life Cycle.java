// Class extending Thread to demonstrate thread life cycle
class LifeCycleThread extends Thread {

    // Overriding run() method
    public void run() {
        System.out.println("Thread is running");
    }
}

public class ThreadLifeCycleExample {

    public static void main(String[] args) {

        LifeCycleThread t = new LifeCycleThread(); // Create thread object

        // State of thread after creation (NEW)
        System.out.println("State after creation: " + t.getState());

        t.start(); // Start thread, moves to RUNNABLE state

        // State immediately after start (may vary depending on scheduler)
        System.out.println("State after start: " + t.getState());
    }
}
