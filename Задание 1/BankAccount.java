import java.time.LocalDateTime;
import java.util.Random;
import java.util.Objects;

public class BankAccount {
    private String name;
    private double balance;
    private LocalDateTime opdate;
    private boolean state;

    public BankAccount(String name) {
        this.name = name;
        this.balance = 0;
        this.opdate = LocalDateTime.now();
        this.state = true;
    }

    public boolean deposit(double amount) {
        if (!state || amount <= 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (!state || amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public boolean transfer(BankAccount otherAccount, double amount) {
        if (!state || otherAccount == null || !otherAccount.state || 
            amount <= 0 || amount > balance) {
            return false;
        }
        this.balance -= amount;
        otherAccount.balance += amount;
        return true;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public LocalDateTime getOpdate() {
        return opdate;
    }

    public boolean getState() {
        return state;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
