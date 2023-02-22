//making method BookSeat synchronized

package multithreading.synchronization.mutualExclusive.staticSynchronization;

public class BookTheaterSeat {
    static int totalSeats=20;

    //how many seats user wants to book
    static synchronized void bookSeat(int seats){
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
