package deadLock.withSynchronizedMethods;

public class Example1 {
    public static void main(String[] args) {

        //resources
        final String resource1 = "Sid";
        final String resource2 = "Baby";

        //t1 tries to lock resource1 and then resource2
        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread1: locked resource 1");
                    try { Thread.sleep(100);} catch (Exception e) {}
                    //resource 2 is in use with thread 2 needed by thread1
                    //resource 1 is in use with thread 1 needed by thread2
                    //hence a deadlock is encountered

                    synchronized (resource2) {
                        System.out.println("Thread1: locked resource 2");
                    }
                }
            }
        };

        //t2 tries to lock resource2 and then resource1
        Thread t2 = new Thread() {
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread2:locked resource 2");
                    try { Thread.sleep(100);} catch (Exception e) {}
                    synchronized (resource1) {
                        System.out.println("Thread2:locked resource 1");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}
