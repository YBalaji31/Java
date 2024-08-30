import java.util.ArrayList;
import java.util.List;

public class ATMServices {
    private List<Account> accounts;

    public ATMServices() {
        accounts = new ArrayList<>();
        accounts.add(new Account("john", "john@", 1000));
        accounts.add(new Account("jack", "jack@", 2000));
        accounts.add(new Account("kim", "kim@", 500));
    }

    public boolean login(String username, String password) {
		//System.out.println(username+" "+password);
        for (Account account:accounts) {
			//System.out.println(account.getUsername()+" "+account.getPassword());
            if (account.getUsername().equals(username) && account.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public void deposit(String username, double amount) {
        Account account = findAccountByUsername(username);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found");
        }
    }

    public void withdraw(String username, double amount) {
        Account account = findAccountByUsername(username);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found");
        }
    }

    public void checkBalance(String username) {
        Account account = findAccountByUsername(username);
        if (account != null) {
            System.out.println("Balance for " + username + ":" + account.getBalance());
        } else {
            System.out.println("Account not found");
        }
    }

    private Account findAccountByUsername(String username) {
        for (Account account : accounts) {
            if (account.getUsername().equals(username)) {
                return account;
            }
        }
        return null;
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
