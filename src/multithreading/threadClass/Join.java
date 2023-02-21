package multithreading.threadClass;

public class Join {
    public static void main(String[] args) throws InterruptedException {
        Thread1 t= new Thread1();
        Thread2 t2= new Thread2();
        t.start();
        //join thread t, program will wait for the thread to end before continuing
        t.join();
        t2.start();

    }
}
