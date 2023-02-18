package multithreading.threadClass;

public class Thread2 extends Thread{
    @Override
    public void run() {
        super.run();
        while (true) {
            System.out.println("Thread 2 is running");
            //public static Thread currentThread()
            //It returns a reference to the currently running thread.
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getId());
        }
    }
}
