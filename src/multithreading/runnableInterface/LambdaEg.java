package multithreading.runnableInterface;
//implement runnable interface using lambda expression
public class LambdaEg {
    public static void main(String[] args) {
        Runnable runnable= () -> {
            //body of lambda expression, this is what will be executed when run of runnable is called
            String threadName= Thread.currentThread().getName();
            System.out.println(threadName+" running");
//            System.out.println("Lambda running");
//            System.out.println("Lambda finished");
        };
        Thread thread= new Thread(runnable);
        thread.start();
        Thread thread2= new Thread(runnable,"The thread 2");
        thread2.start();

    }
}
