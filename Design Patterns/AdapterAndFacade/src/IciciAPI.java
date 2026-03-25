public class IciciAPI {

    public int getBalance(BankAccount bankAccount) {
        System.out.println("ICICI: Balance is: "+bankAccount.getBalance());
        return bankAccount.getBalance();
    }

    public void pay(BankAccount account, int money) {
        System.out.println("ICICI: Sending money "+money+" from account "+ account.getHolderName());
    }
}
