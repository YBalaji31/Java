import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieBookingSystem {
    static Scanner sc = new Scanner(System.in);
    static User currentUser;
	static ArrayList<String>tickets=new Arraylist<>();


	static{
		tickets.add("12-A");
		tickets.add("6-G");
		tickets.add("4-K");
		tickets.add("9-I");
		tickets.add("1-K");
		tickets.add("10-B");
		tickets.add("4-C");
	}
	
    public static void main(String[] args) {
        User[] users = {
            new User("jack", "jack@", 1000.0),
            new User("john", "john@", 1500.0)
        };

        System.out.println("---- Movie Ticket Booking System ----");
        while (true) {
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    login(users);
                    break;
                case 2:
                    System.out.println("Exiting Application...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public static void login(User[] users) {
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        for (User user : users) {
            if (user.getUsername().equals(username) && user.authenticate(password)) {
                currentUser = user;
                System.out.println("Login successful.");
                showMovieBookingMenu();
                return;
            }
        }
        System.out.println("Invalid credentials. Please try again.");
    }

    public static void showMovieBookingMenu() {
        while (true) {
            System.out.println("\n---- Movie Booking Menu ----");
			System.out.println("1. Show Available Ticket");
            System.out.println("2. Book Movie Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Display Booked Tickets");
            System.out.println("5. Logout");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
				case 1:
					availabletickets();
					break;
                case 2:
                    bookMovieTicket();
                    break;
                case 3:
                    cancelTicket();
                    break;
                case 4:
                    displayBookedTickets();
                    break;
                case 5:
                    System.out.println("Logging out...");
                    currentUser = null;
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }


	public static void availabletickets(){
		for(int i=0;i<tickets.size();i++){
			System.out.println(tickets.get(i));
		}
	}
    public static void bookMovieTicket() {
        System.out.print("Enter Movie Name: ");
        String movieName = sc.nextLine();
        System.out.print("Enter Theater Name: ");
        String theaterName = sc.nextLine();
        System.out.print("Enter Show Time: ");
        String showTime = sc.nextLine();
        System.out.print("Enter Seat Number: ");
        String seatNumber = sc.nextLine();
        System.out.print("Enter Ticket Price: ");
        double price = sc.nextDouble();
        sc.nextLine();
		boolean flag=true;
		for(int i=0;i<tickets.size();i++){
			if(tickets.get(i).equals(seatNumber)){
				flag=false;
			}
		}
		if(!flag){
				System.out.println("Enter free tickets only");
		}
        MovieTicket ticket = new MovieTicket(currentUser.getUsername(), price, movieName, theaterName, showTime, seatNumber);
		tickets.remove(seatNumber);
        if (currentUser.getBalance() >= ticket.getPrice()) {
            ticket.displayDetails();
            currentUser.deductBalance(ticket.getPrice());
            currentUser.addBookedTicket(ticket);
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Insufficient balance to book ticket.");
        }
    }

    public static void cancelTicket() {
        System.out.print("Enter Movie Name for cancellation: ");
        String movieName = sc.nextLine();

        List<Ticket> bookedTickets = currentUser.getBookedTickets();
        for (Ticket ticket : bookedTickets) {
          
                if (currentUser.cancelTicket(ticket)) {
                    System.out.println("Ticket cancelled successfully.");
                    return;
                }
            
        }
        System.out.println("Ticket not found or cancellation failed.");
    }

    public static void displayBookedTickets() {
        List<Ticket> bookedTickets = currentUser.getBookedTickets();
        if (bookedTickets.isEmpty()) {
            System.out.println("No tickets booked yet.");
        } else {
            System.out.println("---- Booked Movie Tickets ----");
            for (Ticket ticket : bookedTickets) {
                if (ticket instanceof MovieTicket) {
                    ticket.displayDetails();
                    System.out.println("-----------------------------");
                }
            }
        }
    }
}
