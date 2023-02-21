package multithreading.threadClass;
//public void destroy()
//
//This thread method destroys the thread group as well as its subgroups.

public class DemonstrateDestroy extends Thread{
    DemonstrateDestroy(String threadName, ThreadGroup tg){
            super(tg,threadName);
            start();
    }

    public void run(){
        System.out.println(Thread.currentThread().getName()+" Finished executing");
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadGroup g1= new ThreadGroup("Parent Thread");
        ThreadGroup g2= new ThreadGroup(g1,"child thread");

        DemonstrateDestroy t1= new DemonstrateDestroy("Thread 1",g1);
        DemonstrateDestroy t12= new DemonstrateDestroy("Thread 12",g1);
        DemonstrateDestroy t2= new DemonstrateDestroy("Thread 2",g2);

        System.out.println("number of active thread: "+ g1.activeCount());
        System.out.println("number of active thread: "+ g2.activeCount());

        //need to add exception to method Signature/ surround join with try catch block
        //to create breakpoint
        t1.join();
        t2.join();

        //This method of the thread is used to return the no. of active threads in the
        // currently executing thread’s thread group.
        System.out.println("number of active thread: "+ g1.activeCount());

//        g2.destroy();
//        System.out.println(g2.getName()+" destroyed");
//
//        g1.destroy();
//        System.out.println(g1.getName()+" destroyed");


    }
}
