package multithreading.runnableInterface;

public class Th1 implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.println("This is thread 2");
        }
    }
}
