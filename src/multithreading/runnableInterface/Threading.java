package multithreading.runnableInterface;

public class Threading {
//    public static void main(String[] args) {
////        Th1 bullet1= new Th1();
////        Thread gun1= new Thread(bullet1);
//        //another way of creating object of class implementing runnable interface
//        //Thread threadName = new Thread(new classImplementingRunnableInterface());
//        Thread gun1= new Thread(new Th1());
//
//        Th2 bullet2 = new Th2();
//        Thread gun2= new Thread(bullet2);
//
//
//
//        gun1.start();
//        gun2.start();
//
//    }

     //Implement runnable interface as Anonymous class
    public static void main(String[] args) {
        Runnable runnable= new Runnable(){
            public void run(){
                System.out.println("Runnable running");
                System.out.println("Runnable finished");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
