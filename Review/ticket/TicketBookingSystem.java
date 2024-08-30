//Write a simple ticket booking system using polymorphism in Java


import java.util.*;

class Ticket
 {
    String passengerName;
    public Ticket(String passengerName) 
    {
        this.passengerName=passengerName;
    }

  public void bookTicket() 
    {
        System.out.println("Booking ticket for: "+passengerName);
    }

  public void displayDetails() 
    {
        System.out.println("Passenger Name: "+passengerName);
    }
}

class BusTicket extends Ticket
 {
    String busNumber;
    int seatNumber;
    static int seatCounter=1;
	static int totalseat=2;
    public BusTicket(String passengerName,String busNumber)
    {
        super(passengerName);
        this.busNumber=busNumber;
        this.seatNumber=seatCounter++;
    }

    public void bookTicket()
    {
        	TicketBookingSystem.busdetails.add("Passenger: "+passengerName+" on train: "+busNumber+" at berth: B"+seatNumber);
		System.out.println("Booking bus ticket for: "+passengerName+" on bus: "+busNumber+" at seat: S"+seatNumber);
    }

    public void displayDetails()
    {
        System.out.println("------Bus Ticket Details-------");
        super.displayDetails();
        System.out.println("Bus Number: "+busNumber);
        System.out.println("Seat Number: S"+seatNumber);
    }
}

class TrainTicket extends Ticket
 {
    String trainNumber;
    int berthNumber;
	static int totalseat=2;
    static int berthCounter=1; 

    public TrainTicket(String passengerName, String trainNumber)
    {
        super(passengerName);
        this.trainNumber=trainNumber;
        this.berthNumber=berthCounter++;
    }

    public void bookTicket()
    {
        System.out.println("Booking train ticket for: "+passengerName+" on train: "+trainNumber+" at berth: B"+berthNumber);
		TicketBookingSystem.traindetails.add("Passenger: "+passengerName+" on train: "+trainNumber+" at berth: B"+berthNumber);
    }

    public void displayDetails() 
    {
        System.out.println("-----Train Ticket Details-------");
        super.displayDetails();
        System.out.println("Train Number: "+trainNumber);
        System.out.println("Berth Number: B"+berthNumber);
    }
}



public class TicketBookingSystem
 {
    static int busprice=731;
	static int trainPrice=459;
	static ArrayList<String>busdetails=new ArrayList<>();
	static ArrayList<String>traindetails=new ArrayList<>();
	
	
	public static void displayBusDetails(){
		System.out.println();
		for(String s:busdetails){
			System.out.println(s);
			System.out.println();
		}
	}
	
	
	public static void displayTrainDetails(){
		System.out.println();
		for(String s:traindetails){
			System.out.println(s);
			System.out.println();
		}
	}
	
public static void main(String[] args)
  {
        Scanner sc = new Scanner(System.in);
        while(true)
	 {
            System.out.println("----Ticket Booking System-----");
             System.out.println("1. Book Bus Ticket");
            System.out.println("2. Book Train Ticket");
			System.out.println("3. Display Booked Bus Details");
			System.out.println("4. Display Booked Train Details");
            System.out.println("5. Exit");
          System.out.print("Enter choice: ");
          int choice = sc.nextInt();
          sc.nextLine();
          Ticket ticket = null;
         switch(choice) 
	    {
                case 1:
                    System.out.print("Enter Passenger Name: ");
                    String busPassengerName = sc.nextLine();
                    System.out.print("Enter Bus Number: ");
                    String busNumber = sc.nextLine();

					if(BusTicket.totalseat<BusTicket.seatCounter){
						System.out.println("Seat is full");
						break;
					}
					
                    Ticket busticket=new BusTicket(busPassengerName,busNumber); 
					
                    busticket.bookTicket();
                    busticket.displayDetails();

                    System.out.println("Bus Ticket Price: "+busprice);
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Enter Passenger Name: ");
                    String trainPassengerName = sc.nextLine();
                    System.out.print("Enter Train Number: ");
                    String trainNumber = sc.nextLine();
					if(TrainTicket.totalseat<TrainTicket.berthCounter){
						System.out.println("Seat is full");
						break;
					}
                    Ticket trainticket = new TrainTicket(trainPassengerName,trainNumber);
                    trainticket.bookTicket();
                    trainticket.displayDetails();

                    System.out.println("Train Ticket Price: " + trainPrice);
                    System.out.println();
                    break;

				case 3:
					displayBusDetails();
					break;
					
				case 4:
					displayTrainDetails();
					break;
					
                case 5:
                    System.out.println("----Exiting Application----");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
