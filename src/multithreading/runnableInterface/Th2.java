package multithreading.runnableInterface;

public class Th2 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.println("I'm thread 1");
        }
    }
}
