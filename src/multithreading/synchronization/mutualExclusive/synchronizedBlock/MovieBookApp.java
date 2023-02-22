package multithreading.synchronization.mutualExclusive.synchronizedBlock;
//Mutually Exclusive thread synchronization
//2. Synchronized block
//we just write the part of code that needs synchronization in the Synchronized block.
//this will reduce the waiting time of the thread

public class MovieBookApp extends Thread{
    //to call bookSeats method of class BookTheaterSeat create an object of that class
    //Reference of the class, as main method is static we have to make it static
    static BookTheaterSeat b;
    int seats;
    @Override
    public void run() {
        super.run();
        //calling method
        //this value of seats we'll take from users
        b.bookSeat(seats);
    }

    public static void main(String[] args) {
        //created object
        b = new BookTheaterSeat();

        //creating customers i.e threads
        //user1, thread1
        MovieBookApp user1= new MovieBookApp();
        user1.setName("User 1");
        //No. of seats user1 wants
        user1.seats=7;
        user1.start();

        //2nd user, thread2
        MovieBookApp user2= new MovieBookApp();
        user1.setName("User 2");
        user2.seats=5;
        user2.start();

    }
}
