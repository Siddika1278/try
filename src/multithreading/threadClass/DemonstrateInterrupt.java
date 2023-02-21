package multithreading.threadClass;

public class DemonstrateInterrupt extends Thread {
    public void run(){

        try {
            Thread.sleep(500);

            System.out.println("Now I'm awake");
        } catch (InterruptedException e) {
            //System.out.println("Interrupted!! I was sleeping!");
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        DemonstrateInterrupt thread = new DemonstrateInterrupt();
        Thread2 t2 = new Thread2();
        thread.start();
        t2.start();
//        System.out.println("is interrupted?"+thread.isInterrupted());
        //This method of a thread is used to interrupt the currently executing thread.
        // This method can only be called when the thread is in sleeping or waiting state.
//        try {
//            thread.interrupt();
//        } catch (Exception e) {
//            System.out.println("Exception handled " + e);
//        }
//        System.out.println("is interrupted?"+thread.isInterrupted());
//        System.out.println("interrupted!"+thread.interrupted());

        //
    }
}
