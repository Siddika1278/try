package multithreading.synchronization.mutualExclusive.staticSynchronization;
//Mutually Exclusive thread synchronization
//3. static synchronization
//when we have to deal with multiple objects


public class MovieBookApp{
    public static void main(String[] args) {
        //1st object
        BookTheaterSeat b1 =new BookTheaterSeat();

        //creating customers i.e threads
        //user1, thread1
        MyThread1 customer = new MyThread1(b1,7);
        customer.start();
        //2nd user, thread2
        MyThread1 customer2 = new MyThread1(b1,12);
        customer2.start();
        //2nd object
        BookTheaterSeat b2= new BookTheaterSeat();
        MyThread1 customer3 = new MyThread1(b2,7);
        customer3.start();
        //2nd user, thread2
        MyThread1 customer4 = new MyThread1(b2,8);
        customer4.start();


    }
}
