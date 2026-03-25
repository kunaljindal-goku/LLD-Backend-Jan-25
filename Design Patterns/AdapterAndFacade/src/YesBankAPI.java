import java.util.AbstractCollection;

public class YesBankAPI {

    public int seeBalance(BankAccount bankAccount) {
        System.out.println("YES Bank: Balance is: "+bankAccount.getBalance());
        return bankAccount.getBalance();
    }

    public void sendMoney(BankAccount account, int money) {
        System.out.println("YEs Bank: Sending money "+money+" from account "+ account.getHolderName());
    }
}
