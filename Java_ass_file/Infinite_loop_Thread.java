// The infinite loops in the thread.
// Code of Infinite loop in the thread
public class Infinite_loop_Thread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Thread is running in an infinite loop.");
        }
    }

    public static void main(String[] args) {
        Infinite_loop_Thread thread = new Infinite_loop_Thread();
        // Start the thread
        thread.start();
    }
}