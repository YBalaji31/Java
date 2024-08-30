public class MovieTicket extends Ticket {
    private String movieName;
    private String theaterName;
    private String showTime;
    private String seatNumber;

    public MovieTicket(String passengerName, double price, String movieName, String theaterName, String showTime, String seatNumber) {
        super(passengerName, price);
        this.movieName = movieName;
        this.theaterName = theaterName;
        this.showTime = showTime;
        this.seatNumber = seatNumber;
    }

    public void displayDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Theater: " + theaterName);
        System.out.println("Show Time: " + showTime);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price:" + price);
    }
}
