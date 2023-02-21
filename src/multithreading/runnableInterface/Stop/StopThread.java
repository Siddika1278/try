package multithreading.runnableInterface.Stop;

public class StopThread {
    public static void main(String[] args) {
        StoppableRunnable sr= new StoppableRunnable();
        Thread thread= new Thread(sr,"The thread");
        thread.start();

        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Requesting stop");
        sr.requestStop();
        System.out.println("stop requested");
    }
}
