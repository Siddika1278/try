package multithreading.threadClass;


    public class JavaHoldLockExp implements Runnable
    {
        public void run()
        {
            System.out.println("Currently executing thread is: " + Thread.currentThread().getName());
            System.out.println("Does thread holds lock? " + Thread.holdsLock(this));
            synchronized (this)
            {
                System.out.println("Does thread holds lock? " + Thread.holdsLock(this));
            }
        }
        public static void main(String[] args)
        {
            JavaHoldLockExp g1 = new JavaHoldLockExp();
            Thread thread1 = new Thread(g1);
            thread1.start();
        }
    }

