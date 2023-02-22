package multithreading.synchronization.deadlock;

public class Example1 {
    public static void main(String[] args) {

        //resources
        final String resource1 = "Sid";
        final String resource2 = "Baby";

        //t1 tries to lock resource1 and then resource2
        Thread t1 = new Thread() {
            public void run() {
                System.out.println("t1 block start");
                synchronized (resource1) {
                    System.out.println("resource 1 ");
                    System.out.println("Thread1: locked resource 1");
                    try {
                        System.out.println("Start sleeping t1-resource1"+resource1);
                        Thread.sleep(100);
                        System.out.println("t1-resource1 awake now.");
                    } catch (Exception e) {

                    }
                    //resource 2 is in use with thread 2 needed by thread1
                    //resource 1 is in use with thread 1 needed by thread2
                    //hence a deadlock is encountered

                    synchronized (resource2) {
                        System.out.println("sync resource nested block"+resource2);
                        System.out.println("Thread1: locked resource 2");
                    }
                }
            }
        };

        //t2 tries to lock resource2 and then resource1
        Thread t2 = new Thread() {
            public void run() {
                System.out.println("t2 block start");
                synchronized (resource2) {

                    System.out.println("resource 2 ");

                    System.out.println("Thread2:locked resource 2");
                    try {
                        System.out.println("Start sleeping t2-resource2"+resource2);
                        Thread.sleep(100);
                        System.out.println("t2-resource2 awake now.");
                    } catch (Exception e) {}
                    synchronized (resource1) {
                        System.out.println("sync resource nested block"+resource1);

                        System.out.println("Thread2:locked resource 1");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}
