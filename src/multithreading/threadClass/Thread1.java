package multithreading.threadClass;

public class Thread1 extends Thread{
    //The run() method is instantiated if the thread was constructed using a separate Runnable object.
    public void run() {
        while (true) {
//            try {
//                //This blocks the currently running thread for the specified amount of time.
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            System.out.println("Thread 1 is running");
        }
    }
}
