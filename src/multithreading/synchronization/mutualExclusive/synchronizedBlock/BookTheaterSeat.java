//making method BookSeat synchronized

package multithreading.synchronization.mutualExclusive.synchronizedBlock;

public class BookTheaterSeat {
    int totalSeats=10;

    //how many seats user wants to book
    void bookSeat(int seats){
        //LOC that doesn't need Synchronization
        System.out.println(Thread.currentThread().getName()+" Welcome to ticket booking");
        System.out.println("movies type:");
        System.out.println(" Action\n Comedy\n Sci-fi\n Animated\n Romance\n");
        System.out.println("Exclusive offers available in pre-booking");
        //Logic that needs synchronization
        //place it in synchronized block
        //synchronized(object_reference_expression or this)
        synchronized (this) {
            if (totalSeats >= seats) {
                System.out.println(seats + " Seats Booked!");
                totalSeats = totalSeats - seats;
                System.out.println("seats left:" + totalSeats);
            } else {
                System.out.println("Enough seats unavailable");
                System.out.println("seats left:" + totalSeats);
            }
        }
    }
}
