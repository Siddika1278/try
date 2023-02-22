package multithreading.synchronization.cooperation;

public class TotalEarnings extends Thread{
    int total =0;
    public void run() {
        synchronized (this) {
            //now thread 0 has acquired the lock
            for (int i = 0; i < 10; i++) {
                total += 100;
            }
            //It'll release the lock and main can acquire it start executing again
            this.notify();
        }
    }
}
