package multithreading.threadClass;

public class MultiThreading {
    public static void main(String[] args) {
        Thread1 t1= new Thread1();
        Thread2 t2= new Thread2();
        //It starts the execution of the thread and then calls the run() on this Thread object.
       // t1.start();
        t2.start();
    }
}
