package package1;

public class BankAccount {

    private String ownerName;
    private double balance;
    private String email;

    public void sayHello() {
        System.out.println("Hello my name is"+ownerName);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        if(newBalance<1000)
          balance = newBalance;
        else {
            throw new RuntimeException("Invalid balance");
        }
    }
}
