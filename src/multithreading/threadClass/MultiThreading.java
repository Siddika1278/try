package multithreading.threadClass;

public class MultiThreading {
    public static void main(String[] args) {
        Thread1 t1= new Thread1();
        Thread2 t2= new Thread2();
//        It starts the execution of the thread and then calls the run() on this Thread object.
//       try{
//           causes current thread to block for specific amount of milliSeconds
//           t1.join();
//       } catch (InterruptedException e) {
//           throw new RuntimeException(e);
//       }
//        if start thread then it's priority will be default i.e 5 only
        t1.start();
        t2.start();
        System.out.println("Priority is:"+t1.getPriority());
//        t1.setPriority(8);
//        //starting thread after setting priority will return the priority we set
//        t1.start();
//        //to set name of the thread
//        t1.setName("Example Name");
//        System.out.println("New name of Thread1 is:"+t1.getName());
//        //checks if thread is alive
//        System.out.println("Is thread Alive?\n"+t1.isAlive());
//        //Stop currently running thread
//        t1.stop();
//        System.out.println("Is thread Alive?\n"+t2.isAlive());
//        t2.start();
//        t1.start();
//        t2.suspend();

        //t2.resume();

        t1.checkAccess();
        System.out.println("has access");

    }
}
