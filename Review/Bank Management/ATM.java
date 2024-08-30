//1(L3).Create an Automated Teller Machine Backend Logic using Encapsulation technique in Java

import java.util.*;

public class ATM {
    private ATMServices atmServices;

    public ATM() {
        atmServices = new ATMServices();
    }
	
	
	
	
	public void run(){
		Scanner sc=new Scanner(System.in);
		boolean flag = true;

        while (flag) {
            System.out.print("Enter username: ");
            String username = sc.nextLine();
            System.out.print("Enter password: ");
            String password = sc.nextLine();

            if (atmServices.login(username, password)) {
                boolean flag2= true;
                while (flag) {
                    System.out.println("1. Deposit");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Check Balance");
                    System.out.println("4. Exit");
                    System.out.print("Enter your choice: ");
                    int choice = sc.nextInt();
                    sc.nextLine();

                    switch (choice) {
                        case 1:
                            System.out.print("Enter amount to deposit: ");
                            double depositAmount = sc.nextDouble();
                            atmServices.deposit(username, depositAmount);
                            break;
                        case 2:
                            System.out.print("Enter amount to withdraw: ");
                            double withdrawAmount = sc.nextDouble();
                            atmServices.withdraw(username, withdrawAmount);
                            break;
                        case 3:
                            atmServices.checkBalance(username);
                            break;
                        case 4:
                           
                           flag2=false;
                            break;
                    }
                }
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        }
    }
	
	
	
	
	
    public static void main(String[] args) {
		
        ATM atm = new ATM();
		atm.run();
	}
}
