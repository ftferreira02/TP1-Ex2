/**
 * The Account class represents a bank account. Each bank account is associated with one or more {@link Client} (see
 * also {@link Client#addAccount(Account...)}). Operations allowed are: withdrawal (when there is enough balance) or
 * deposit.
 */
public class Account {
    private int id;
    private double balance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }
}
