import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private double balance;
    private List<Ticket> bookedTickets;

    public User(String username, String password, double balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
        this.bookedTickets = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public boolean authenticate(String password) {
        return this.password.equals(password);
    }

    public double getBalance() {
        return balance;
    }

    public void deductBalance(double amount) {
        balance -= amount;
    }

    public void addBalance(double amount) {
        balance += amount;
    }

    public void addBookedTicket(Ticket ticket) {
        bookedTickets.add(ticket);
    }

    public boolean cancelTicket(Ticket ticket) {
        if (bookedTickets.remove(ticket)) {
            addBalance(ticket.getPrice() * 0.9);
            return true;
        }
        return false;
    }

    public List<Ticket> getBookedTickets() {
        return bookedTickets;
    }
}
