// Class extending Thread to demonstrate thread methods
class MethodThread extends Thread {

    // Overriding run() method
    public void run() {
        try {
            // Print current thread name
            System.out.println("Thread name: " + Thread.currentThread().getName());

            // Pause thread for 1 second (1000 milliseconds)
            Thread.sleep(1000);

            System.out.println("Thread finished");
        } 
        catch (Exception e) {
            System.out.println(e); // Handle interrupted exception
        }
    }
}

public class ThreadMethodExample {

    public static void main(String[] args) {

        MethodThread t = new MethodThread(); // Create thread object
        t.start();                           // Start the thread (calls run() method)
    }
}
