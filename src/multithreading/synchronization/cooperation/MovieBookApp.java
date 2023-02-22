package multithreading.synchronization.cooperation;

public class MovieBookApp {
    public static void main(String[] args) throws InterruptedException {
        //create object of class TotalEarning
        TotalEarnings te= new TotalEarnings();
        te.start();
//        //here we'll get ans o and not 1000 because
//        //our main thread is running, also now thread 0 is started
//        //so till thread 0 will calculate total earnings, the main method could have executed this part
//        System.out.println("Total earnings:"+te.total+" rs");
        //now to solve this we would want our main thread to go in waiting part until tread 0 has finished calculation
        //we'll use synchronized block
        synchronized (te){
            //when main thread executes this line , it'll release the lock it acquired and thread 0 will acquire it
            //So we also have to achieve synchronization for it(see TotalEarnings)
            te.wait();
            System.out.println("Total earnings:"+te.total+" rs");
        }
    }
}
