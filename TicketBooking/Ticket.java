public abstract class Ticket {
    protected String passengerName;
	
    protected double price;

    public Ticket(String passengerName, double price) {
        this.passengerName = passengerName;
        this.price = price;
    }

    public abstract void displayDetails();

    public double getPrice() {
        return price;
    }
}
