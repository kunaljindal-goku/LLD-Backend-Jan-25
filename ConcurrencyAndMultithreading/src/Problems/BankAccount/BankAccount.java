package Problems.BankAccount;

public class BankAccount {
    private Long balance = 0L;

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public synchronized void deposit(Long amount){
            this.balance += amount;
    }

    public synchronized void withdraw(Long amount){
            this.balance -= amount;
    }
}
